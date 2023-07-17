package com.bealon.services;

import java.util.Scanner;

import com.bealon.interfaces.MenuServicio;

public class MenuOtrasOpciones implements MenuServicio {
    @Override
    public void imprimirTitulo() {
        System.out.println("Menu personalizado");
    }

    @Override
    public void imprimirOpciones() {
        System.out.println("1. Menu personalizado1");
        System.out.println("2. Menu personalizado2");
        System.out.println("3. Menu personalizado3");
        System.out.println("0. Salir");
    }

    @Override
    public int obtenerOpcion() {
        System.out.println( "Seleccione la opcion: ");
        Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                return scanner.nextInt();
            } else {
                return 0; // Return an empty string if no input is available
            }

        
        // Scanner scanner = new Scanner(entrada);
        // try  {
        //     return scanner.nextInt();
        // } catch (Exception e ){
        //     scanner.nextLine();
        //    // throw new Exception( "algo salio mal");
        // } finally { 
        //     System.out.println("en el finally");
        //     scanner.close();
        //     entrada = "2\n";
        // }
        // return 0;
    }



    
    @Override
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
            case 0:
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    @Override
    public Boolean validarSalida(Integer opcion) {
        return opcion == 0;
    }

    @Override
    public void saludo() {
        System.out.println("Good by");
    }
    
}
