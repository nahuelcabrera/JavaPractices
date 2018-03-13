package com.nahuelcabrera;
import java.util.*;
import javax.swing.*;

public class CondicionalesII
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elije una opción: \n1:Cuadrado\n2:Rectángulo\n3:Triángulo\n4:Círculo");

        int figura = entrada.nextInt();

        switch (figura)
        {
            case 1:
                System.out.println("Cuadrado");
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("El area del cuadrado es "+Math.pow(lado, 2));
                break;
            case 2:
                System.out.println("Rectangulo");
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del rectangulo es "+base*altura);
                break;
            case 3:
                System.out.println("Triangulo");
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del triangulo es "+(base*altura)/2);
                break;
            case 4:
                System.out.println("Circulo");
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El area del circulo es ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                break;
                default:
                    System.out.println("Instrucción incorrecta");
        }
    }
}
