import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String metade1 = line.substring(0, line.length() / 2);
            String metade2 = line.substring(line.length() / 2);
            String reverso1 = new StringBuilder(metade1).reverse().toString();
            String reverso2 = new StringBuilder(metade2).reverse().toString();
            String resultado = reverso1 + reverso2;
            System.out.println(resultado);
        }
    }
}
