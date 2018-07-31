public class DecimalToBinary {

    public static void main1(String[] args) {
        final int VAL = 33;

        boolean[] bits = new boolean[32];
        for (int i = 0; i < bits.length; i++) {
            bits[bits.length-1-i] = ((VAL>>i)&1)==1;  //сдвигаем на i бит-этоVAL>>1
        }
        for (boolean b:bits) {
            System.out.println(b ? 1 : 0);
        }
    }
    public static void main(String[] args) {
        final int VAL=-33;

        int [] bits = new int[32];
        for (int i = 0; i < bits.length; i++) {
            bits[bits.length-1-i] = ((VAL)>>i)&1;
        }

        for (int b : bits) {
            System.out.print(b==1 ? 1: 0);
        }
        System.out.println();
        for (int i = 0; i < bits.length; i++) {
            System.out.print(bits[i] ==1 ? 1: 0);
        }
    }
}
