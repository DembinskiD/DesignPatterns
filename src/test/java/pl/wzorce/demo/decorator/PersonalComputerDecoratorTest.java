package pl.wzorce.demo.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalComputerDecoratorTest {

    @Test
    public void testDecorator() {
        PersonalComputerIfc pc = new withGraphicCard(new BasePersonalComputer());
        assertEquals("Base setup with graphic card", pc.printSetup());
        assertEquals("Base setup with graphic card with peripherals", new withPeripherals(pc).printSetup());
    }

}