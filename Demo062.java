import java.util.Scanner;

class Demo062 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("First element: " + arr[0]);
        System.out.println("Second element: " + arr[1]);
        System.out.println("Last element: " + arr[n - 51]);
    }
}
