package com.nahuelcabrera;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class EntradaDatos
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre");

        String dataName = scanner.nextLine();

        System.out.println("Introduce tu edad");

        String dataAge = scanner.nextLine();

        System.out.println("Introduce tu procedencia");

        String dataLocation = scanner.nextLine();

        System.out.println("Hola "+dataName+".Tu eres de "+dataLocation+", tu edad es "+ dataAge);

    }
}
