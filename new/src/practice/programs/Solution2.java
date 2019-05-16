package practice.programs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {

	public static void main(String[] args) {
		List<String> actors = new ArrayList<String>();
		actors.add("Ram");
		actors.add("Ravana");
		actors.add("Ram");
		actors.add("Ravana");
		actors.add("Ram");
		actors.add("Ram");
		actors.add("Sita");
		actorsDisplay(actors);
	}
	public static void actorsDisplay(List<String> actors) {
		List<String> outputActors = new ArrayList<String>();
		Map<String, Integer> actorsCount = new HashMap<String, Integer>();
		for(String actor : actors) { // color and count pairs
			if(actorsCount.containsKey(actor)) { //duplicate
				actorsCount.put(actor, actorsCount.get(actor) + 1);
				outputActors.add(actor+" "+actorsCount.get(actor));
			} else {
				actorsCount.put(actor, 0);
				outputActors.add(actor);
			}
		}
		System.out.println(outputActors);
	}
}
