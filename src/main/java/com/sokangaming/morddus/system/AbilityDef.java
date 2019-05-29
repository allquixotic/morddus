package com.sokangaming.morddus.system;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

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
public class AbilityDef {

	@NonNull private String name;
	@NonNull private AbilityType type;
	@NonNull private Consumer<Action> act;
	private List<CallingDef> allowedCallings;
	private Map<PatronDef, PatronRankDef> allowedClergy;
	private List<RankDef> allowedRanks;
	private Map<String, Boolean> requiredFlags;
}
