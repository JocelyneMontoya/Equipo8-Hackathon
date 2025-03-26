package agenda;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeContacto {

    ArrayList<Contacto> listaDeContacto;

    public ListaDeContacto() {
        this.listaDeContacto = new ArrayList<>(10);
    }

    //Funcionalidades

    public void añadirContacto (String nombre, String apellido, String numero) {
        if (agendaLlena() == true) {
            System.out.println("La agenda está llena, no se pueden añadir más contactos.");
        } else if (existeContacto(nombre, apellido)) {
            System.out.println("El contacto con nombre ya existe.");
        } else {
            listaDeContacto.add(new Contacto(nombre, apellido, numero));
            System.out.println("Contacto añadido correctamente.");
        }

    }
    public boolean existeContacto(String nombre, String apellido) {
        boolean existencia = false;
        for (Contacto contacto : listaDeContacto) {
            if (contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellido().equalsIgnoreCase(apellido)) {
                existencia= true;
            }
        }
        return existencia;
    }

    public void listarContactos(){

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
        boolean encontrar = false;
        for (Contacto contacto : listaDeContacto) {
            if (contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Contacto: "+ contacto.getNumero());
                encontrar=true;
            }
        }if (encontrar == false){
            System.out.println("Contacto no encontrado");
        }
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
            return true;
        }else{
             return false;
        }
    }

    public void espacioLibres (){
        System.out.println("Espacios disponibles en lista de contactos: "+(10-listaDeContacto.size()));
    }
}
