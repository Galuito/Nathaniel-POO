package Carros;

public class Camioneta {
    private int ruedas;
    private int pesoPlataforma;
    private int largo;
    private int ancho;
    private int motor;
    private String color;
    private int pesoMaximo;

    public Camioneta(){
        ruedas = 4;
        pesoPlataforma = 2000;
        largo = 4; //metros
        ancho = 2; //metros
        motor = 3300;
        color = "Rojo Fuego";
        pesoMaximo = 1000; //Peso maximo de carga en kilos
    }

    //getter generalizado
    public void documentacion(){
        System.out.println("La camioneta tiene " + ruedas + " ruedas");
        System.out.println("El peso de la plataforma de la camioneta es: " + pesoPlataforma + "KG");
        System.out.println("La camioneta mide " + largo + " metros de largo");
        System.out.println("La camioneta mide " + ancho + " metros de ancho");
        System.out.println("El motor de la camioneta es de " + motor + " cilindradas? "); //No se de autos
        System.out.println("El color de la camioneta es " + color);
        System.out.println("El peso maximo de carga de la camioneta es: " + pesoMaximo);
        System.out.println();
    }

    //setters de caracteristicas especificas
    public void establecerColor(String clr){
        color = clr;
        System.out.println("El nuevo color de la camioneta es: " + color);
        System.out.println();
    }

    public void establecerPesoMaximo(int PM){
        pesoMaximo = PM;
        System.out.println("El nuevo peso maximo de la camioneta es: " + pesoMaximo);
        System.out.println();
    }

    public void establecerMotor(int engine){
        motor = engine;
        System.out.println("La nueva capacidad de cilindradas del motor es de :" + motor);
        System.out.println();
    }
}
