package com.nahuelcabrera;

public class ManipulacionCadenas
{
    public static void main(String args[])
    {
        String nombre = "Nahuel";

        System.out.println("Me llamo "+nombre);
        System.out.println("Mi nombre tiene "+nombre.length()+" letras");
        System.out.println("La primera letra de mi nombre es "+nombre.charAt(0));
        System.out.println("La última letra es "+nombre.charAt(nombre.length()-1));
    }
}
