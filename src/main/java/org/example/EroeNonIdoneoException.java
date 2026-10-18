package org.example;

public class EroeNonIdoneoException extends Exception {
    String nome;
    int livello;

    public EroeNonIdoneoException(String nome, int livello) {
        this.nome = nome;
        this.livello = livello;
    }
}
