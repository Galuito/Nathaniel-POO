package Carros;

public class Moto {
    //alt + shift + flecha copia cosas
    //ctrl + alt + flecha selecciona multiples líneas
    //Lo de arriba es como alt + click
    private int velocidadMaxima;
    private int largo;
    private int ancho;
    private int id = 0;
    private static int counter = 1;
    private String color;
    private int tanque; //Litros del tanque

    public Moto(){
        velocidadMaxima = 100; //Km/h
        largo = 150; //cm
        ancho = 60; //cm
        id = counter++;
        color = "Negra";
        tanque = 30; //litros
    }

    public void documentacion(){
        //Este getter simple es para hacer una demostración simple de su funcionalidad
        System.out.println("Imprimiendo toda la informacion de la moto: ");
        System.out.println("Velocidad Maxima: "+ velocidadMaxima);
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
        System.out.println("Id de fabricacion: " + id);
        System.out.println("Color: " + color);
        System.out.println("Capacidad del Tanque: " + tanque);
        System.out.println();
    }

    public void getID(){
        System.out.println("El id de la moto es: " + id);
        System.out.println();;
    }

    //Setters de la clase moto
    public void establecerColor(String clr){
        color = clr;
        System.out.println("El nuevo color de la moto es: " + color);
        System.out.println();

    }

    public void establecerTanque(int tank){
        tanque = tank;
        System.out.println("La nueva capacidad disponible del tanque es: " + tank);
        System.out.println();
    }












}
