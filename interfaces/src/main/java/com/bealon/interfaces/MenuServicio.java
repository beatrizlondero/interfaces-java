package com.bealon.interfaces;

// MenuServicio interface
public interface MenuServicio {
    void imprimirTitulo();
    void imprimirOpciones();
    int obtenerOpcion() throws Exception;
    void seleccionarOpcion(Integer opcion) throws Exception;
    Boolean validarSalida(Integer opcion);
    void saludo();

    default void iniciar() throws Exception {
        imprimirTitulo();
        imprimirOpciones();
        int opcion = obtenerOpcion();
        while (!validarSalida(opcion)) {
            seleccionarOpcion(opcion);
            imprimirOpciones();
            opcion = obtenerOpcion();
        }
        saludo();
    }
}