package pl.wzorce.demo.decorator;

public class withGraphicCard extends PersonalComputerDecorator{

    public withGraphicCard(PersonalComputerIfc personalComputerIfc) {
        super(personalComputerIfc);
    }

    @Override
    public String printSetup() {
        return super.printSetup() + " with graphic card";
    }
}
