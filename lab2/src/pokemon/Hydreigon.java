package main.pokemon;

import ru.ifmo.se.pokemon.Type;

public class Hydreigon extends ExtendedPokemon {
    public Hydreigon(int level) {
        super(
                "Zweilous",
                level,
                new Type[]{
                        Type.DARK,
                        Type.DRAGON,
                },
                92,
                105,
                90,
                125,
                90,
                98
        );
    }
}
