package org.example.version1;

//invoker
public class RemoteController {

    public static final int SLOTS = 5;
    private Command[] onSlots;
    private Command[] offSlots;

    public RemoteController() {
        setup();
    }

    private void setup() {
        onSlots = new Command[SLOTS];
        offSlots = new Command[SLOTS];

        initializeRemoteSlots();
    }

    private void initializeRemoteSlots() {
        for (int slot = 0; slot < SLOTS; slot++) {
            onSlots[slot] = new NoCommand();
            offSlots[slot] = new NoCommand();
        }
    }

    public void setCommand(int slots, Command onCommand, Command offCommand) {
        onSlots[slots] = onCommand;
        offSlots[slots] = offCommand;
    }

    public void pressOnButton(int slots) {
        onSlots[slots].execute();
    }

    public void pressOffButton(int slots) {
        offSlots[slots].execute();
    }
}
