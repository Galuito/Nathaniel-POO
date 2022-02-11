package Carros;

public class UsoCamioneta{
    public static void main(String args[]){
        Camioneta ForRunner = new Camioneta();
        Camioneta Tucson = new Camioneta();
        Camioneta Nose = new Camioneta();
        Camioneta GranVitara = new Camioneta();

        Camioneta [] camionetas = {ForRunner, Tucson, Nose, GranVitara};

        Tucson.establecerColor("Gris Galactico");
        GranVitara.establecerColor("Blanco Perla");
        ForRunner.establecerColor("Negro Vantablack");
        GranVitara.establecerPesoMaximo(2000);
        ForRunner.establecerMotor(4500);

        for(int i = 0; i < 4; i++){
            camionetas[i].documentacion();
        }
    }
}