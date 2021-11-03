package pl.wzorce.demo.simpleFactory;

import lombok.Data;

@Data
public class Dog implements Animal{
    @Override
    public String getType() {
        return "mammal";
    }

    @Override
    public String getEnvironment() {
        return "domestic";
    }

    @Override
    public String getColor() {
        return "brown";
    }
}
