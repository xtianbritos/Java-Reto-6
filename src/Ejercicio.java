import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio {

    static Vehiculo vehiculo = new Vehiculo();

    static List<Vehiculo> parqueados = new ArrayList<>();

    static int opcion, contador = 0;

    static String placa;

    static Scanner entrada = new Scanner(System.in);

    static void opcionesMenu() {
        switch(opcion) {
            case 1: {
                System.out.println("Ingrese su nombre completo:");
                vehiculo.nombre = entrada.nextLine();
                System.out.println("Ingrese su teléfono:");
                vehiculo.telefono = entrada.nextLine();
                System.out.println("Ingrese la marca del vehículo:");
                vehiculo.marca = entrada.nextLine();
                System.out.println("Ingrese la placa del vehículo:");
                vehiculo.placa = entrada.nextLine();

                parqueados.add(vehiculo);

                System.out.println("\nSu vehículo ha sido ingresado al parqueadero.");
                break;
            }
            case 2: {
                System.out.println("Ingrese su nombre completo:");
                vehiculo.nombre = entrada.nextLine();
                System.out.println("Ingrese su teléfono:");
                vehiculo.telefono = entrada.nextLine();
                System.out.println("Ingrese la marca del vehículo:");
                vehiculo.marca = entrada.nextLine();
                System.out.println("Ingrese la placa del vehículo:");
                vehiculo.placa = entrada.nextLine();

                System.out.println(retirar(vehiculo));
                break;
            }
            case 3: {
                System.out.println("Ingrese su nombre completo:");
                vehiculo.nombre = entrada.nextLine();
                System.out.println("Ingrese su teléfono:");
                vehiculo.telefono = entrada.nextLine();
                System.out.println("Ingrese la marca del vehículo:");
                vehiculo.marca = entrada.nextLine();
                System.out.println("Ingrese la placa del vehículo:");
                vehiculo.placa = entrada.nextLine();

                if (buscar(vehiculo)) {
                    System.out.println("\nSu vehículo se encuentra en el parqueadero.");
                }
                else {
                    System.out.println("\nSu vehículo NO se encuentra en el parqueadero.");
                }
                break;
            }
            case 4: {
                System.out.println("Gracias por usar nuestro servicio");
                break;
            }
        }
    }

    static public Boolean buscar(Vehiculo placa){

        if(parqueados.contains(vehiculo)) {
            return true;
        }
        return false;
    }

    static public String retirar(Vehiculo vehiculo){
        if(buscar(vehiculo)) {
            parqueados.remove(parqueados.indexOf(vehiculo));
            return "\nSu vehículo ha sido retirado del parqueadero.";
        }
        return "\nNo se ha encontrado su vehículo.";
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(parqueados.size()<=5) {

            System.out.println("\nElija una opción:\n"+
                    "1 - Ingresar al parqueadero\n"+
                    "2 - Retirar del parqueadero\n"+
                    "3 - Consultar si un vehículo se encuentra en el parqueadero\n"+
                    "4 - Salir del programa\n");

            opcion = input.nextInt();

            opcionesMenu();
        }
    }
}
