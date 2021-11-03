package pl.wzorce.demo.decorator;

public abstract class PersonalComputerDecorator implements PersonalComputerIfc {
    private PersonalComputerIfc pc;

    PersonalComputerDecorator(PersonalComputerIfc pc) {
        this.pc = pc;
    }

    @Override
    public String printSetup() {
        return pc.printSetup();
    }
}
