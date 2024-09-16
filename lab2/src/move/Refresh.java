package main.move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;

public class Refresh extends StatusMove {
    public Refresh() {
        super(Type.NORMAL, 0.0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        switch (pokemon.getCondition()) {
            case BURN, PARALYZE, POISON:
                pokemon.setCondition(new Effect());
                break;
            default:
                break;
        }
    }
}
