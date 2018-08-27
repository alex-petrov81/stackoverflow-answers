package io.mindgames.oauth.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {

    /*private final String corsAllowedOrigins;

    public WebConfiguration(@Value("${cors.allowed.origins}") String corsAllowedOrigins) {
        this.corsAllowedOrigins = corsAllowedOrigins;
    }*/

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(MediaType.APPLICATION_JSON_UTF8);
    }

    /**
     * Enable @Valid validation exception handler for @PathVariable, @RequestParam and @RequestHeader.
     */
    @Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }

    /*@Override
    public void addCorsMappings(CorsRegistry registry) {
        String[] origins = {"*"};
        if (isNotEmpty(corsAllowedOrigins)) {
            origins = corsAllowedOrigins.split(",");
        }
        registry.addMapping("/**")
                .allowedOrigins(origins)
                .allowedMethods("*");
    }*/
}
