package pl.wzorce.demo.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Furniture {
    private String color;
    private int height;
    private int width;
    private int depth;
    private String name;
    private String destiny;
    private String location;
    private boolean isKitchenFurniture;

    private Furniture(String color, int height, int width, int depth, String name, String destiny, String location, boolean isKitchenFurniture) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.name = name;
        this.destiny = destiny;
        this.location = location;
        this.isKitchenFurniture = isKitchenFurniture;
    }

    @Setter
    public static class Builder implements BuilderIfc {
        private String color;
        private int height;
        private int width;
        private int depth;
        private String name;
        private String destiny;
        private String location;
        private boolean isKitchenFurniture;

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWidth(int width) {
            this.width = width;
            return this;
        }

        public Builder setDepth(int depth) {
            this.depth = depth;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDestiny(String destiny) {
            this.destiny = destiny;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setKitchenFurniture(boolean kitchenFurniture) {
            isKitchenFurniture = kitchenFurniture;
            return this;
        }

        @Override
        public Furniture build() {
            return new Furniture(this.color,
                    this.height,
                    this.width,
                    this.depth,
                    this.name,
                    this.destiny,
                    this.location,
                    this.isKitchenFurniture);
        }
    }
}

