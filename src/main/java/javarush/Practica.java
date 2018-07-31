package javarush;

public class Practica {
    public static void main(String[] args) {
        char[] c = {'c', 'a', 'd', 'g'};//= String c = "cadg";
        String s = new String(c);
        System.out.println(c +" " + c.length + " " + s + s.length());
        String h = "dhfjkkgjkfvjgmgkgfk";
        int start = 4;
        int end = 9;
        char[] buf;
        buf = new char[end-start];
        h.getChars(start,end, buf, 0);
        System.out.println(buf);
String b = "sdfgh";
byte st = 1;
byte en = 4;
byte[] by = new byte[en - st];
b.getBytes(st, en, by, 0);
        System.out.println(by+" ");
        System.out.println("Строки равны: " + b.equals(h));
        boolean q = h.startsWith("dfgh");//начинается строка h с набора букв
        System.out.println(q);
    }
}
