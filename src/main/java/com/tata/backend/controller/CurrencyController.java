package com.tata.backend.controller;

import com.tata.backend.dto.ExchangeRateDto;
import com.tata.backend.model.Currency;
import com.tata.backend.service.CurrencyService;
import com.tata.backend.util.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.Http_api)
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    protected final Logger logger = LogManager.getLogger(getClass());

    @GetMapping
    public Iterable<Currency> index() {
        logger.info("Mostrar lista de monedas");
        return currencyService.getCurrencies();
    }

    @PostMapping(value = Constants.Http_store, consumes = "application/json")
    public Currency store(@RequestBody Currency data) {
        logger.info("Registrar moneda");
        return currencyService.store(data);
    }

    @PostMapping(value = Constants.Http_update, consumes = "application/json")
    public Currency update(@RequestBody Currency data) {
        logger.info("Actualizar lista de monedas");
        return currencyService.update(data);
    }

    @GetMapping(value = Constants.Http_search)
    public ExchangeRateDto searchExchangeRate(
            @RequestParam(value = "monto",required = true) Double monto,
            @RequestParam(value = "moneda_origen",required = true) String moneda_origen,
            @RequestParam(value = "moneda_destino",required = true) String moneda_destino
    ) {
        logger.info("Consultar por tipo de cambio");
        return currencyService.searchExchangeRate(monto,moneda_origen,moneda_destino);
    }

}
