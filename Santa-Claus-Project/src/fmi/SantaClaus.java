package fmi;

public class SantaClaus {

    private static SantaClaus instance;
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    private SantaClaus() {
    }

    public static SantaClaus getInstance() {
        if (instance == null) {
            instance = new SantaClaus();
        }
        return instance;
    }

    public void coach() {
        if (this.command == null) {
            System.out.println("No command set");
            return;
        }
        command.execute();
    }
}

