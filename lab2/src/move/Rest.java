package main.move;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0.0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
        pokemon.setCondition(
                new Effect().turns(2).condition(Status.SLEEP)
        );
    }
}
