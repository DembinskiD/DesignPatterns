package pl.wzorce.demo.factoryMethodPattern;

public class BirdFactory implements AnimalFactory {
    @Override
    public Animal getAnimal(String name) {
        return name.equalsIgnoreCase("parrot") ? new Parrot() : new Pigeon();
    }
}
