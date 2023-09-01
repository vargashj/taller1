package com.hectorvargas.DispensadorDeAgua;

public class dispensadorDeAgua {
    public String serial;
    public String marca;
    public int cantidadMaxima;
    public int cantidadActual;
    public double temperatura;


    public dispensadorDeAgua(String serial, String marca, int cantidadMaxima, int cantidadActual, double temperatura) {
        this.serial = serial;
        this.marca = marca;
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
        this.temperatura = temperatura;

    }


        public void servi(int cantidad) {
            if (cantidad <= cantidadActual) {
                cantidadActual -= cantidad;
                System.out.println("Serving " + cantidad + " ml of water.");
            } else {
                System.out.println("Not enough water to serve.");
            }
        }

        public void llenar() {
            cantidadActual = cantidadMaxima;
            System.out.println("Filling water dispenser.");
        }

        public void vaciar() {
            cantidadActual = 0;
            System.out.println("Emptying water dispenser.");
        }

        public void calentar() {
            temperatura += cantidadActual;
            System.out.println("Heating water by " + temperatura + " degrees.");
        }

        public void enfriar(double cantidad) {
            temperatura -= cantidadActual;
            System.out.println("Cooling water by " + temperatura + " degrees.");
        }

        public void mostrarNivel() {
            System.out.println("Current water level: " + cantidadActual + " ml.");
        }
    }

