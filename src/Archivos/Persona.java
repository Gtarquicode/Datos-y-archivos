/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juane
 */
package Archivos;

import java.io.*;

// Clase abstracta base que implementa la interfaz Deberes y Serializable
public abstract class Persona implements Deberes, Serializable {
    private static final long serialVersionUID = 1L; // ID de versión para control de serialización

    // Atributos comunes
    protected String nombre;
    protected int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    // Implementación del método guardar: guarda el objeto actual en un archivo
    @Override
    public void guardar(String ruta) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(this); // Serializa el objeto completo
        }
    }

    // Implementación del método cargar: carga los datos desde un archivo
    @Override
    public void cargar(String ruta) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            Persona p = (Persona) ois.readObject(); // Se lee el objeto serializado
            this.nombre = p.nombre;
            this.edad = p.edad;
        }
    }

    // Representación en texto
    @Override
    public String toString() {
        return "Persona[nombre=" + nombre + ", edad=" + edad + "]";
    }
}
 
