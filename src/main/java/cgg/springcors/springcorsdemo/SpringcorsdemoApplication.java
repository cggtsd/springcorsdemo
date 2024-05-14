package cgg.springcors.springcorsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcorsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcorsdemoApplication.class, args);
	}

	// @Bean
	// WebMvcConfigurer configurer(){
    //   return new WebMvcConfigurer() {
	// 	public void addCorsMappings(CorsRegistry registry){
    //       registry.addMapping("/*").allowedOrigins("http://localhost:9090");
	// 	}
	//   };
	// }

}
