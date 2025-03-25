package agenda;

import java.util.ArrayList;

public class ListaDeContacto {

    ArrayList<Contacto> listaDeContacto;

    public ListaDeContacto() {
        this.listaDeContacto = new ArrayList<>();
    }
    public ListaDeContacto(int tamaño){
        this.listaDeContacto = new ArrayList<>(tamaño);
    }


    //Funcionalidades

    public void añadirContacto (String nombre, String apellido, String numero) {

    }
    public void existeContacto(String nombre, String apellido, String numero){

    }
    public void listarContactos(String nombre, String apellido, String numero){

    }
    public void buscaContacto(String nombre, String apellido, String numero){


    }
    public void eliminarContacto(String nombre, String apellido){
        //For para recorrer lista de contacto y buscar si está
        for(Contacto contacto : listaDeContacto){
            if(contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellido().equalsIgnoreCase(apellido)){
                listaDeContacto.remove(contacto);
                System.out.println("Contacto eliminado con éxito");
            } else {
            System.out.println("Contacto no encontrado");
            }
        }
    }

    public void modificarTelefono(String nombre, String apellido, String numero){
        //For para recorrer lsita d econtacto y buscar si está
        for(Contacto contacto : listaDeContacto){
            if(contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellido().equalsIgnoreCase(apellido)){
                //si nombre y apellido ingresado son iguales a algun contacto, entonces cambiar numero
                listaDeContacto.remove(2);
                //listaDeContacto.add(2,numero);
            } else {
                System.out.println("Contacto no encontrado");
            }

        }

    }

    public void agendaLlena (String nombre, String apellido, String numero){
        if(listaDeContacto.size()==10){
            System.out.println("Lista de contactos llena");
        }else{
            System.out.println("Contactos en lista "+listaDeContacto.size()+ "de 10");
        }
    }

    public void espacioLibres (String nombre, String apellido, String numero){
        System.out.println("Espacios vacios en lista de contactos: "+(10-listaDeContacto.size()));
    }
}
