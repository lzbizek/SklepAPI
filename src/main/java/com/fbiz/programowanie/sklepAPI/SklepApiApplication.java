package com.fbiz.programowanie.sklepAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SklepApiApplication {
	public static void main(String args[]) {
		SpringApplication.run(SklepApiApplication.class, args);
	}

/*
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... strings) throws Exception {

		log.info("Creating tables");

		jdbcTemplate.execute("DROP TABLE towary IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE towary (kod INTEGER, nazwa VARCHAR(255), cena DECIMAL(7,2));");


		// Uses JdbcTemplate's batchUpdate operation to bulk load data
		jdbcTemplate.batchUpdate(new String[]{"INSERT INTO towary(kod, nazwa, cena) VALUES (100, 'chleb',1.29)", "INSERT INTO towary(kod, nazwa, cena) VALUES (40, 'bulka',0.30)"});

		jdbcTemplate.query(
				"SELECT kod, nazwa, cena FROM towary WHERE nazwa = ?", new Object[] { "chleb" },
				(rs, rowNum) -> new Towar(rs.getLong("kod"), rs.getString("nazwa"), rs.getFloat("cena"))
		).forEach(customer -> log.info(customer.toString()));
	}
	*/
}
