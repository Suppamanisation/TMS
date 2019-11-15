package homework_11.task_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Set<Fruits> fruitsSet = new HashSet<>();
        fillFruitsSet(fruitsSet);
        System.out.println(fruitsSet);

        Map<String, Double> allFruitsWeight = new HashMap<>();
        weightCounter(fruitsSet, allFruitsWeight);
        System.out.println(allFruitsWeight);
    }

    private static void fillFruitsSet(Set<Fruits> fruitsSet) {
        fruitsSet.add(new Fruits("Orange", 10.6));
        fruitsSet.add(new Fruits("Apple", 1.6));
        fruitsSet.add(new Fruits("Pear", 2.0));
        fruitsSet.add(new Fruits("Pineapple", 15.6));
        fruitsSet.add(new Fruits("Apple", 15.2));
        fruitsSet.add(new Fruits("Pineapple", 19.0));
        fruitsSet.add(new Fruits("Pear", 7.7));
        fruitsSet.add(new Fruits("Orange", 8.6));
    }

    private static void weightCounter(Set<Fruits> fruitSet, Map<String, Double> allFruitsWeight) {
        for (Fruits fruits : fruitSet) {
            if (allFruitsWeight.containsKey(fruits.getName())) {
                allFruitsWeight.put(fruits.getName(), allFruitsWeight.get(fruits.getName()) + fruits.getWeight());
            } else {
                allFruitsWeight.put(fruits.getName(), fruits.getWeight());
            }
        }
    }
}
