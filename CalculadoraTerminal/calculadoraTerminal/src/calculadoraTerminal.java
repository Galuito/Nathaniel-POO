import java.util.Scanner;

public class calculadoraTerminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char operador = ' ';
        char salir = ' ';
        float o1, o2, res;

        System.out.println(".: CALCULADORA EN LA TERMINAL JAVA :. \n");

        while(true){
            System.out.print("Digite el operador (+, -, *, /): ");
            operador = input.next().charAt(0); //Retorna el primer caracter del la linea input 
                                                //y la asigna a operador
            switch(operador){
                case '+':
                System.out.println("Realizando la operacion: o1 + o2 = res");
                System.out.print("Digite el primer operando: ");
                o1 = input.nextFloat();
                System.out.print("Digite el segundo operando: ");
                o2 = input.nextFloat();
                res = o1 + o2;
                System.out.println("El resultado es: " + res);
                res = 0;
                break;


                case '-':
                System.out.println("Realizando la operacion: o1 - o2 = res");
                System.out.print("Digite el primer operando: ");
                o1 = input.nextFloat();
                System.out.print("Digite el segundo operando: ");
                o2 = input.nextFloat();
                res = o1 - o2;
                System.out.println("El resultado es: " + res);
                res = 0;
                break;


                case '*':
                System.out.println("Realizando la operacion: o1 * o2 = res");
                System.out.print("Digite el primer operando: ");
                o1 = input.nextFloat();
                System.out.print("Digite el segundo operando: ");
                o2 = input.nextFloat();
                res = o1 * o2;
                System.out.println("El resultado es: " + res);
                res = 0;
                break;

                case '/':
                System.out.println("Realizando la operacion: o1 / o2 = res");
                System.out.println("PRECAUCION: no ingresar O2 = 0");
                System.out.print("Digite el primer operando: ");
                o1 = input.nextFloat();
                System.out.print("Digite el segundo operando: ");
                o2 = input.nextFloat();
                if(o2 == 0){
                    System.out.println("DIVISOR NO VALIDO CANCELANDO OPERACION");
                    break;
                }
                res = o1 / o2;
                System.out.println("El resultado es: " + res);
                break;

                default:
                System.out.println("Ingrese un operador valido");

            }
            System.out.println();
            System.out.println("Desea detener la ejecucion? (S/s): ");
            salir = input.next().charAt(0);
            System.out.println();

            if(salir == 's' || salir == 'S'){
                System.out.println("Finalizando ejecucion, tenga un buen dia");
                break;
            }
            
        }

        input.close();
    }

}
