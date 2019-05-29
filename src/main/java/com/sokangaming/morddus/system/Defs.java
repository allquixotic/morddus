package com.sokangaming.morddus.system;

import java.util.List;

import com.sokangaming.morddus.system.defs.Abilities;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.Accessors;

@Value @Builder @Accessors(fluent=true)
public class Defs {
	@NonNull List<AbilityDef> abilities;
	@NonNull List<CallingDef> callings;
	@NonNull List<PatronDef> patrons;
	@NonNull List<PatronRankDef> patronRanks;
	@NonNull List<RankDef> ranks;
	
	public static final Defs builtin = Defs.builder()
			.abilities(Abilities.defaults())
			.build();
	
	public static Defs defaults() {
		return builtin;
	}
}
