package com.example.prototype;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PrototypeController {

    
    private final ImageService imageService;


    public PrototypeController(ImageService imageService){
        this.imageService = imageService;
    }

    @RequestMapping("/api/compose")
    public ImageResponse imageResponse(@RequestBody ImageRequest request) {
        
        try {

            if(request.getWatermark() != null) {
                System.out.println("Watermark Source: " + request.getWatermark().getSource());
            }
            if(request.getOverlay() != null) {
                System.out.println("Overlay Source: " + request.getOverlay().getSource());
            }
            if(request.getOutput() != null) {
                System.out.println("Output Format: " + request.getOutput().isCreateThumbnail());
            }

            String base64Image = imageService.fetchAndEncodeImage(request.getBaseImage());
            System.out.println("Get Base64 Image: " + request.getBaseImage());
            return new ImageResponse(base64Image);

            } catch (Exception e){
                throw new RuntimeException("Bild konnte nicht abgerufen werden: " + e.getMessage());

            }

    } 

    
}
