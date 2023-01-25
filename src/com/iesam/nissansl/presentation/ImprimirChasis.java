package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.Ruedas;

public class ImprimirChasis {

    public void imprimir(Chasis chasis){

        System.out.println("coche: " +chasis.getCodigo() +" / " +chasis.getMarca() +" / " +chasis.getModelo());
        System.out.println("Ruedas: " +chasis.getAccesorios().getCod());
        System.out.println("CuadroMando: " +chasis.getAccesorios().getCod());
        System.out.println("Motor: " +chasis.getAccesorios().getCod());
    }
}