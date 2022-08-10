package com.company;

public class Main {

    public static void main(String[] args) {
        Persona person1 = new Persona();

        person1.setEdad(28);
        person1.setNombre("Sarah");
        person1.setTelefono("7973548");
        System.out.println("Nombre: " + person1.getNombre() + ", Edad: " + person1.getEdad() + ", Telefono: " + person1.getTelefono());

    }
}

class Persona{

    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
