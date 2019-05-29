package com.sokangaming.morddus.system;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Accessors(fluent=true)
public class Game {

	private TurnOrder turnOrder;
	private final ListMultimap<String, Chr> participants = LinkedListMultimap.create(); 
	private final ListMultimap<Integer, Chr> initiative;
	@NonNull private Defs defs;
	@NonNull private Roller roller;
	
	
	public AttackRoll attackRoll(Chr source, List<Chr> targets) {
		Map<Chr, Integer> targetRolls = new LinkedHashMap<>();
		targets.forEach((c) -> targetRolls.put(c, roller.d(10)));
		return AttackRoll.builder().source(source).sourceRoll(roller.d(10)).targetRolls(targetRolls).build();
	}
}
