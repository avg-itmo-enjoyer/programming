package main.move;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {

    public StoneEdge() {
        super(Type.ROCK, 100.0, 0.8);
    }

    //Lucky strike algo
    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        double firstTry = super.calcCriticalHit(pokemon, pokemon1);
        return  firstTry == 1.0 ? super.calcCriticalHit(pokemon, pokemon1) : firstTry;
    }
}

