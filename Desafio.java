import java.util.Scanner;

/* Datos del cliente */

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Bruce Banner";
        String tipoDecuenta ="Corriente";
        double saldo = 1999.99;
        int opcion = 0;


        System.out.println("Escriba su nombre");
        System.out.println("\n*******************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDecuenta);
        System.out.println("Saldo Disponible: " + saldo + "RD$");
        System.out.println("\n*******************************\n");


        /* Menu de opciones */

        String menu = """
                **Selecciona el numero de la opcion que desea**
                1 - Consultar Balance
                2 - Retiros
                3 - Depositos
                7 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es: " + saldo + "RD$");
                    break;

                case  2:
                    System.out.println("Cuanto desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    } else{
                        saldo -= valorARetirar;
                        System.out.println(" El saldo actualizado es: " + saldo);
                           }
                    break;

                case 3:
                    System.out.println("Cuanto desea depositar?");
                    double valorAdepositar = teclado.nextDouble();
                    saldo += valorAdepositar;
                    System.out.println("El balanco actual es: "+ saldo);
                    break;

                case 7:
                    System.out.println("Cerrando el programa, Gracias por utilizar nustros servicios");
                    break;

                default:
                    System.out.println("Opcion invalida\n");
            }
        }


    }
}
