//CLASE PARA LOS HELICOPTEROS

public class helicoptero extends vehiculoAereo{
    private float aceleracionInmediata; //Caracteristica importante para los helicopteros debido a sus maniobras
    //Este numero tiene un limite, ya que un helicoptero es un objeto real el cual no puede violar las leyes de
    //la fisica

    public helicoptero(){
        super("Helicoptero", 1057, 390, 2, 0, 222, 5); 
        //nombre, peso, capacidad de carga, helices, turbinas, velocidad maxima y numero de pasajeros
        aceleracionInmediata = 5; //Dada en Kilometros/hora**2
    }

    public void setAcce(float acce){
        aceleracionInmediata = acce;
        System.out.println("Ahora la aceleracion inmediata es de: " + acce);
    }

    public void getAcce(){
        System.out.println("La aceleracion inmediata del helicoptero es de: " + aceleracionInmediata);
    }

    public void calcularPrecioEspecifico(){
        float precioBase = calcularPrecioBase();
        float precioEspecifico = precioBase + aceleracionInmediata * 325; //Esto es caro debido a que influye la tecnologia
        System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
    }
}
