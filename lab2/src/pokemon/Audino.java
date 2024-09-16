package main.pokemon;

import ru.ifmo.se.pokemon.Type;

public class Audino extends ExtendedPokemon {

    public Audino(int level) {
        super(
                "Audino",
                level,
                new Type[] {Type.NORMAL},
                103,
                60,
                86,
                60,
                86,
                50
        );
    }
}
