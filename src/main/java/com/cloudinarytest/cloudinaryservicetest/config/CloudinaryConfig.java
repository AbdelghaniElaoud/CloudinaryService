package com.cloudinarytest.cloudinaryservicetest.config;

import com.cloudinary.Cloudinary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {


    private final String CLOUD_NAME = "did7uh4lm";

    private final String API_KEY = "266942332738569";

    private final String API_SECRET = "ENabwaPRsPuaz1SjEspN-QjmdMg";

    public CloudinaryConfig() {
    }

    @Bean
    public Cloudinary cloudinary(){
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name",CLOUD_NAME);
        config.put("api_key",API_KEY);
        config.put("api_secret",API_SECRET);
        return new Cloudinary(config);
    }
}