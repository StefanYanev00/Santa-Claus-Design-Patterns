package fmi;

public class INeedDollsCommand implements Command {

    private Board board;

    public INeedDollsCommand(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        System.out.println("Santa Claus: I need dolls!");
        this.board.getDolls();


    }

    @Override
    public void undo() {
        this.board.getBikes();
    }
}
