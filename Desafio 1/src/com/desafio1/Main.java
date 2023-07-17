package com.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> parLista = new ArrayList<Integer>();
        ArrayList<Integer> imparLista = new ArrayList<Integer>();

        for (int i = 1; i <= N; i++) {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                parLista.add(numero);
            } else {
                imparLista.add(numero);
            }
        }

        Collections.sort(parLista);
        Collections.sort(imparLista, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });

        lista.addAll(parLista);
        lista.addAll(imparLista);

        for(Integer numero : lista){
            System.out.println(numero);
        }

    }
}
