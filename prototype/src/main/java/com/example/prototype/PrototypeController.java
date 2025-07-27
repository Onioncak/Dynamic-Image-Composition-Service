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

            String base64Image = imageService.fetchAndEncodeImage(request.getBaseImage());
            System.out.println("Get Base64 Image: " + request.getBaseImage());
            return new ImageResponse(base64Image);

            } catch (Exception e){
                throw new RuntimeException("Bild konnte nicht abgerufen werden: " + e.getMessage());

            }

    } 

    
}
