package com.raymond.observer;

public class PesoMXObservador extends Observador {

    private double valorCambio=19.07;

    public PesoMXObservador(Subject subject) {
        this.subject=subject;
        this.subject.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("MX: "+(subject.getEstado()*valorCambio));
    }
}

