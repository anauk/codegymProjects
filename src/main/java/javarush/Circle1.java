package javarush;


    /*
Максимум конструкторов
*/

    public class Circle1 {
        public double x;
        public double y;
        public double radius;
        public Circle1(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
        public Circle1(double x, double radius) {
            this.x = x = y;

            this.radius = radius;
        }

        public Circle1(int x, int y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
        public Circle1(double radius) {
            this.radius = radius;
        }
        public Circle1() {

        }

        public static void main(String[] args) {
           Circle1 circle1 = new Circle1(2,8);
            System.out.println(circle1);
        }
    }

