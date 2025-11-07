package com.ebac.modulo61.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebac.modulo61.Model.DataBaseModel;

@Service
public class ServiceSetter {

    private DataBaseModel dataBaseModel;

    @Autowired
    public void setDataBaseModel(DataBaseModel dataBaseModel) {
        this.dataBaseModel = dataBaseModel;
    }

    public void ejecutar() {
        System.out.println("Servicio con inyección por Setter:");
        System.out.println(dataBaseModel.conectar());
    }
}
