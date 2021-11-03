package pl.wzorce.demo.factoryMethodPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {

    @Test
    public void testFactory() {
        AnimalFactory dogFactory = new MammalFactory();
        Animal dog = dogFactory.getAnimal("doG");
        assertEquals(Dog.class, dog.getClass());

        AnimalFactory pigeonFactory = new BirdFactory();
        Animal birdie = pigeonFactory.getAnimal("pigeon");
        assertEquals(Pigeon.class, birdie.getClass());
    }

}