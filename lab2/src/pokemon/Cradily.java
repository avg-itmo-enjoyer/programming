package main.pokemon;

import ru.ifmo.se.pokemon.Type;

public class Cradily extends ExtendedPokemon {

    public Cradily(int level) {
        super(
                "Cradily",
                level,
                new Type[]{Type.ROCK, Type.GRASS},
                86,
                81,
                97,
                81,
                107,
                43
        );
    }
}
