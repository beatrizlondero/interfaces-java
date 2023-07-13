package com.bealon;

import com.bealon.interfaces.MenuServicio;
import com.bealon.services.CalculadoraSimple;
import com.bealon.services.CalculadoraTrigonometrica;
import com.bealon.services.MenuGeneralServicio;
import com.bealon.services.MenuOpcionesLetrasServicio;
import com.bealon.services.MenuOpcionesNumericasServicio;
import com.bealon.services.MenuOtrasOpciones;

public class Application {

    public static void main(String[] args) throws Exception {
        CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
        CalculadoraTrigonometrica calculadoraTrigonometrica = new CalculadoraTrigonometrica();
        System.out.println( "la suma de 100 + 100 es : " + calculadoraSimple.suma(100,100 ) + " segun la calculadora simple");
        System.out.println( "la multiplicacion de 100 + 100 es : " + calculadoraSimple.multiplicacion(100,100 )+ " segun la calculadora simple");
        System.out.println(calculadoraTrigonometrica.seno(35.0));

        MenuServicio menuNumericas = new MenuOpcionesNumericasServicio();
        MenuServicio menuLetras = new MenuOpcionesLetrasServicio();
        MenuServicio menuOtras = new MenuOtrasOpciones();
        MenuServicio[] menus = {menuNumericas, menuLetras, menuOtras};
        
        MenuServicio menuGeneral = new MenuGeneralServicio(menus);
        try {
            
            menuGeneral.iniciar();
        } catch (Exception e) {
                throw e;
        }


    }
}
