package pl.wzorce.demo.observer;

public class User implements Observer {
    private int updates = 0;

    @Override
    public void update() {
        this.updates++;
    }

    public int getUpdates() {
        return updates;
    }
}
