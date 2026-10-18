package org.example;

import net.datafaker.Faker;
import java.util.Random;

public class Reclutatore {
    Faker faker = new Faker();
    Random random = new Random();

    public void recluta(int difficolta) throws EroeNonIdoneoException {
        String nome = faker.superhero().name();
        int potere = random.nextInt(100) + 1;

        System.out.println("Eroe: " + nome);
        System.out.println("Potere: " + potere);

        if (potere < difficolta) {
            throw new EroeNonIdoneoException(nome, potere);
        }

        System.out.println("Eroe reclutato!");
    }
}
