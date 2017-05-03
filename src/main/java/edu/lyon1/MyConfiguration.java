package edu.lyon1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

  @Bean
  public String nom() {
    return "Simpson";
  }

  @Bean
  public String prenom() {
    return "Homer";
  }
}
