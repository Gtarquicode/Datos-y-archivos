/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juane
 */
package Archivos;

public class Main {
    public static void main(String[] args) {
        try {
            // Creamos y guardamos un estudiante
            Estudiante est = new Estudiante("Ana", 20, "2025001", "Ingeniería");
            est.guardar("estudiante.ser");

            // Creamos y guardamos un profesor
            Profesor prof = new Profesor("Carlos", 45, "Matemáticas", 3000.0);
            prof.guardar("profesor.ser");

            // Cargamos los datos de los archivos
            Estudiante est2 = new Estudiante("", 0, "", "");
            est2.cargar("estudiante.ser");
            System.out.println("Estudiante cargado: " + est2);

            Profesor prof2 = new Profesor("", 0, "", 0.0);
            prof2.cargar("profesor.ser");
            System.out.println("Profesor cargado: " + prof2);

        } catch (Exception e) {
            System.err.println("Ocurrió un error al cargar los datos: " + e.getMessage());
             // En caso de error, mostramos el mensaje
        }
    }
}
