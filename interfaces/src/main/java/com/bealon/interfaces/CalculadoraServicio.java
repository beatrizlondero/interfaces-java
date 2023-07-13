package com.bealon.interfaces;

public interface CalculadoraServicio {

    Integer suma(Integer num1, Integer num2);

    Integer resta(Integer num1, Integer num2);

    Integer multiplicacion(Integer num1, Integer num2);

    Double division(Integer dividendo, Integer divisor);

    Double seno(Double angulo);

    Double coseno(Double angulo);

    Double tangente(Double angulo);
}