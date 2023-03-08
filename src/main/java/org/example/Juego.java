package org.example;

import org.example.interfaces.*;

import java.util.ArrayList;

public class Juego implements IObservable {
    private String name;
    private double precio;
    private ArrayList<IObserver> players;

    Juego(String name){
        this.name = name;
    }
    public void cambiarPrecio(double precio){
        this.precio = precio;
        notifyObservers("cambio el precio a " + precio);
    }
    public void promocion(double disccount){
        this.precio = precio*(100-disccount)/100;
        notifyObservers("promocion de " + disccount + "%");
    }

    @Override
    public void addObserver(IObserver observer) {
        players.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        players.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver player: players){
            player.update(this, message);
        }
    }

    @Override
    public String toString(){
        return name;
    }
}
