package com.nahuelcabrera;

public class ManipulacionCadenasII
{
    public static void main(String args[])
    {
        String frase = "Hoy es un estupendo día para aprender a programar";
        String frase_resumen = frase.substring(24,frase.length());
        System.out.println("Está genial para "+frase_resumen);
    }
}
