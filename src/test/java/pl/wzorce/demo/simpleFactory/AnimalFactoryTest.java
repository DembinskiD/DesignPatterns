package pl.wzorce.demo.simpleFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalFactoryTest {

    final static Logger logger = LogManager.getLogger(AnimalFactoryTest.class);

    @Test
    void getAnimal() {
        Animal animalDog = AnimalFactory.getAnimal("domestic");
        Animal animalParrot = AnimalFactory.getAnimal("air");
        logger.info(animalDog.getType());
        logger.info(animalParrot.getType());
        assertEquals(Dog.class, animalDog.getClass());
        assertEquals(Parrot.class, animalParrot.getClass());
    }
}