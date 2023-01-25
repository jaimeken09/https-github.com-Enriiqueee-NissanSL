package com.iesam.nissansl.presentation;

import com.iesam.nissansl.domain.models.Chasis;
import com.iesam.nissansl.domain.models.Ruedas;
import com.iesam.nissansl.domain.models.CuadroMando;
import com.iesam.nissansl.domain.models.Motor;

public class Main {
    public static void main(String[] args) {

        Ruedas ruedas1 = new Ruedas();
        ruedas1.setCodRueda(1);
        ruedas1.setMarca("Michelin");
        ruedas1.setModelo("Alpin");
        ruedas1.setDiametro("150");
        ruedas1.setUnidades("3");

        Ruedas ruedas2 = new Ruedas();
        ruedas2.setCodRueda(2);
        ruedas2.setMarca("Firestone");
        ruedas2.setModelo("WinterHawk");
        ruedas2.setDiametro("205");
        ruedas2.setUnidades("3");

        Motor motor1 = new Motor();
        motor1.setCod(1);
        motor1.setModelo("X6000");
        motor1.setCilindrada("2.1");
        motor1.setCaballos("220");
        motor1.setUnidades("1");

        Motor motor2 = new Motor();
        motor2.setCod(2);
        motor2.setModelo("9999");
        motor2.setCilindrada("2.4");
        motor2.setCaballos("160 cv");
        motor2.setUnidades("2");

        CuadroMando cuadroMando1 = new CuadroMando();
        cuadroMando1.setCodCuadro(1);
        cuadroMando1.setModelo("Z32");
        cuadroMando1.setUnidades("4");

        CuadroMando cuadroMando2 = new CuadroMando();
        cuadroMando2.setCodCuadro(2);
        cuadroMando2.setModelo("F23");
        cuadroMando2.setUnidades("1");


        Chasis chasisAAAA = new Chasis();
        chasisAAAA.setCodigo(1000);
        chasisAAAA.setMarca("Porche");
        chasisAAAA.setModelo("Panamera");
        chasisAAAA.setAccesorios(motor2);
        chasisAAAA.setAccesorios(ruedas1);
        chasisAAAA.setAccesorios(cuadroMando1);

        Chasis chasisBBBB = new Chasis();
        chasisBBBB.setCodigo(1001);
        chasisBBBB.setMarca("Renault");
        chasisBBBB.setModelo("Twingo");
        chasisBBBB.setAccesorios(motor1);
        chasisBBBB.setAccesorios(ruedas2);
        chasisBBBB.setAccesorios(cuadroMando2);

        Chasis chasisCCCC = new Chasis();
        chasisCCCC.setCodigo(1002);
        chasisCCCC.setMarca("Mercedes");
        chasisCCCC.setModelo("Clase A");
        chasisCCCC.setAccesorios(motor1);
        chasisCCCC.setAccesorios(ruedas2);
        chasisCCCC.setAccesorios(cuadroMando2);

        Chasis chasisDDDD = new Chasis();
        chasisDDDD.setCodigo(230);
        chasisDDDD.setMarca("Polo");
        chasisDDDD.setModelo("40M");
        chasisDDDD.setAccesorios(motor1);
        chasisDDDD.setAccesorios(ruedas1);
        chasisDDDD.setAccesorios(cuadroMando1);

        ImprimirChasis imprimirChasis = new ImprimirChasis();
        imprimirChasis.imprimir(chasisAAAA );
        imprimirChasis.imprimir(chasisBBBB );
        imprimirChasis.imprimir(chasisCCCC );
        imprimirChasis.imprimir(chasisDDDD );
    }
}
