package com.test.database.postgres.postgrestestcontainersdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ImportAutoConfiguration({
		DataSourceAutoConfiguration.class,
		FlywayAutoConfiguration.class,
		JdbcTemplateAutoConfiguration.class
})
class PostgresTestContainersDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
