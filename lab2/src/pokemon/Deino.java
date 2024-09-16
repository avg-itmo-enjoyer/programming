package main.pokemon;

import ru.ifmo.se.pokemon.Type;

public class Deino extends ExtendedPokemon {

    public Deino(int level) {
        super(
                "Deino",
                level,
                new Type[]{ Type.DARK, Type.DRAGON },
                52,
                65,
                50,
                45,
                50,
                38
        );
    }

}
