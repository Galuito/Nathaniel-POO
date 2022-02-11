package Carros;
public class Coche {
    
    private int ruedas;
    private int pesoPlataforma;
    private int largo;
    private int ancho;
    private int motor;
    private String color;

    //Metodo constructor
    public Coche(){
        ruedas = 4;
        pesoPlataforma = 500;
        largo = 2000;
        ancho = 300;
        motor = 1600;
    }

    //Getters
    public int dimeLargo(){
        return largo;
    }
    
    public int dimepesoPlataforma(){
        return pesoPlataforma;
    }

    public int dimeAncho(){
        return ancho;
    }

    public int dimeMotor(){
        return motor;
    }

    
    public String dimeColor(){
        return color;
    }

    //Diferente tipo de Getter
    public void cuantasRuedas(){
        System.out.println("El coche tiene: " + ruedas + " ruedas");
    }

    //Setters
    public void setWeight(int weight){
        pesoPlataforma = weight;
    }

    public void establecerColor(String clr){
        color = clr;
    }

}
