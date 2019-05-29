package morddusui;

import java.util.LinkedList;
import java.util.List;

import com.sokangaming.morddus.system.Roller;

public class TestRoller implements Roller {

	private LinkedList<Integer> values;
	
	public TestRoller(List<Integer> values) {
		values = new LinkedList<Integer>(values);
	}
	
	@Override
	public int d(int sides) {
		int v = values.pop();
		if(v > sides) {
			throw new RuntimeException("Unexpected die roll " + v + " for " + sides + " sides!");
		}
		return v;
	}
}
