package com.ebac.modulo61.figuras;


import org.springframework.stereotype.Component;

@Component
public class Circulo implements Figura {

    private double radio = 3.0;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
