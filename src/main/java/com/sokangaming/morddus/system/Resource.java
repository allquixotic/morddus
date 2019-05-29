package com.sokangaming.morddus.system;

import lombok.Builder;
import lombok.Value;
import lombok.experimental.Accessors;

@Value @Builder @Accessors(fluent=true)
public class Resource {
	ResourceType type;
	int value;
}
