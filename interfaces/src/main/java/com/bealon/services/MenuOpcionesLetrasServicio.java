package com.bealon.services;

import java.util.Scanner;

import com.bealon.interfaces.MenuServicio;

// MenuOpcionesLetrasServicio implementation
public class MenuOpcionesLetrasServicio implements MenuServicio {
    public void imprimirTitulo() {
        System.out.println("Menú con Opciones de Letras");
    }

    public void imprimirOpciones() {
        System.out.println("A. Opción A");
        System.out.println("B. Opción B");
        System.out.println("C. Opción C");
        System.out.println("0. Salir");
    }

    public int obtenerOpcion() {
        System.out.print("Ingrese la letra de opción: ");
           try (Scanner scanner = new Scanner(System.in)) {
            String opcionString = scanner.nextLine().toUpperCase();
            char opcionChar = opcionString.charAt(0);
            return (int) opcionChar;
        }  catch (Exception e) {
            System.out.println("opcion no valida" + e.getMessage());
        }
        return 0;
        
    }

    public void seleccionarOpcion(Integer opcion) {
        char opcionChar = (char) (int) opcion;
        switch (opcionChar) {
            case 'A':
                System.out.println("Ha seleccionado la Opción A.");
                break;
            case 'B':
                System.out.println("Ha seleccionado la Opción B.");
                break;
            case 'C':
                System.out.println("Ha seleccionado la Opción C.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public Boolean validarSalida(Integer opcion) {
        return opcion == (int) '0';
    }

    public void saludo() {
        System.out.println("¡Gracias por usar el Menú con Opciones de Letras!");
    }
}