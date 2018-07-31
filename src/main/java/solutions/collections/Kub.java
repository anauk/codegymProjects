package solutions.collections;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kub {
    public static void main(String[] args) {
        int [][] arr = new int[4][4];
        int count=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j]=count++;
            }
        }
        Stream<Map.Entry<Integer, List<Integer>>> entryStream = Arrays.stream(arr)
                .map(new Function<int[], Map.Entry<Integer, List<Integer>>>() {
                    @Override
                    public Map.Entry<Integer, List<Integer>> apply(int[] ints) {
                        int key = ints[0];
                        List<Integer> list = Arrays.stream(ints).skip(1).boxed().collect(Collectors.toList());
                        return new AbstractMap.SimpleEntry<>(key, list);
                    }
                });
        Map<Integer, List<Integer>> collect = entryStream.collect(Collectors.toMap(
                new Function<Map.Entry<Integer, List<Integer>>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, List<Integer>> e) {
                        return e.getKey();
                    }
                },
                new Function<Map.Entry<Integer, List<Integer>>, List<Integer>>() {
                    @Override
                    public List<Integer> apply(Map.Entry<Integer, List<Integer>> e) {
                        return e.getValue();
                    }
                }
        ));
    }
}
