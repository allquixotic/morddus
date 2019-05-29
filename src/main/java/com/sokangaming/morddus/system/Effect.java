package com.sokangaming.morddus.system;

import java.util.Map;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.Accessors;
import lombok.experimental.NonFinal;

@Value @Builder @Accessors(fluent=true)
public class Effect {

	@NonNull AbilityDef fromAbility;
	Map<ResourceType, Integer> deltas;
	@NonFinal int remainingRounds = 0;
}
