package com.ebac.modulo61.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebac.modulo61.Model.DataBaseModel;

@Service
public class ServiceAnnotation {

    @Autowired
    private DataBaseModel dataBaseModel;

    public void ejecutar() {
        System.out.println("Servicio con inyección por Anotación directa:");
        System.out.println(dataBaseModel.conectar());
    }
}