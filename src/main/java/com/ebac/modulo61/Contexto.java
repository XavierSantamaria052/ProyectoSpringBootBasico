package com.ebac.modulo61;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ebac.modulo61.figuras.Circulo;
import com.ebac.modulo61.figuras.Cuadrado;
import com.ebac.modulo61.service.ServiceAnnotation;
import com.ebac.modulo61.service.ServiceConstructor;
import com.ebac.modulo61.service.ServiceSetter;

@Component
public class Contexto {

    @Autowired
    private ServiceConstructor serviceConstructor;

    @Autowired
    private ServiceSetter serviceSetter;

    @Autowired
    private ServiceAnnotation serviceAnnotation;

    @Autowired
    private Cuadrado cuadrado;

    @Autowired
    private Circulo circulo;

    public void ejecutar() {
        System.out.println("\n=== Ejecutando servicios ===");
        serviceConstructor.ejecutar();
        serviceSetter.ejecutar();
        serviceAnnotation.ejecutar();

        System.out.println("\n=== Cálculo de figuras ===");
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}