package com.ebac.modulo61.figuras;

import org.springframework.stereotype.Component;

@Component
public class Cuadrado implements Figura {

    private double lado = 5.0;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}