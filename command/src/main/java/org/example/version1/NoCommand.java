package org.example.version1;

public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("No Command has been set yet.");
    }
}
