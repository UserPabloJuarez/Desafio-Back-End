package com.tata.backend.service;

import com.tata.backend.dto.ExchangeRateDto;
import com.tata.backend.model.Currency;

import java.util.List;

public interface CurrencyService {

    public List<Currency> getCurrencies();
    public Currency store(Currency currency);
    public Currency update(Currency currency);
    public ExchangeRateDto searchExchangeRate(Double monto, String moneda_origen, String moneda_destino);

}
