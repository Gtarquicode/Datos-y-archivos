/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juane
 */
package Archivos;

// Clase Profesor que hereda de Persona
public class Profesor extends Persona {
    private static final long serialVersionUID = 1L;

    // Atributos adicionales
    private String departamento;
    private double salario;

    // Constructor
    public Profesor(String nombre, int edad, String departamento, double salario) {
        super(nombre, edad);
        this.departamento = departamento;
        this.salario = salario;
    }

    // Getters y setters
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Representación en texto
    @Override
    public String toString() {
        return "Profesor[" + super.toString() + ", depto=" + departamento + ", salario=" + salario + "]";
    }
}

