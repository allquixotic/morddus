package com.sokangaming.morddus.system;

import java.util.Map;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.Accessors;

@Value @Builder @Accessors(fluent=true)
public class AttackRoll {

	@NonNull Chr source;
	int sourceRoll;
	@NonNull Map<Chr, Integer> targetRolls;
	
	public boolean success() {
		return sourceRoll > targetRolls.values().stream().findFirst().orElse(0);
	}
}
