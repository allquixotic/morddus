package morddusui;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.sokangaming.morddus.system.Chr;
import com.sokangaming.morddus.system.Defs;
import com.sokangaming.morddus.system.Game;
import com.sokangaming.morddus.system.Player;
import com.sokangaming.morddus.system.Roller;
import com.sokangaming.morddus.system.TurnOrder;

class GameTest {

	@Test
	void testBasicAttackHit() { 
		Player p1 = new Player("Jace");
		Player p2 = new Player("Trem");
		Chr c1 = Chr.builder().player(p1).name("Caedmon").build();
		Chr c2 = Chr.builder().player(p2).name("Varyn").build();
		Roller r = new TestRoller(Lists.newArrayList(5, 9, 10, 3));
		ListMultimap<Integer, Chr> initiative = LinkedListMultimap.create();
		initiative.put(1, c1);
		initiative.put(2,  c2);
		Game g = Game.builder()
				.turnOrder(TurnOrder.DER)
				.roller(r)
				.defs(Defs.defaults())
				.initiative(initiative)
				.build();
		
		
	}

}
