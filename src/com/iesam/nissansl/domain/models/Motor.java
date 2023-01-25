package com.iesam.nissansl.domain.models;


public class Motor implements Accesorios {

    private Integer cod;
    private String modelo;
    private String cilindrada;
    private String caballos;

    private String unidades;


    @Override
    public Integer getCod() {
        return cod;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getUnidades() {
        return unidades;
    }


    public Integer getCodMotor() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCaballos() {
        return caballos;
    }

    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }

    public void setUnidades(String unidades) { this.unidades = unidades;}

}