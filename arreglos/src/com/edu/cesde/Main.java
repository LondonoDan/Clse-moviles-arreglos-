package com.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData= new Scanner(System.in);
        int [] numeros = {5,7,8,10,12};
        System.out.println(numeros[2]);
        //modificar una posicion de un arreglo
        numeros[2]=6;
        System.out.println(numeros[2]);
        int dato = numeros[3];
        System.out.println("Resultado"+dato*2);
        //mostrar todos los elemento del arreglo
        for (int i=0; i<5;i++){
            System.out.println(numeros[i]);
        }
        int numero;
        for (int y=0; y<5; y++){
            System.out.println("Ingrese el primer dato" + (y+1));
            numero = inputData.nextInt();
            numeros[y]= numero;
        }

    }
}
