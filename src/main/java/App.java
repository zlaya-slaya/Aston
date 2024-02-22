public class App {
    public static void main( String[] args ) {

        System.out.println(calculateFactorial(20));

    }

        public static long calculateFactorial(int a){
            if (a < 0) {
                throw new IllegalArgumentException("Нельзя определить факториал для отрицательного числа");
            }
            long p = 1;
            for (int i = 1; i <= a; i++){
                p = p * i;
            }
            return p;
        }

}
