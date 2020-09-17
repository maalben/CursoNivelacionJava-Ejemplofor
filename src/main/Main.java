package main;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
/*
        for(int i=20; i>=0; i-=2){
            System.out.println("Números " + i);
        }
*/
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número de la tabla");
        long numero = teclado.nextLong();
        System.out.println("Ingrese el límite de la tabla de multiplicar");
        long limite = teclado.nextLong();

        for(long i = 1; i <= limite; i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }

}
