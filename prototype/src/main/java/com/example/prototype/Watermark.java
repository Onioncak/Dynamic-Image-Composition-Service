package com.example.prototype;

public class Watermark {

    private String source;
    private String position;
    private int padding;
    private double opacity;

    public Watermark(String source, String position, int padding, double opacity) {
        this.source = source;
        this.position = position;
        this.padding = padding;
        this.opacity = opacity;
    }


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    public double getOpacity() {
        return opacity;
    }
    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }
}
