package pl.wzorce.demo.simpleFactory;

public class Parrot implements Animal{
    @Override
    public String getType() {
        return "bird";
    }

    @Override
    public String getEnvironment() {
        return "air";
    }

    @Override
    public String getColor() {
        return "green";
    }
}
