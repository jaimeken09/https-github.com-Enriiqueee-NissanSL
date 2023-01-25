package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.CuadroMandos;
import com.iesam.nissansl.domain.models.CuadroMandos;
import com.iesam.nissansl.domain.models.Motor;
import com.iesam.nissansl.domain.models.Ruedas;

public class Main {
    public static void main(String[] args) {

        //Crear RuedasA
        Ruedas ruedasA = new Ruedas();
        ruedasA.setCodRueda(1);
        ruedasA.setMarca("Michelin");
        ruedasA.setModelo("Alpin 6");
        ruedasA.setDiametro("185");
        ruedasA.setUnidades("5");

        //Crear RuedasB
        Ruedas ruedasB = new Ruedas();
        ruedasB.setCodRueda(2);
        ruedasB.setMarca("Firestone");
        ruedasB.setModelo("WinterHawk");
        ruedasB.setDiametro("205");
        ruedasB.setUnidades("3");

        //Crear MotorA
        Motor motorA = new Motor();
        motorA.setCodMotor(1);
        motorA.setModelo("X6000");
        motorA.setCilindrada("2.0");
        motorA.setCaballos("120 cv");
        motorA.setUnidades("2");

        //Crear MotorB
        Motor motorB = new Motor();
        motorB.setCodMotor(2);
        motorB.setModelo("X9000");
        motorB.setCilindrada("2.4");
        motorB.setCaballos("160 cv");
        motorB.setUnidades("2");

        //Crear CuadroMandosA
        CuadroMandos cuadroMandoA = new CuadroMandos();
        cuadroMandoA.setCodigo(1);
        cuadroMandoA.setModelo("XT500");
        cuadroMandoA.setUnidades("4");

        //Crear CuadroMandosB
        CuadroMandos cuadroMandoB = new CuadroMandos();
        cuadroMandoB.setCodCuadro(2);
        cuadroMandoB.setModelo("DK320");
        cuadroMandoB.setUnidades("2");

        //Crear ChasisA
        Chasis chasisAAAA = new Chasis();
        chasisAAAA.setCodigo(1000);
        chasisAAAA.setMarca("Mercedes");
        chasisAAAA.setModelo("M500");
        chasisAAAA.setAccesorios(motorB);
        chasisAAAA.setAccesorios(ruedasA);
        chasisAAAA.setAccesorios(cuadroMandoA);

        //Crear ChasisB
        Chasis chasisBBBB = new Chasis();
        chasisBBBB.setCodigo(1001);
        chasisBBBB.setMarca("Renault");
        chasisBBBB.setModelo("TG12");
        chasisBBBB.setAccesorios(motorB);
        chasisBBBB.setAccesorios(ruedasB);
        chasisBBBB.setAccesorios(cuadroMandoB);

        //Crear ChasisC
        Chasis chasisCCCC = new Chasis();
        chasisCCCC.setCodigo(1002);
        chasisCCCC.setMarca("Audi");
        chasisCCCC.setModelo("FK800");
        chasisCCCC.setAccesorios(motorA);
        chasisCCCC.setAccesorios(ruedasA);
        chasisCCCC.setAccesorios(cuadroMandoA);

        //Crear ChasisD
        Chasis chasisDDDD = new Chasis();
        chasisDDDD.setCodigo(230);
        chasisDDDD.setMarca("Golf");
        chasisDDDD.setModelo("30M");
        chasisDDDD.setAccesorios(motorA);
        chasisDDDD.setAccesorios(ruedasA);
        chasisDDDD.setAccesorios(cuadroMandoB);

        ImprimirChasis imprimirChasis = new ImprimirChasis();
        imprimirChasis.imprimir(chasisAAAA );
        imprimirChasis.imprimir(chasisBBBB );
        imprimirChasis.imprimir(chasisCCCC );
        imprimirChasis.imprimir(chasisDDDD );

        MainSingleton mainSingleton = new MainSingleton();
        mainSingleton.main();

    }
}
