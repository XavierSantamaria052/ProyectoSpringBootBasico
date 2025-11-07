package com.ebac.modulo61.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebac.modulo61.Model.DataBaseModel;

@Service
public class ServiceConstructor {

    private final DataBaseModel dataBaseModel;

    // Inyección por constructor
    @Autowired
    public ServiceConstructor(DataBaseModel dataBaseModel) {
        this.dataBaseModel = dataBaseModel;
    }

    public void ejecutar() {
        System.out.println("Servicio con inyección por Constructor:");
        System.out.println(dataBaseModel.conectar());
    }
}