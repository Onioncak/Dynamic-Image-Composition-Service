package com.example.prototype;

public class ImageResponse {
    private String finalImageUrl;

    public ImageResponse(String finalImageUrl) {
        this.finalImageUrl = finalImageUrl;
    }

    public String getFinalImage() {
        return finalImageUrl;
    }

    public void setFinalImage(String finalImageUrl) {
        this.finalImageUrl = finalImageUrl;
    }

    
}
