package com.hectorvargas.app;

import com.hectorvargas.DispensadorDeAgua.dispensadorDeAgua;

public class app {
    public static void main(String[] args) {
        dispensadorDeAgua dispensadorDeAguaUno = new dispensadorDeAgua("1234", "cristal", 20000, 10000, 15.0);

        System.out.println(" el serial es" + dispensadorDeAguaUno.serial + " la marca es:" + dispensadorDeAguaUno.marca + "cantidad maxima es:" + dispensadorDeAguaUno.cantidadMaxima
                + "la cantidad actual es:" + dispensadorDeAguaUno.cantidadActual + "la temperatura es:" + dispensadorDeAguaUno.temperatura);
    }
}

