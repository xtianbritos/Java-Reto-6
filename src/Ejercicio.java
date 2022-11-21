import java.util.Scanner;

public class Ejercicio {

    static int opcion;

    static String marca, placa, nombre, telefono;

    static Scanner entrada = new Scanner(System.in);

    static void opcionesMenu() {
        switch(opcion) {
            case 1: {
                System.out.println("Ingrese su nombre completo:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su teléfono:");
                telefono = entrada.nextLine();
                System.out.println("Ingrese la marca del vehículo:");
                marca = entrada.nextLine();
                System.out.println("Ingrese la placa del vehículo:");
                placa = entrada.nextLine();

                System.out.println("\nSu vehículo ha sido ingresado al parqueadero.");
                break;
            }
            case 2: {
                System.out.println("Ingrese su teéfono:");
                telefono = entrada.nextLine();
                System.out.println("Ingrese la placa de su vehículo:");
                placa = entrada.nextLine();

                System.out.println("\nSu vehículo ha sido retirado del parqueadero.");
                break;
            }
            case 3: {
                System.out.println("Ingrese la placa del vehículo:");
                placa = entrada.nextLine();

                if (placa.equals("123abc")) {
                    System.out.println("El vehículo se encuentra en el parqueadero.");
                }
                else {
                    System.out.println("El vehículo NO se encuentra en el parqueadero.");
                }
                break;
            }
            case 4: {
                System.out.println("Gracias por usar nuestro servicio");
                break;
            }
        }
    }

    public static void main(String[] args) {

        int contador = 0;

        Scanner input = new Scanner(System.in);

        while(contador<=5) {

            System.out.println("\nElija una opción:\n"+
                    "1 - Ingresar al parqueadero\n"+
                    "2 - Retirar del parqueadero\n"+
                    "3 - Consultar si un vehículo se encuentra en el parqueadero\n"+
                    "4 - Salir del programa\n");

            opcionesMenu();
        }
    }
}
