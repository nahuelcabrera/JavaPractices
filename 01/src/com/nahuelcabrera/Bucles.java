package com.nahuelcabrera;
import javax.swing.*;

public class Bucles
{
    public static void main(String args[])
    {
        String clave = "Nahuel";

        String pass = "";

        while(!clave.equals(pass))
        {
            pass = JOptionPane.showInputDialog("Introduce la contraseña");
            if (!clave.equals(pass))
            {
                System.out.println("Incorrecto");
            }
        }

        System.out.println("Acceso permitido");
    }
}
