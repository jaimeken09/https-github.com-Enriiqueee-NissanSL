package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.Ruedas;

public class ImprimirChasis {

    public void imprimir(Chasis chasis){

        System.out.println("Numero de bastidor: " +chasis.getCodigo() +" | " +chasis.getMarca() +" | " +chasis.getModelo());
        System.out.println("Ruedas: " +chasis.getAccesorios().getCodigo());
        System.out.println("Motor: " +chasis.getAccesorios().getCodigo());
        System.out.println("CuadroMando: " +chasis.getAccesorios().getCodigo());
        System.out.println("--------------------------------------------------------------------------------------------------------------- \n");
    }
}