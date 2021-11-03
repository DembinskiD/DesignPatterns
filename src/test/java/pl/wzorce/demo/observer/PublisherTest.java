package pl.wzorce.demo.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublisherTest {

    @Test
    void testObserver() {
        User user = new User();
        User user2 = new User();

        Publisher publisher = new Publisher();

        publisher.addUser(user);
        publisher.addUser(user2);
        assertEquals(0, user.getUpdates());
        assertEquals(0, user2.getUpdates());
        publisher.notifyUsers();
        assertEquals(1, user.getUpdates());
        assertEquals(1, user2.getUpdates());
    }
}