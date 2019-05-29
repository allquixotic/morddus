package com.sokangaming.morddus.system;

import java.security.SecureRandom;

public class SecureRandomRoller implements Roller {

	private final SecureRandom sr = new SecureRandom();
	
	@Override
	public int d(int sides) {
		return sr.nextInt(sides)+1;
	}
}
