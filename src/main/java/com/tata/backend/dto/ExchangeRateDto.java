package com.tata.backend.dto;

import lombok.Data;

@Data
public class ExchangeRateDto {

    private double monto;
    private double montoTipoCambio;

    private String monedaOrigen;
    private String nombreOrigen;
    private String monedaDestino;
    private String nombreDestino;

    private double tipoCambio;

}
