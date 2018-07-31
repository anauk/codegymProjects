package solutions;

import java.util.Scanner;

public class RestoredArray {
           public static void main(String[] args) {
            Scanner in = new Scanner("8\n" +
                    "1 2 -1 4 7 6 -2 4");
            //read dimension
            int N = in.nextInt();
            //declare an array
            int nums[] = new int[N];
            //read an array
            for (int i=0; i<N; i++){
                nums[i] = in.nextInt();
            }
            //restore
               int index = 1;
               while (index < N) {
                   if (nums[index] < 0) {
                       nums[index] = (nums[index - 1] + nums[index + 1]) / 2;
                       index++;
                   }
                   index++;
               }

               for (int i = 0; i< nums.length; i++) {
                   System.out.print(nums[i] + " ");
               }
        }
    }

