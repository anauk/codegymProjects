import java.util.Scanner;

public class Simple {
    static int[] getSimples(int min,int max){
        int[] ints = new int[max-min+1];
        int index = 0;
        for (int i=min; i<=max; i++){
            if (isSimple(i)){
                ints[index++]=i;
            }
        }
        int[] intsShort = new int[index];
        for (int i=0; i<index; i++){
            intsShort[i]=ints[i];
        }
        return intsShort;
    }

    static boolean isSimple(long number){
        return isSimple((int)number);
    }

    static boolean isSimple(int number){
        boolean simple = true;
          for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                simple = false;
                break;
            }
          }
          return simple;
    }
    static int maximumNumber(){
        System.out.print("Enter maximum number: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void main(String[] args) {
        int N = maximumNumber();
        for (int i = 1; i <= N; i++){
            System.out.print(isSimple(i)?i+" ":"");
        }
    }
}
