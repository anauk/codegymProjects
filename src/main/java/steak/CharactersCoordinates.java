package steak;

import java.util.*;

public class CharactersCoordinates {
    public static void main1(String[] args) {
        String input = "This is test string";
        Scanner in = new Scanner(
                input
        );
        //делаем структуру данных, что хранит систему символов
        HashMap<Character, List<Integer>> map = new HashMap<>();
        String line = in.nextLine();// получаем в переменну строку из сканера
        PriorityQueue<Character> pqKeys = new PriorityQueue<>();//сортируем ключи
        for (int i = 0; i < line.length(); i++) { //проходимся по строке циклом
            char symbol = line.charAt(i);// передаем символ в переменную char

            //ArrayList<Integer> positions = map.getOrDefault(symbol,new ArrayList<Integer>()); //создаем арей лист для номеров символов
            ArrayList<Integer> positions;
            if (Character.isAlphabetic(symbol)) {
                if (!pqKeys.contains(symbol)) {
                    pqKeys.add(symbol);
                }
                if (map.containsKey(symbol)) {//если символ есть, то ложим в positions
                    positions = (ArrayList) map.get(symbol);//сюда
                } else {
                    positions = new ArrayList<>();//а если симола нет,то ложим в пустой арей лист
                }
                positions.add(i);
                map.put(symbol, positions);// ложим в мап ключ символ и его номер-позицию
            }
        }
        while (!pqKeys.isEmpty()) {
            Character currentKey = pqKeys.poll();
            System.out.printf("%s=%s%s", currentKey, map.get(currentKey), (pqKeys.isEmpty() ? "" : ", "));
        }
    }
        public static void main(String[] args) {
            String input="This is test string";
            Scanner in = new Scanner(
                    input
                    //System.in
            );
            String line = in.nextLine();
            HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i < line.length(); i++){
                char symbol = line.charAt(i);
                if (Character.isLetter(symbol)) {
                    ArrayList<Integer> positions = map.getOrDefault(symbol, new ArrayList<>());
                    positions.add(i);
                    map.put(symbol, positions);
                }
            }
            PriorityQueue<Map.Entry<Character, List<Integer>>> outcome = new PriorityQueue<>((o1, o2) -> o1.getKey()-o2.getKey());
            map.forEach((c, l) -> outcome.add(new AbstractMap.SimpleEntry<>(c, l)));
            while (!outcome.isEmpty()) {
                Map.Entry e = outcome.poll();
                System.out.printf("%s=%s%s",e.getKey(), e.getValue(), outcome.isEmpty()?"":", ");
            }
        }
}
