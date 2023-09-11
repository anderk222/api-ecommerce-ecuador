package tocayos.apiecommerceecuador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class,
MongoAutoConfiguration.class,
MongoDataAutoConfiguration.class
}
)
public class ApiEcommerceEcuadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEcommerceEcuadorApplication.class, args);
	}

}