package com.bealon.services;

import com.bealon.interfaces.CalculadoraServicio;

public class CalculadoraSimple implements CalculadoraServicio {

    @Override
    public Integer suma(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override

    public Integer resta(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiplicacion(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Double division(Integer dividendo, Integer divisor) {
        return (double) dividendo / divisor;
    }

    @Override
    public Double seno(Double angulo) {
        return Math.sin(angulo);
    }

    @Override
    public Double coseno(Double angulo) {
        return Math.cos(angulo);
    }

    @Override
    public Double tangente(Double angulo) {
        return Math.tan(angulo);
    }
}