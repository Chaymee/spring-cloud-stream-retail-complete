package completeretail.ordercreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.function.Supplier;
import java.util.function.Consumer;



@SpringBootApplication
public class OrderCreationApplication {

	private static final Logger log = LoggerFactory.getLogger(OrderCreationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OrderCreationApplication.class, args
		);
	}
	/*
	 * Basic Supplier which sends messages every X milliseconds
	 * Configurable using spring.cloud.stream.poller.fixed-delay
	 */
	@Bean
	public Supplier<String> publishOrder() {
		return () -> {
			log.info("Emitting " + "hello world");
			return "hello world";
		};
	}
	@Bean
	public Consumer<String> emitSensorReading() {
		return System.out::println;
	}
}
