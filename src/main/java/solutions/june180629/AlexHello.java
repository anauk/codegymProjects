package solutions.june180629;
/*
* Дана строка из слов.
Необходимо пройтись по строке и произвести следущие операции:
Перевернуть все слова задом на перед, и сделать первую букву большой, остальные - маленькие
Пример: Alex Hello -> Xela Olleh*/
public class AlexHello {
    public static String reverseInMyString(String str) {
    String[] words = str.split(" ");
    String reversed = "";
    for (int i = 0; i < words.length; i++) {
        String word = words[i];
        String reverseWord = "";
        for (int j = word.length()-1; j >=0 ; j--) {
            reverseWord = reverseWord + word.charAt(j);
        }
        reversed = reversed + reverseWord + " ";
    }
    return new String(reversed);
}
    private static String capitalizeFirst(String res) {
        char [] r = res.toCharArray();
        for (int i = 0; i< res.length(); i++) {
            if(i == 0 || r[i-1] == ' ' && i < r.length-1)
                r[i] = Character.toUpperCase(r[i]);
        }
        return new String(r);
    }
    public static void main(String[] args) {
        String s = "Alex Hello";
        System.out.println("Before: " + s);
        String res = reverseInMyString(s.toLowerCase());
        System.out.println("After: " + capitalizeFirst(res));

    }
    public static void main1(String[] args) {
        String inputLine = "Alex Hello";
        String[] split = inputLine.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String s : split) {
            String reverted = new StringBuilder(s).reverse().toString();
            sb.append(reverted.substring(0,1).toUpperCase());
            sb.append(reverted.substring(1).toLowerCase());
            sb.append(" ");
        }
        System.out.printf("was: %s\n",inputLine);
        System.out.printf("is: %s\n",sb.toString());
    }

}
