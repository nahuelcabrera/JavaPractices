package com.nahuelcabrera;

import java.util.Scanner;

public class Condicionales
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intruduce tu edad");
        int edad = entrada.nextInt();

        if (edad>=18)
        {
            System.out.println("Puede ingresar");
        }else
            {
                System.out.println("No puede ingresar");
            }

    }
}
