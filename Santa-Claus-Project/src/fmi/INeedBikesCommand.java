package fmi;

public class INeedBikesCommand implements Command {

    private Board board;

    public INeedBikesCommand(Board board) {
        this.board = board;
    }

    @Override
    public void execute() {
        System.out.println("Santa Claus: I need bicycles!");
        this.board.getBikes();

    }

    @Override
    public void undo() {
        this.board.getDolls();
    }
}

