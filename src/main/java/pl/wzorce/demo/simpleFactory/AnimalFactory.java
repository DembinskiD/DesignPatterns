package pl.wzorce.demo.simpleFactory;

public class AnimalFactory {

    public static Animal getAnimal(String environment) {
        return environment.equals("air") ? new Parrot() : new Dog();
    }
}
