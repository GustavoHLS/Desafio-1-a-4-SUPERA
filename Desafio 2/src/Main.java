import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = Double.parseDouble(sc.nextLine());
        int nota2 = 0, nota5 = 0, nota10 = 0, nota20 = 0, nota50 = 0, nota100 = 0,
                moeda1 = 0, moeda5 = 0, moeda25 =  0, moeda50 = 0, moeda1real = 0, moeda10 = 0;

        while(valor > 0) {
            if(valor >= 100){
                nota100 = (int) valor / 100;
                valor %= 100;
            } else if(valor >= 50) {
                nota50 = (int) valor / 50;
                valor %= 50;
            } else if(valor >= 20) {
                nota20 = (int) valor / 20;
                valor %= 20;
            } else if(valor >= 10) {
                nota10 = (int) valor / 10;
                valor %= 10;
            } else if (valor >= 5) {
                nota5 = (int) valor / 5;
                valor %= 5;
            } else if(valor >= 2) {
                nota2 = (int) valor / 2;
                valor %= 2;
            } else if(valor >= 1) {
                moeda1real = 1;
                valor -= 1;
            } else if(valor >= 0.50) {
                moeda50 = 1;
                valor -= 0.50;
            } else if(valor >= 0.25) {
                moeda25 = 1;
                valor -= 0.25;
            } else if(valor >= 0.10) {
                moeda10 += 1;
                valor -= 0.10;
            } else if(valor >= 0.05) {
                moeda5 = 1;
                valor -= 0.05;
            } else {
                moeda1 = (int) (valor / 0.01);
                valor = 0;
            }
        }

        System.out.println("NOTAS:");
        System.out.printf("%2d nota(s) de R$ 100.00\n", nota100);
        System.out.printf("%2d nota(s) de R$ 50.00\n", nota50);
        System.out.printf("%2d nota(s) de R$ 20.00\n", nota20);
        System.out.printf("%2d nota(s) de R$ 10.00\n", nota10);
        System.out.printf("%2d nota(s) de R$ 5.00\n", nota5);
        System.out.printf("%2d nota(s) de R$ 2.00\n", nota2);
        System.out.println("Moedas:");
        System.out.printf("%2d moeda(s) de R$ 1.00\n", moeda1real);
        System.out.printf("%2d moeda(s) de R$ 0.50\n", moeda50);
        System.out.printf("%2d moeda(s) de R$ 0.25\n", moeda25);
        System.out.printf("%2d moeda(s) de R$ 0.10\n", moeda10);
        System.out.printf("%2d moeda(s) de R$ 0.05\n", moeda5);
        System.out.printf("%2d moeda(s) de R$ 0.01", moeda1);
    }
}
