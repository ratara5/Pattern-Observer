package com.raymond.observer;

public class PesoARGObservador extends Observador {

    private double valorCambio=29.86;

    public PesoARGObservador(Subject subject) {
        this.subject=subject;
        this.subject.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("ARG: "+(subject.getEstado()*valorCambio));
    }
}

