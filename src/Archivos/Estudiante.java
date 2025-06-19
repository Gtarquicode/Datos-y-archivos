/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juane
 */
package Archivos;

// Clase Estudiante que hereda de Persona
public class Estudiante extends Persona {
    private static final long serialVersionUID = 1L;

    // Atributos adicionales
    private String numeroMatricula;
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String numeroMatricula, String carrera) {
        super(nombre, edad);
        this.numeroMatricula = numeroMatricula;
        this.carrera = carrera;
    }

    // Getters y setters
    public String getNumeroMatricula() { return numeroMatricula; }
    public void setNumeroMatricula(String numeroMatricula) { this.numeroMatricula = numeroMatricula; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    // Representación en texto
    @Override
    public String toString() {
        return "Estudiante[" + super.toString() + ", matrícula=" + numeroMatricula + ", carrera=" + carrera + "]";
    }
}
