package com.nahuelcabrera;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;

public class EntradaDatosII
{
    //JOPTIONPANE practice
    public static void main(String args[])
    {
        String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        String edadUsuario = JOptionPane.showInputDialog("Introduce tu edad");

        int edadUsuarioParsed = Integer.parseInt(edadUsuario);

        System.out.println("Hola "+nombreUsuario+", tu edad es "+edadUsuario);
        edadUsuarioParsed++;
        System.out.println("El año que viene tendrás "+edadUsuarioParsed);

    }
}
