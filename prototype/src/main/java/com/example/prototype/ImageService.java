package com.example.prototype;

import java.net.URL;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.awt.image.BufferedImage;
import java.util.Base64;

@Service
public class ImageService {

    public String fetchAndEncodeImage(String baseImage) throws Exception {
        URL url = new URL(baseImage);

        try(InputStream in = url.openStream()) {
            BufferedImage bufferImage = ImageIO.read(in);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferImage, "jpeg", baos);
            byte[] imageBytes = baos.toByteArray();

            return "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(imageBytes);
        }catch (Exception e){
                throw new RuntimeException("Bild konnte nicht geladen werden: " + e.getMessage());

            }
    }
    
}
