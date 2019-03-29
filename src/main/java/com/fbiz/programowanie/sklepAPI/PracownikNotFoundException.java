package com.fbiz.programowanie.sklepAPI;

public class PracownikNotFoundException extends RuntimeException {
    PracownikNotFoundException(Long id) {
        super("Nie znaleziono pracownika o numerze identyfikacyjnym " + id);
    }
}
