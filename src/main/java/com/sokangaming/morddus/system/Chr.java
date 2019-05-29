package com.sokangaming.morddus.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

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
public class Chr {

	@NonNull private Player player;
	private boolean isNPC;
	@NonNull private String name;
	private final List<AbilityDef> abilities = new ArrayList<AbilityDef>();
	private InitiativeType initType;
	private final Map<ResourceType, Integer> resources = new HashMap<>(Maps.asMap(Sets.newHashSet(ResourceType.HP, ResourceType.AP, ResourceType.MP), (k) -> {
		switch(k) {
		case HP:
			return 5;
		case AP:
			return 0;
		case MP:
			return 0;
		default:
			return 0;
		}
	}));
	private final List<Effect> effects = new ArrayList<Effect>();

	public void setPlayer(Player p) {
		this.player = p;
		p.characters().add(this);
	}
}
