package com.sokangaming.morddus.system.defs;

import java.util.List;

import com.google.common.collect.Lists;
import com.sokangaming.morddus.system.AbilityDef;
import com.sokangaming.morddus.system.AbilityType;
import com.sokangaming.morddus.system.AttackRoll;
import com.sokangaming.morddus.system.Chr;
import com.sokangaming.morddus.system.RuleException;

public class Abilities {

	public static List<AbilityDef> defaults() {
		return Lists.newArrayList(
				AbilityDef.builder().name("Basic Attack").type(AbilityType.ACTIVE).act((ion) -> {
					if(ion.targets().size() != 1) {
						throw new RuleException();
					}
					Chr target = ion.targets().keySet().iterator().next();
					AttackRoll ar = ion.game().attackRoll(ion.source(), Lists.newArrayList(target));
					
				}).build()
				);
	}
}
