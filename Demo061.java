import java.util.Scanner;

class Demo061 {
    public static void prime_N(int N) {
        for (int x = 2; x <= N; x++) {
            boolean isPrime = true;

            for (int y = 2; y <= x / 2; y++) {
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int N = sc.nextInt();
        System.out.println("Prime numbers up to " + N + ":");
        prime_N(N);
    }
}