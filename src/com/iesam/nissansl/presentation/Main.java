package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.CuadroMando;
import com.iesam.nissansl.domain.models.Motor;
import com.iesam.nissansl.domain.models.Ruedas;

public class Main {
    public static void main(String[] args) {

        Ruedas ruedasA = new Ruedas();
        ruedasA.setCodRueda(1);
        ruedasA.setMarca("Michelin");
        ruedasA.setModelo("Alpin");
        ruedasA.setDiametro("150");
        ruedasA.setUnidades("3");

        Ruedas ruedasB = new Ruedas();
        ruedasB.setCodRueda(2);
        ruedasB.setMarca("Firestone");
        ruedasB.setModelo("WinterHawk");
        ruedasB.setDiametro("205");
        ruedasB.setUnidades("3");

        Motor motorA = new Motor();
        motorA.setCod(1);
        motorA.setModelo("X6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("220 cv");
        motorA.setUnidades("1");

        Motor motorB = new Motor();
        motorB.setCod(2);
        motorB.setModelo("9999");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160 cv");
        motorB.setUnidades("2");

        CuadroMando cuadroMandoA = new CuadroMando();
        cuadroMandoA.setCodCuadro(1);
        cuadroMandoA.setModelo("Z32");
        cuadroMandoA.setUnidades("4");

        CuadroMando cuadroMandoB = new CuadroMando();
        cuadroMandoA.setCodCuadro(2);
        cuadroMandoA.setModelo("F23");
        cuadroMandoA.setUnidades("1");


        Chasis chasisAAAA = new Chasis();
        chasisAAAA.setCodigo(1000);
        chasisAAAA.setMarca("Porche");
        chasisAAAA.setModelo("Panamera");
        chasisAAAA.setAccesorios(motorB);
        chasisAAAA.setAccesorios(ruedasA);
        chasisAAAA.setAccesorios(cuadroMandoA);

        Chasis chasisBBBB = new Chasis();
        chasisBBBB.setCodigo(1001);
        chasisBBBB.setMarca("Renault");
        chasisBBBB.setModelo("Twingo");
        chasisBBBB.setAccesorios(motorB);
        chasisBBBB.setAccesorios(ruedasB);
        chasisBBBB.setAccesorios(cuadroMandoB);

        Chasis chasisCCCC = new Chasis();
        chasisCCCC.setCodigo(1002);
        chasisCCCC.setMarca("Mercedes");
        chasisCCCC.setModelo("Clase A");
        chasisCCCC.setAccesorios(motorA);
        chasisCCCC.setAccesorios(ruedasA);
        chasisCCCC.setAccesorios(cuadroMandoA);

        Chasis chasisDDDD = new Chasis();
        chasisDDDD.setCodigo(230);
        chasisDDDD.setMarca("Polo");
        chasisDDDD.setModelo("40M");
        chasisDDDD.setAccesorios(motorA);
        chasisDDDD.setAccesorios(ruedasA);
        chasisDDDD.setAccesorios(cuadroMandoB);

        ImprimirChasis imprimirChasis = new ImprimirChasis();
        imprimirChasis.imprimir(chasisAAAA );
        imprimirChasis.imprimir(chasisBBBB );
        imprimirChasis.imprimir(chasisCCCC );
        imprimirChasis.imprimir(chasisDDDD );
    }
}
