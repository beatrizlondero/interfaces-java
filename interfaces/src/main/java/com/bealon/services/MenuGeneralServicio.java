package com.bealon.services;

import java.util.Scanner;

import com.bealon.interfaces.MenuServicio;

// MenuGeneralServicio implementation
public class MenuGeneralServicio implements MenuServicio {
    private MenuServicio[] menus;
    
    public MenuGeneralServicio(MenuServicio[] menus) {
        this.menus = menus;
    }

    public void imprimirTitulo() {
        System.out.println("Menú General");
    }

    public void imprimirOpciones() {
        System.out.println("Seleccione un menú:");
        for (int i = 0; i < menus.length; i++) {
            System.out.println((i + 1) + ". " + menus[i].getClass().getSimpleName());
        }
    }

    public int obtenerOpcion(){
        
        System.out.print("Ingrese el número del menú: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                return scanner.nextInt();
            } else {
                return 0; // Return an empty string if no input is available
            }
            
        

        // Scanner scanner = new Scanner(System.in);
        // try  {
        //     int opcion = scanner.nextInt();
        //     System.out.println(opcion);
        //     return opcion;
        // }  catch (Exception e) {
        //     scanner.next();
        //     System.out.println("ingresaste un caracter invalido");
        // }finally{
        //     scanner.close();
        // }
        // return 0;
    }

    public void seleccionarOpcion(Integer opcion) throws Exception {
        if (opcion >= 1 && opcion <= menus.length) {
            menus[opcion - 1].iniciar();
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public Boolean validarSalida(Integer opcion) {
        return opcion == 0;
    }

    public void saludo() {
        System.out.println("¡Gracias por usar el Menú General!");
    }
}