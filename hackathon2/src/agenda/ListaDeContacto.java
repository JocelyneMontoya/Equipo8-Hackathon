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

    public void añadirContacto (String nombre, String apellido, String numero) {

    }
    public void existeContacto(String nombre, String apellido, String numero){

    }
    public void listarContactos(String nombre, String apellido, String numero){

    }
    public void buscaContacto(String nombre, String apellido, String numero){

    }
    public void eliminarContacto(String nombre, String apellido, String numero){

    }
    public void agendaLlena (String nombre, String apellido, String numero){

    }
    public void espacioLibres (String nombre, String apellido, String numero){

    }
}
