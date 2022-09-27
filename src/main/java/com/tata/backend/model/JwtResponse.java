package com.tata.backend.model;

import java.io.Serializable;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        log.info("Prueba 6: {} ",jwttoken);
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}
