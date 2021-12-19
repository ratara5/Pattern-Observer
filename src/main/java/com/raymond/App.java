package com.raymond;

import com.raymond.observer.PesoARGObservador;
import com.raymond.observer.PesoMXObservador;
import com.raymond.observer.SolObservador;
import com.raymond.observer.Subject;

public class App {

    public static void main(String[] args) {
        Subject subj=new Subject();

        new SolObservador(subj);
        new PesoARGObservador(subj);
        new PesoMXObservador(subj);

        System.out.println("Si desea cambiar 10 dólares obtendrá: ");
        subj.setEstado(10);
        System.out.println("--------------------");
        System.out.println("Desea cambiar 100 dólares obtendrá: ");
        subj.setEstado(100);
    }
}
