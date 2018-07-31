package solutions;

import java.util.*;

    public class HappyNumbers {
        public static void main(String[] args) {
            Scanner in = new Scanner("{ N - length of array }\n" +
                    "{ array of integers }");
            int N = in.nextInt();
            int[] number = new int[N];
            for (int i= 0; i < N; i++){
                number[i]= in.nextInt();
            }
            count(number);
        }
        public static void count(int[] number) {

            int count = 0;
            for (int i = 0; i < number.length; i++) {
                if(number[i]%7 == 0)
                    count++;
            }
            System.out.print(count);
        }


    }

