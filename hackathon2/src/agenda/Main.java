package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeContacto listaDeContacto = new ListaDeContacto();
        int opcion;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bienvenido a su agenda, elija la opción ingresando el número:");
            System.out.println(
                    "1. Añadir contacto\n"+
                    "2. Verificar si existe el contacto\n"+
                    "3. Lista de contactos\n"+
                    "4. Buscar contacto \n"+
                    "5. Eliminar contacto\n"+
                    "6. Modificar teléfono\n"+
                    "7. Verificar si la agenda está llena\n"+
                    "8. Consultar espacio disponible en la agenda\n"+
                    "9. No realizar ninguna acción\n");



            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer después de nextInt()

            switch (opcion) {

                case 1:///Añadir Contacto
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();

                    Contacto nuevoContacto = new Contacto(nombre, apellido, numero);
                    listaDeContacto.añadirContacto(nombre, apellido, numero);
                    System.out.println("\n");
                    break;
                case 2:///Existencia de Contacto
                    System.out.print("Nombre: ");
                    String nombreExiste = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoExiste = scanner.nextLine();
                    boolean existencia = listaDeContacto.existeContacto(nombreExiste, apellidoExiste);
                    if (existencia == true){
                        System.out.println("El contancto existe");
                    }else {
                        System.out.println("El contacto no existe");
                    }
                    System.out.println("\n");
                    break;

                case 3://Lista de Contacto
                    listaDeContacto.listarContactos();
                    System.out.println("\n");
                    break;



                case 4://Buscar Contacto

                    System.out.println("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();

                    System.out.println("Ingrese el apellido del contacto a buscar:");
                    String apellidoBuscar = scanner.nextLine();

                    listaDeContacto.buscaContacto(nombreBuscar, apellidoBuscar);
                    System.out.println("\n");
                    break;

                case 5:////Eliminar contacto
                    System.out.println("Ingrese el Nombre del contacto a eliminar:");
                    String nombreEliminar = scanner.nextLine();

                    System.out.println("Ingrese el Apellido del contacto a eliminar:");
                    String apellidoEliminar = scanner.nextLine();

                    listaDeContacto.eliminarContacto(nombreEliminar, apellidoEliminar);
                    System.out.println("\n");
                    break;

                case 6: //Modificar número
                    System.out.println("Ingrese el Nombre del contacto:");
                    String nombreNumero = scanner.nextLine();

                    System.out.println("Ingrese el Apellido del contacto:");
                    String apellidoNumero = scanner.nextLine();

                    System.out.println("Ingrese el nuevo numero de teléfono: ");
                    String numeroNuevo= scanner.nextLine();

                    listaDeContacto.modificarTelefono(nombreNumero,apellidoNumero,numeroNuevo);
                    System.out.println("\n");
                    break;

                case 7://Agenda llena
                    boolean listaLlena = listaDeContacto.agendaLlena();
                    if (listaLlena== true){
                        System.out.println("Lista de contactos llena");
                    }else{
                        System.out.println("Tiene espacios disponibles");
                    }
                    System.out.println("\n");
                    break;

                case 8://Espacio libre
                    listaDeContacto.espacioLibres();
                    System.out.println("\n");
                    break;

                case 9:
                    System.out.println("Está saliendo de su agenda");
                    System.out.println("\n");
                    break;
            }
        }while (opcion!=9);
    }
}
