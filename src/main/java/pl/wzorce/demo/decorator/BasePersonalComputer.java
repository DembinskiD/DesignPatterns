package pl.wzorce.demo.decorator;

public class BasePersonalComputer implements PersonalComputerIfc {
    final String description = "Base setup";
    @Override
    public String printSetup() {
        return description;
    }
}
