import java.util.Scanner;

public class Palindrome {

    static public boolean isPalindrome(long value){
        boolean pal = true;
        String valueS = Long.toString(value);
        for(int i=0; i < valueS.length()/2; i++){
            if (valueS.charAt(i) != valueS.charAt(valueS.length()-1-i)){
                pal = false;
                break;
            }
        }
        return pal;
    }

    public static void main(String[] args) {//проверка чисел на палиндром
        long[] valueS1 = new long[]{1,2,3,11,123321,1234566};
        long[] valueS2 = new long[]{123,1234567890};

        for (int i = 0; i < valueS1.length; i++) {
            boolean p = isPalindrome(valueS1[i]);
            if (p){
                System.out.printf("isPalindrome(%d)=%s\n",valueS1[i],p);
            }else{
                System.out.println("error");
            }
        }
        for (int i = 0; i < valueS2.length; i++) {
            boolean p = isPalindrome(valueS2[i]);
            if (!p) System.out.printf("isPalindrome(%d)=%s\n",valueS2[i],p);
        }
    }
}
