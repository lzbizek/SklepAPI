package com.fbiz.programowanie.sklepAPI;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PracownikController {
    private final PracownikRepository repository;

    public PracownikController(PracownikRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/pracownik")
    List<Pracownik> all() {
        return repository.findAll();
    }

    @GetMapping("/pracownik/{id}")
    Pracownik getPracownik(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new PracownikNotFoundException(id));
    }

    @PutMapping("/pracownik/{id}")
    Pracownik editTowar(@RequestBody Pracownik nowyPracownik, @PathVariable Long id) {

        return repository.findById(id)
                .map(pracownik -> {
                        pracownik.setPesel(nowyPracownik.getPesel());
                        pracownik.setImie(nowyPracownik.getImie());
                        pracownik.setNazwisko(nowyPracownik.getNazwisko());
                        pracownik.setPoziomUprawnien(nowyPracownik.getPoziomUprawnien());
                        pracownik.setWynagrodzenie(nowyPracownik.getWynagrodzenie());

                    return repository.save(pracownik);
                })
                .orElseGet(() -> {
                    nowyPracownik.setId(id);
                    return repository.save(nowyPracownik);
                });
    }

    @DeleteMapping("/pracownik/{id}")
    void deleteTowar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
