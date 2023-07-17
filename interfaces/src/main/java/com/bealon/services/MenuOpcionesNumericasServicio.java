package com.bealon.services;

import java.util.Scanner;

import com.bealon.interfaces.MenuServicio;

// MenuOpcionesNumericasServicio implementation
public class MenuOpcionesNumericasServicio implements MenuServicio{
    public void imprimirTitulo() {
        System.out.println("Menú con Opciones Numéricas");
    }

    public void imprimirOpciones() {
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("0. Salir");
    }

    public int obtenerOpcion() throws Exception {
        System.out.print("Ingrese el número de opción: ");

        Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                return scanner.nextInt();
            } else {
                return 0; // Return an empty string if no input is available
            }
        // try (Scanner scanner = new Scanner(System.in)) {
        //     // int opcion = scanner.nextInt();
        //     // System.out.println(opcion);
        //     return scanner.nextInt();
        // }  catch (Exception e) {
        //    throw new Exception("algo fallo",e);
           
        // }
        
    }

    public void seleccionarOpcion(Integer opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado la Opción 1.");
                break;
            case 2:
                System.out.println("Ha seleccionado la Opción 2.");
                break;
            case 3:
                System.out.println("Ha seleccionado la Opción 3.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public Boolean validarSalida(Integer opcion) {
        return opcion == 0;
    }

    public void saludo() {
        System.out.println("¡Gracias por usar el Menú con Opciones Numéricas!");
    }
}
