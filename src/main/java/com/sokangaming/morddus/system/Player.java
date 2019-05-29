package com.sokangaming.morddus.system;

import java.util.HashSet;
import java.util.Set;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@RequiredArgsConstructor
@Accessors(fluent=true)
public class Player {
	@NonNull private String name;
	private final Set<Chr> characters = new HashSet<Chr>();
	
}
