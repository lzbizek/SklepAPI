package com.fbiz.programowanie.sklepAPI;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TowarController {
    private final TowarRepository repository;

    public TowarController(TowarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/towar")
    List<Towar> all() {
        return repository.findAll();
    }

    @GetMapping("/towar/{kod}")
    Towar getTowar(@PathVariable Long kod) {

        return repository.findById(kod)
                .orElseThrow(() -> new TowarNotFoundException(kod));
    }

    @PutMapping("/towar/{kod}")
    Towar editTowar(@RequestBody Towar nowyTowar, @PathVariable Long kod) {

        return repository.findById(kod)
                .map(towar -> {
                    towar.setKod(nowyTowar.getKod());
                    towar.setCena(nowyTowar.getCena());
                    towar.setNazwa(nowyTowar.getNazwa());
                    return repository.save(towar);
                })
                .orElseGet(() -> {
                    nowyTowar.setKod(kod);
                    return repository.save(nowyTowar);
                });
    }

    @DeleteMapping("/towar/{kod}")
    void deleteTowar(@PathVariable Long kod) {
        repository.deleteById(kod);
    }
}