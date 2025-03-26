package agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeContacto {

    ArrayList<Contacto> listaDeContacto;

    public ListaDeContacto() {
        this.listaDeContacto = new ArrayList<>(10);
    }

    //Funcionalidades

    public void añadirContacto (Contacto c) {
        if (agendaLlena()) {
            System.out.println("La agenda está llena, no se pueden añadir más contactos.");
        } else if (existeContacto(c)) {
            System.out.println("El contacto con nombre " + c.getNombre() + " ya existe.");
        } else {
            listaDeContacto.add(c);
            System.out.println("Contacto añadido correctamente.");
        }

    }
    public boolean existeContacto(Contacto c) {
        for (Contacto contacto : listaDeContacto) {
            if (contacto.getNombre().equalsIgnoreCase(c.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public boolean listarContactos(String nombre, String apellido, String numero){

        if (listaDeContacto.isEmpty()){
            System.out.println("Agenda vacía");
        }else {
            System.out.println("Contactos: ");
            for (Contacto contacto : listaDeContacto){
                System.out.println("Contacto: " + contacto);
            }
        }


    }
    public void buscaContacto(String nombre, String apellido){
        listaDeContacto.forEach(contacto -> {
            if (contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Contacto: " + contacto);
            }
        });



    }
    public void eliminarContacto(String nombre, String apellido){
        //Iterator para recorrer la lista
        Iterator<Contacto>contactoIterator = listaDeContacto.iterator();
        boolean encontrado = false; //será true cuando se encuentre

        while (contactoIterator.hasNext()){ //hasNext() true hay elementos en la lista
            Contacto contacto = contactoIterator.next(); //iterador.next obtiene el elemento en la lista y lo guarda en contacto
            if (contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellido().equalsIgnoreCase(apellido)) {
                contactoIterator.remove(); //quita el contacto
                System.out.println("Contacto eliminado con éxito");
                encontrado = true;
                 break;
            }
        }
        if(encontrado==false){
            System.out.println("Contacto no encontrado");
        }
    }

    public void modificarTelefono(String nombre, String apellido, String numero){
        //For para recorrer lista de contacto y buscar si está
        boolean encontrado = false; //será true cuando se encuentre
        for(Contacto contacto : listaDeContacto){
            if(contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellido().equalsIgnoreCase(apellido)){
                contacto.setNumero(numero);
                System.out.println("Numero modificado con éxito");
                encontrado=true;
            }
        }
        if(encontrado==false){
            System.out.println("Contacto no encontrado");
        }
    }

    public boolean agendaLlena (){
        if(listaDeContacto.size()==10){
            System.out.println("Lista de contactos llena");
        }else{
            System.out.println("Tiene " +listaDeContacto.size()+" contactos. \nLe sobran "+ (10-listaDeContacto.size())+" de los 10 espacios disponibles");
        }
    }

    public void espacioLibres (){
        System.out.println("Espacios disponibles en lista de contactos: "+(10-listaDeContacto.size()));
    }
}
