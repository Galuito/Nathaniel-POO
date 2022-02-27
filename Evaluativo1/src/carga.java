//CLASE PARA LOS AVIONES DE CARGA

public class carga extends vehiculoAereo{
    private int volumenDisponible; //Para volumen de equipaje en metros cubicos

    public carga(){
        super("Avion de Carga", 128100, 137250, 0, 4, 830, 121); 
        //nombre, peso, capacidad de carga, helices, turbinas, velocidad maxima y numero de pasajeros
        volumenDisponible = 83; //metros cubicos
    }

    public void setVolumen(int vol){
        volumenDisponible = vol;
        System.out.println("Ahora la capacidad del avion de carga es de: " + vol);
    }

    public void getVolumen(){
        System.out.println("La capacidad del avion de carga es de: " + volumenDisponible);
    }

    public void calcularPrecioEspecifico(){
        float precioBase = calcularPrecioBase();
        float precioEspecifico = precioBase + volumenDisponible * 300;
        System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
    }
        
}
