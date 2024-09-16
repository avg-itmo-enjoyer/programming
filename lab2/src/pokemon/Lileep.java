package main.pokemon;

import ru.ifmo.se.pokemon.Type;

public class Lileep extends ExtendedPokemon {
    public Lileep(int level) {
        super(
                "Lileep",
                level,
                new Type[] {Type.ROCK, Type.GRASS},
                66,
                41,
                77,
                61,
                87,
                23
        );
    }
}
