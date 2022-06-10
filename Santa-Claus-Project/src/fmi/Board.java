package fmi;

import java.util.ArrayList;
import java.util.List;

public class Board implements Observable {

    private Boolean isDoll;

    private List<Observer> dwarfs;

    public Board() {
        this.dwarfs = new ArrayList<>();
    }

    public void getDolls() {
        System.out.println("Magic board: Dolls");
        this.isDoll = true;
        this.notifyObservers();
    }

    public void getBikes() {
        System.out.println("Magic board: Bicycles");
        this.isDoll = false;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.dwarfs.add(observer);
        observer.setMagicBoard(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.dwarfs.remove(observer);
        observer.setMagicBoard(null);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.dwarfs) {
            observer.update();
        }
    }

    @Override
    public Boolean getupdate() {
        return this.isDoll;
    }
}
