package pl.wzorce.demo.factoryMethodPattern;

public class MammalFactory implements AnimalFactory {
    @Override
    public Animal getAnimal(String name) {
        return name.equalsIgnoreCase("dog") ? new Dog() : new Cat();
    }
}
