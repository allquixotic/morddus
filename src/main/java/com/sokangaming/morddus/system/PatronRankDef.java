package com.sokangaming.morddus.system;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@RequiredArgsConstructor
@Accessors(fluent=true)
public class PatronRankDef {
	@NonNull private String name;
}
