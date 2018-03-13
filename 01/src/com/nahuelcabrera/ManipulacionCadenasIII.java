package com.nahuelcabrera;

public class ManipulacionCadenasIII
{
    public static void main(String args[])
    {
        String alumno1, alumno2, alumno3;

        alumno1 = "Pedro";
        alumno2 = "pedro";
        alumno3 = "Romina";

        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        System.out.println(alumno1.equals(alumno3));

    }
}
