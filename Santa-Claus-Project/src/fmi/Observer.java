package fmi;

public interface Observer {
    void update();

    void setMagicBoard(Observable board);
}
