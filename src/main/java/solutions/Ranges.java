package solutions;

import java.util.*;

public class Ranges {
    public static void main(String[] args) {
        Scanner in = new Scanner("11\n" +
                "1 2 3 5 8 9 10 13 14 15 16");
        final int N = in.nextInt();
        int[] num = new int[N+1];
        for(int i= 0; i<N; i++){
            num[i]= in.nextInt();
            }
            int min=num[0];
            int max=min;

        for (int i = 1; i < num.length; i++) {
            if (num[i]-num[i-1]==1){
                max=num[i];
            }else{
                if( min == max){
                    System.out.printf("[%d]", min);
                }else{
                    System.out.printf("[%d %d]", min, max);
                }
                        min=num[i];
                        max=min;
            }
        }

        /*int min =num[0];
        int max =min;
        int count = 0;
        for (int i=0; i<num.length-1; i++){
            if (i==0){
                System.out.print("["+min);
                min = num[i];
                count++;
            } else if((num[i]-min)==1){
                max=num[i];
                count++;
            } else if ((num[i]-min)>1){
                min=num[i];
                System.out.print("]");
                count=0;
                if (count==1){
                    System.out.print("]");
                } else{
                    System.out.print(max+"]["+min);
                }

            }
        }
        if (count>1){
            System.out.print(max+"");
        }
        System.out.print("]");*/


    }

}