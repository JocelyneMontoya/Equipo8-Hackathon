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

            switch (opcion) {
                case 1:///Añadir Contacto
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Número: ");
                    String numero = scanner.nextLine();

                    Contacto nuevoContacto = new Contacto(nombre, apellido, numero);
                    listaDeContacto.añadirContacto(nuevoContacto);
                    break;
                case 2:///Existencia de Contacto
                    listaDeContacto.listarContactos();
                    break;
                case 3://Lista de Contacto
                case 4://Buscar Contacto
                case 5:////Eliminar contacto
                    scanner.nextLine(); // Limpiar el buffer después de nextInt()

                    System.out.println("Ingrese el Nombre del contacto a eliminar:");
                    String nombreEliminar = scanner.nextLine();

                    System.out.println("Ingrese el Apellido del contacto a eliminar:");
                    String apellidoEliminar = scanner.nextLine();

                    listaDeContacto.eliminarContacto(nombreEliminar, apellidoEliminar);

                case 6: //Modificar número
                    scanner.nextLine(); // Limpiar el buffer después de nextInt()

                    System.out.println("Ingrese el Nombre del contacto:");
                    String nombreNumero = scanner.nextLine();

                    System.out.println("Ingrese el Apellido del contacto:");
                    String apellidoNumero = scanner.nextLine();
                    System.out.println("Ingrese el nuevo numero de teléfono: ");
                    String numeroNuevo= scanner.nextLine();

                    listaDeContacto.modificarTelefono(nombreNumero,apellidoNumero,numeroNuevo);

                case 7://Agenda llena
                    listaDeContacto.agendaLlena();

                case 8://Espacio libre
                    listaDeContacto.espacioLibres();

                case 9:
                    System.out.println("Está saliendo de su agenda");
                    break;
            }
        }while (opcion!=9);
    }
}
