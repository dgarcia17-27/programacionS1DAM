package cliente;

import base.Persona;

public class Cliente extends Persona{
    // ATRIBUTOS
    private String numCliente; // "0001"

    // CONSTRUCTOR
    public Cliente(String nombre, int edad, String direccion, String pais, String numCliente){
        super(nombre, edad, direccion, pais);
        this.numCliente = numCliente;
    }

    // MÉTODOS
    public void mostrarCliente(){
        System.out.println("Número del cliente: " + this.numCliente);
        mostrarEdad();
        System.out.println("Nombre: " + getNombre());
    }

}
