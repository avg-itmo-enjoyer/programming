package main.move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleHit extends PhysicalMove {
    public DoubleHit() {
        super(Type.NORMAL, 35, 0.9, 0, 1);
    }
}
