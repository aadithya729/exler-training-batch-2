import java.util.Scanner;

class Demo064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Swapping:");
        System.out.println("First element= " + arr[0]);
        System.out.println("Second  Element =" + arr[n - 1]);
        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;
        System.out.println("After Swapping:");
        System.out.println("First element= " + arr[0]);
        System.out.println("Second  Element =" + arr[n - 1]);
    }
}