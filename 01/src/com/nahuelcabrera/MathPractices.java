package com.nahuelcabrera;

public class MathPractices
{
    public static void main(String args[])
    {
        /*double raiz = Math.sqrt(9);
        La raíz del método sqrt se guarda en un double
        System.out.println(raiz);*/

        //Primer metodo round
        float num1 = 5.85F;
        int resultado1 = Math.round(num1);
        //Segundo metodo round
        double num2 = 5.499;
        long resultado2 = Math.round(num2);

        //CASTEO
        int resultado2B = (int)resultado2;

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado2B);

        double base = 5;
        double exp = 3;

        int resultado4 = (int)Math.pow(base, exp);

        System.out.println(base+" elevado a "+exp+ " es "+resultado4);







    }
}
