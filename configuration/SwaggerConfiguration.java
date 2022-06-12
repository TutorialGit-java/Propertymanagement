package com.mycompany.propertymanagement.configuration;

import org.springframework.context.annotation.Bean;

public class SwaggerConfiguration<Docket>    // implements WebMvcConfiguere
{
   /* @Bean
    public Docket appAPi(){

        Object DocumentationType;
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.mycompany.propertymanagement.controller"))
                .paths((PathSelectors.regex("/.*")))
                .build();
        return docket;
    }
*/
}
