package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


/*
Jugadores:
A
B
C

Juegos:
X(A, B)
Y(C, B)
Z(A, C)


* Juego implement Observable{
ListOf<IObserever>
cambiarPrecio()
promocion(){
    for(IObserver observer: observer){
        observer.update()
    }

}

}
* Tienda {
ListOf<Juego>
}
* Jugador implements IObserever{
    Name
    List<IObservable> games = ListOf(IObservable)
    addGame(observable IObservable){
        observable.addPlayer(this)
    }
    removeGame
}

* IObservable {
* addObserver(IObserever)
* removeObserver(IObserever)
notifyObservers()

* }
*
* IObserever {
    update(IObservable observable)
}
*
* */