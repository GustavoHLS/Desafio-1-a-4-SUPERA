import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        int n = scanner.nextInt();
        System.out.println("Digite o valor de k");
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Arrays.binarySearch(arr, arr[i] + k) >= 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
