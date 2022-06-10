package fmi;

public class SantaClausApp {
    public static void main(String[] args) {

        Board board = new Board();
        SantaClaus santaClaus = SantaClaus.getInstance();
        ToyFactory mountainBikeFactory = new MountainBikeFactory();
        ToyFactory linenDollFactory = new LinenDollFactory();
        ToyProduct redBicycle = mountainBikeFactory.getProduct("RED_BICYCLE");
        ToyProduct redDoll = linenDollFactory.getProduct("RED_DOLL");
        Command iNeedBikesCommand = new INeedBikesCommand(board);
        Command iNeedDollsCommand = new INeedDollsCommand(board);

        Dwarf firstDwarf = new Dwarf("Dwarf Illidan");
        Dwarf secondDwarf = new Dwarf("Dwarf Ragnaros");
        Dwarf thirdDwarf = new Dwarf("Dwarf Onyxia");

        board.subscribe(firstDwarf);
        board.subscribe(secondDwarf);
        board.subscribe(thirdDwarf);

        System.out.println();

        santaClaus.setCommand(iNeedBikesCommand);
        santaClaus.coach();
        redBicycle.prepare();

        System.out.println();

        santaClaus.setCommand(iNeedDollsCommand);
        santaClaus.coach();
        redDoll.prepare();

        System.out.println();

        santaClaus.setCommand(iNeedBikesCommand);
        santaClaus.coach();
        redBicycle.prepare();
        System.out.println();
    }
}

