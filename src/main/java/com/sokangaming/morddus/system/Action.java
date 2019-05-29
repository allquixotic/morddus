package com.sokangaming.morddus.system;

import java.util.Map;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

@Value @Builder @Accessors(fluent=true)
public class Action {
	Chr source;
	Map<Chr, Resource> targets;
	AbilityDef ability;
	Game game;
}
