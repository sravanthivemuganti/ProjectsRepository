package practice.programs;

import java.util.*;

public class ColorCount {

	public static void main(String[] args) {
		List<Integer> colors = new ArrayList<Integer>();
		colors.add(1);
		colors.add(2);
		colors.add(1);
		colors.add(1);
		colors.add(1);
		colors.add(3);
		colors.add(2);
		pairOfColor(colors);
	}
	public static void pairOfColor(List<Integer> colors) {
		Map<Integer,Integer> colorCount = new HashMap<Integer,Integer>();
		for(int i : colors) { // color and count pairs
			if(colorCount.containsKey(i)) {
				colorCount.put(i, colorCount.get(i) + 1);
			} else {
				colorCount.put(i, 1);
			}
		}
		System.out.println(colorCount);
		for(Map.Entry<Integer, Integer> e : colorCount.entrySet()) {
			Integer color = e.getKey();
			Integer count = e.getValue();
			if(count >= 2) {
				int group = count / 2;
				for (int i = 0; i < group; i++) {
					System.out.println("{"+color+","+color+"}");
				}
			}
		}
	}
	
}


