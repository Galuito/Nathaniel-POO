package Carros;

public class UsoMoto {
    public static void main(String args[]){
        Moto Yamaha = new Moto();
        Moto Yamcha = new Moto();
        Moto Yakuza = new Moto();
        Moto Yari = new Moto();
        Moto [] motos = {Yamaha,Yakuza, Yari, Yamcha};
        for(int i = 0; i < 4; i++){
            motos[i].getID();
        }

        Yamcha.establecerColor("Azul Cielo");
        Yari.establecerColor("Rojo Metalico");
        Yamaha.establecerTanque(50);

        Yakuza.documentacion();
    }
}
