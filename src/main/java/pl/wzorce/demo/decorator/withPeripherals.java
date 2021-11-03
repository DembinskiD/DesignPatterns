package pl.wzorce.demo.decorator;

public class withPeripherals extends PersonalComputerDecorator{
    withPeripherals(PersonalComputerIfc pc) {
        super(pc);
    }

    @Override
    public String printSetup() {
        return super.printSetup() + " with peripherals";
    }
}
