package com.fbiz.programowanie.sklepAPI;

public class KuponNotFoundException extends RuntimeException {
    KuponNotFoundException(Long id) {
        super("Nie znaleziono kuponu o numerze " + id);
    }
}
