package com.tata.backend.repository;

import com.tata.backend.dto.CurrencyInterface;
import com.tata.backend.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

    @Query(value = "SELECT \n" +
            "t0.CODIGO_DIVISA AS monedaOrigen, \n" +
            "t0.NOMBRE AS nombreOrigen, \n" +
            "t0.TIPO_CAMBIO AS tipoCambioOrigen, \n" +
            "t1.CODIGO_DIVISA AS monedaDestino, \n" +
            "t1.NOMBRE AS nombreDestino,\n" +
            "t1.TIPO_CAMBIO AS tipoCambioDestino\n" +
            " FROM CURRENCY t0 INNER JOIN currency t1", nativeQuery = true)
    List<CurrencyInterface> findAllCurrencies();

}

