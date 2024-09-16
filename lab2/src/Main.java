package main;

import main.move.*;
import main.pokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
  public static void main(String[] args) {
	  Pokemon audino = new Audino(40).withMoves(
			  new Move[]{
					  new Refresh(),
					  new HyperVoice(),
					  new WildCharge(),
					  new Rest(),
			  }
	  );
	  Pokemon lileep = new Lileep(40).withMoves(
			  new Move[] {
					  new AncientPower(),
					  new ConfuseRay(),
					  new Constrict(),
			  }
	  );
	  Pokemon cradily = new Cradily(50).withMoves(
			  new Move[] {
					  new AncientPower(),
					  new ConfuseRay(),
					  new Constrict(),
					  new StoneEdge(),
			  }
	  );

	  Pokemon deino = new Deino(40).withMoves(
			  new Move[] {
					  new Slam(),
					  new FocusEnergy(),
			  }
	  );
	  Pokemon zweilous = new Zweilous(50).withMoves(
			  new Move[] {
					  new Slam(),
					  new FocusEnergy(),
					  new DoubleHit(),
			  }
	  );
	  Pokemon hydreigon = new Hydreigon(64).withMoves(
			  new Move[] {
					  new Slam(),
					  new FocusEnergy(),
					  new DoubleHit(),
					  new DragonPulse(),
			  }
	  );

	  Battle battle = new Battle();
	  battle.addAlly(audino);
	  battle.addAlly(lileep);
	  battle.addAlly(cradily);
	  battle.addFoe(deino);
	  battle.addFoe(zweilous);
	  battle.addFoe(hydreigon);

	  battle.go();
  }
}
