package main.move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends PhysicalMove {

    private final double selfDamageFactor;

    public WildCharge() {
        super(Type.ELECTRIC, 90.0, 1.0);
        this.selfDamageFactor = 0.25;
    }

    @Override
    protected void applySelfDamage(Pokemon var1, double var2) {
        var1.setMod(Stat.HP, (int) Math.round(var2 / selfDamageFactor));
    }
}
