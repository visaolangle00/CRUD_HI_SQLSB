package mtv.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@EnableJpaRepositories("mtv.xyz.repositories")
public class CrudHiFptSqlsbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudHiFptSqlsbApplication.class, args);
	}

}
