package fmi;

public class Dwarf implements Observer {
    private Observable board;
    private Boolean isDoll;
    private final String nickName;

    public Dwarf(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public void update() {
        if (this.board == null) {
            System.out.println("No board to watch");
            return;
        }
        this.isDoll = this.board.getupdate();
        if (this.isDoll) {
            System.out.println(this.nickName + " is getting a doll!");
            return;
        }
        System.out.println(this.nickName + " is getting a bicycle!");
    }

    @Override
    public void setMagicBoard(Observable board) {
        this.board = board;
    }

}

