package org.example;

import org.example.interfaces.IObservable;
import org.example.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Player implements IObserver {
    private String name;
    @Override
    public void update(IObservable observable, String message) {
        System.out.printf("Hello %s", name);
    }

    List<IObservable> games = new ArrayList<>();
    //Adds a game into player's list game and then adds the player into the
    void addGame(IObservable observable){
        games.add(observable);
        observable.addObserver(this);
    }
    void removeGame(IObservable observable){
        games.remove(observable);
        observable.removeObserver(this);
    }
}
