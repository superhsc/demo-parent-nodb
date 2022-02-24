package sapce.imaya.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The application for the eureka server
 *
 * @author hsc
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	/**
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
