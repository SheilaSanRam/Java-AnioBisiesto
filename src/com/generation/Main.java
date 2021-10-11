package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pedir un año al usuario por consola, y determinar si el
        //            año es bisiesto.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un año y te diré si es bisiesto");
        int anio = sc.nextInt();
        sc.nextLine();

        if (anio>1582) {
            if (anio%4==0) {
                if (anio % 100 == 0 && anio % 400 == 0) {
                    System.out.println("El año es bisiesto");
                } else if(anio%100==0) {
                    System.out.println("El año no es bisiesto");
                }else{
                    System.out.println("El año es bisiesto");
                }
            }else{
                System.out.println("El año no es bisiesto");
            }

        }else{
            System.out.println("El año es juliano. No puede ser bisiesto");
        }
    }
}
