package com.fbiz.programowanie.sklepAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(SklepApiApplication.class);
    @Bean
    CommandLineRunner initTowary(TowarRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Towar(100, "chleb", 1.99f)));
            log.info("Preloading " + repository.save(new Towar(140,"bulka kajzerka", 0.39f)));
            log.info("Preloading " + repository.save(new Towar(231,"pomidor kg", 16.00f)));
            log.info("Preloading " + repository.save(new Towar(232,"ogorek szklarn kg", 8.50f)));
            log.info("Preloading " + repository.save(new Towar(233,"ziemniak kg", 7.50f)));
            log.info("Preloading " + repository.save(new Towar(5009,"jogurt owocowy", 2.49f)));
        };
    }

    @Bean
    CommandLineRunner initPracownicy(PracownikRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Pracownik(11223344567L, "Magdalena","Kowalska", 1, 2450.40f)));
            log.info("Preloading " + repository.save(new Pracownik(55667788901L, "Monika","Nowak", 3, 3890f)));
            log.info("Preloading " + repository.save(new Pracownik(99001122345L, "Dawid","Nowak", 1, 2400f)));
        };
    }
}
