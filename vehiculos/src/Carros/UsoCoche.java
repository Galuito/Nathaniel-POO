package Carros;
public class UsoCoche {
    public static void main(String[] args) throws Exception {
        Coche Renault = new Coche();
        System.out.println("El largo del Coche es: " + Renault.dimeLargo());
        Renault.cuantasRuedas();
        System.out.println("El pesoPlataforma del Coche es: " + Renault.dimepesoPlataforma());
        Renault.setWeight(777);
        System.out.println("El pesoPlataforma del Coche es: " + Renault.dimepesoPlataforma());
        
        //Con alt + click puedes escribir en varios lugares al mismo tiempo
        
        Renault.establecerColor("Amarillo");
        System.out.println("El color del Coche es: " + Renault.dimeColor());
        
        Renault.establecerColor("Azul");
        System.out.println("El color del Coche es: " + Renault.dimeColor());
        
        Renault.establecerColor("Rojo");
        System.out.println("El color del Coche es: " + Renault.dimeColor());

        
    }
}
