package com.example.prototype;


public class Overlay {
    private String source;
    private Position position;
    private Transformation transformation;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Transformation getTransformation() {
        return transformation;
    }

    public void setTransformation(Transformation transformation) {
        this.transformation = transformation;
    } 

    public static class Position {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static class Transformation {
        private double scale;
        private double rotation;

        public double getScale() {
            return scale;
        }
        public void setScale(double scale) {
            this.scale = scale;
        }
        public double getRotation() {
            return rotation;
        }
        public void setRotation(double rotation) {
            this.rotation = rotation;
        }
    }
}
