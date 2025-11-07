package com.ebac.modulo61.Model;

import org.springframework.stereotype.Component;

@Component // esta anotación indica que es un bean de Spring
public class DataBaseModel {

    public String conectar() {
        return "Conexión establecida con la base de datos simulada";
    }

    public void mostrarInfo() {
        System.out.println("Simulando operación en base de datos...");
    }
}
