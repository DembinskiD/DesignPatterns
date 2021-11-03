package pl.wzorce.demo.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureTest {

    @Test
    void testBuilder() {
        Furniture testedFurniture = new Furniture.Builder()
                .setKitchenFurniture(true)
                .setColor("blue")
                .setDepth(20)
                .build();

        assertEquals(20, testedFurniture.getDepth());
        assertEquals("blue", testedFurniture.getColor());
        assertNull(testedFurniture.getLocation());
        assertNull(testedFurniture.getName());
    }

}