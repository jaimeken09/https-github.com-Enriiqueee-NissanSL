package com.iesam.nissansl.presentation;

import com.iesam.nissansl.data.ChasisDataStore;
import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.Ruedas;
import com.iesam.nissansl.domain.models.CuadroMando;
import com.iesam.nissansl.domain.models.Motor;
import com.iesam.nissansl.domain.usercase.CrearChasis;

public class Main {
    public static void main(String[] args) {

        Ruedas ruedaA = new Ruedas();
        ruedaA.setCodRueda(1);
        ruedaA.setMarca("Michelin");
        ruedaA.setModelo("Alpin");
        ruedaA.setDiametro("185");
        ruedaA.setUnidades("6");

        Ruedas ruedaB = new Ruedas();
        ruedaB.setCodRueda(2);
        ruedaB.setMarca("Firestone");
        ruedaB.setModelo("WinterHawk");
        ruedaB.setDiametro("205");
        ruedaB.setUnidades("3");

        Motor motorA = new Motor();
        motorA.setCod(1);
        motorA.setModelo("X6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("120 cv");
        motorA.setUnidades("1");

        Motor motorB = new Motor();
        motorB.setCod(2);
        motorB.setModelo("X900");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160 cv");
        motorB.setUnidades("2");

        CuadroMando cuadroMandoA = new CuadroMando();
        cuadroMandoA.setCodCuadro(1);
        cuadroMandoA.setModelo("LM200");
        cuadroMandoA.setUnidades("4");

        CuadroMando cuadroMandoB = new CuadroMando();
        cuadroMandoB.setCodCuadro(2);
        cuadroMandoB.setModelo("LM600");
        cuadroMandoB.setUnidades("1");


        Chasis chasisAAAA = new Chasis();
        chasisAAAA.setCodigo(1000);
        chasisAAAA.setMarca("Porche");
        chasisAAAA.setModelo("Panamera");
        chasisAAAA.setAccesorios(motorB);
        chasisAAAA.setAccesorios(ruedaA);
        chasisAAAA.setAccesorios(cuadroMandoA);

        Chasis chasisBBBB = new Chasis();
        chasisBBBB.setCodigo(1001);
        chasisBBBB.setMarca("Renault");
        chasisBBBB.setModelo("Twingo");
        chasisBBBB.setAccesorios(motorB);
        chasisBBBB.setAccesorios(ruedaB);
        chasisBBBB.setAccesorios(cuadroMandoB);

        Chasis chasisCCCC = new Chasis();
        chasisCCCC.setCodigo(1002);
        chasisCCCC.setMarca("Mercedes");
        chasisCCCC.setModelo("Clase A");
        chasisCCCC.setAccesorios(motorA);
        chasisCCCC.setAccesorios(ruedaA);
        chasisCCCC.setAccesorios(cuadroMandoA);

        Chasis chasisDDDD = new Chasis();
        chasisDDDD.setCodigo(230);
        chasisDDDD.setMarca("Polo");
        chasisDDDD.setModelo("40M");
        chasisDDDD.setAccesorios(motorA);
        chasisDDDD.setAccesorios(ruedaA);
        chasisDDDD.setAccesorios(cuadroMandoB);

        CrearChasis crearChasis = new CrearChasis();
        crearChasis.execute(chasisAAAA);
        crearChasis.execute(chasisBBBB);
        crearChasis.execute(chasisCCCC);
        crearChasis.execute(chasisDDDD);

        ImprimirChasis imprimirChasis = new ImprimirChasis();
        imprimirChasis.imprimir(chasisAAAA );
        imprimirChasis.imprimir(chasisBBBB );
        imprimirChasis.imprimir(chasisCCCC );
        imprimirChasis.imprimir(chasisDDDD );
    }
}
