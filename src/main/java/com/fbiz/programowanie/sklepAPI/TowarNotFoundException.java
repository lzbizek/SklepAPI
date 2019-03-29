package com.fbiz.programowanie.sklepAPI;

public class TowarNotFoundException extends RuntimeException {
    TowarNotFoundException(Long kod) {
        super("Nie znaleziono towaru o kodzie " + kod);
    }
}
