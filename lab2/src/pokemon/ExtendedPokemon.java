package main.pokemon;

import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ExtendedPokemon extends Pokemon {

    public ExtendedPokemon(
            String name,
            int level,
            Type[] types,
            double hp,
            double att,
            double def,
            double spAtt,
            double spDef,
            double speed
    ) {
        super(name, level);
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(types);
    }

    public Pokemon withMoves(Move[] moves) {
        this.setMove(moves);
        return this;
    }
}
