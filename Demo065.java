import java.util.Arrays;
import java.util.Scanner;
class Demo065{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter"+ n +"elements:");
        for (int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are:"+Arrays.toString(arr));
}
}