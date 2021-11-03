package pl.wzorce.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Observable{
    private static List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers() {
        users.forEach(User::update);
    }
}
