package pl.wzorce.demo.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SingletonPatternTest {

    @Test
    public void getInstanceTest() {
        int hashCode = SingletonPattern.getInstance().hashCode();
        assertEquals(hashCode, SingletonPattern.getInstance().hashCode());
    }




}