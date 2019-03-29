package com.fbiz.programowanie.sklepAPI;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KuponController {
    private final KuponRepository repository;

    public KuponController(KuponRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/kupon")
    List<Kupon> all() {
        return repository.findAll();
    }

    @GetMapping("/kupon/{id}")
    Kupon getKupon(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new KuponNotFoundException(id));
    }

    @PutMapping("/kupon/{id}")
    Kupon editKupon(@RequestBody Kupon nowyKupon, @PathVariable Long id) {

        return repository.findById(id)
                .map(kupon -> {
                    kupon.setCena(nowyKupon.getCena());
                    kupon.setIlosc(nowyKupon.getIlosc());
                    kupon.setKodTowaru(nowyKupon.getKodTowaru());

                    return repository.save(kupon);
                })
                .orElseGet(() -> {
                    nowyKupon.setId(id);
                    return repository.save(nowyKupon);
                });
    }

    @DeleteMapping("/kupon/{id}")
    void deleteKupon(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
