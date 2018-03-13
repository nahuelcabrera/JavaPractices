package com.nahuelcabrera;

import javax.swing.*;

public class EntradaNumeros
{
    public static void main(String ar[])
    {
        //PRINTFORMAT DETERMINATION

        double x = 1000;
        System.out.printf("%1.4f", x/3);
        System.out.println();

        String num1 = JOptionPane.showInputDialog("Introduce el numero");
        Double num2 = Double.parseDouble(num1);

        System.out.print("La raiz de "+num2+" es ");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
