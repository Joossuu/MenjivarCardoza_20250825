/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menjivarcardoza_20250825;
import java.util.Scanner;

/**
 *
 * @author vboxuser
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] edades = new int[10];
        int contador = 0;

        System.out.println("Ingrese 10 edades de estudiantes: ");

        while (contador < 10) {
            System.out.print("Edad " + (contador + 1) + ": ");
            edades[contador] = sc.nextInt();
            contador++;
        }

        procesarDeLasEdades(edades);
    }

    public static void procesarDeLasEdades(int[] arr) {
        int total = 0, pares = 0, impares = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if (arr[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        double promedio = (double) total / arr.length;

        System.out.println(">>>Resultados<<<");
        System.out.println("Datos ingresados: " + arr.length);
        System.out.println("Promedio de las edades: " + promedio);
        System.out.println("Edades que son pares: " + pares);
        System.out.println("Edades que son impares: " + impares);
    }
}