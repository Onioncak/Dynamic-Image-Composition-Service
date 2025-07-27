package com.example.prototype;

public class ImageRequest {
    private String baseImage;

    private Overlay overlay;
    private Watermark watermark;
    private Output output;


    public String getBaseImage() {
        return baseImage;
    }

    public void setBaseImage(String baseImage){
        this.baseImage = baseImage;
    }
    
    public Overlay getOverlay() {
        return overlay;
    }

    public void setOverlay(Overlay overlay) {
        this.overlay = overlay;
    }

    public Watermark getWatermark() {
        return watermark;
    }

    public void setWatermark(Watermark watermark) {
        this.watermark = watermark;
    }

    public Output getOutput() {
        return output;
    }
    
    public void setOutput(Output output) {
        this.output = output;
    }
}
