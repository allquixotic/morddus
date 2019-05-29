package com.sokangaming.morddus.system;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Builder
@Accessors(fluent=true)
public class Declare {
	Chr declarer;
	List<Action> actions;
	Game game;
}
