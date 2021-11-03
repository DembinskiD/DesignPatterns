package pl.wzorce.demo.singleton;

import lombok.Data;

@Data
public class SingletonPattern {

    private static SingletonPattern INSTANCE;

    public static SingletonPattern getInstance() {
         return INSTANCE == null ? new SingletonPattern() : INSTANCE;
    }

    private SingletonPattern() {
    }

}
