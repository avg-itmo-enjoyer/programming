package main.move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.util.Arrays;

public class AncientPower extends SpecialMove {

    private final double statRaiseChance;

    public AncientPower() {
        super(Type.ROCK, 60, 100);
        statRaiseChance = 0.1;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= statRaiseChance) {
            Arrays.stream(Stat.values())
                    .forEach(it -> {
                        int mult = it == Stat.HP ? -1 : 1;
                        pokemon.setMod(it, mult);
                    });
        }
    }
}
