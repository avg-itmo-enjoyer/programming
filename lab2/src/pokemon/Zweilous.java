package main.pokemon;

import ru.ifmo.se.pokemon.Type;

public class Zweilous extends ExtendedPokemon {
    public Zweilous(int level) {
        super(
                "Zweilous",
                level,
                new Type[]{
                        Type.DARK,
                        Type.DRAGON,
                },
                72,
                85,
                70,
                65,
                70,
                58
        );
    }
}
