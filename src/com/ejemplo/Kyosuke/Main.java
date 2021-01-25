package com.ejemplo.Kyosuke;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arreglos simples soportan datos primitivos u objetos
        System.out.println("Arreglos con tipos de datos primitivos");
        int[] ints = {9,6,3};

        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Arreglos con cadenas de caracteres");

        String[] strings = {"Rojo", "Azul", "Verde"};
        Arrays.sort(strings);
        for (String color: strings) {
            System.out.println(color);
        }

        System.out.println("Configuracion del tamaño inicial de un arreglo");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }
        for (int value : sized){
            System.out.println(value);
        }

        System.out.println("Copiar un arreglo");

        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int value : copied){
            System.out.println(value);
        }
    }
}
