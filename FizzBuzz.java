public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz\n");
            } else if (i % 3 == 0) {
                System.out.println("Fizz\n");
            } else if (i % 5 == 0) {
                System.out.println("Buzz\n");
            } else {
                System.out.println(i + "\n");
            }
        }
    }
}
