/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juane
 */
package Archivos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Para leer por teclado

        try {
            // ESTUDIANTE
            System.out.println("=== REGISTRO DE ESTUDIANTE ===");
            System.out.print("Nombre: ");
            String nombreEst = sc.nextLine();

            System.out.print("Edad: ");
            int edadEst = Integer.parseInt(sc.nextLine());

            System.out.print("Número de matrícula: ");
            String matricula = sc.nextLine();

            System.out.print("Carrera: ");
            String carrera = sc.nextLine();

            // Crear y guardar el estudiante
            Estudiante estudiante = new Estudiante(nombreEst, edadEst, matricula, carrera);
            estudiante.guardar("estudiante.ser");
            System.out.println("✅ Estudiante guardado con éxito.\n");

            //PROFESOR 
            System.out.println("=== REGISTRO DE PROFESOR ===");
            System.out.print("Nombre: ");
            String nombreProf = sc.nextLine();

            System.out.print("Edad: ");
            int edadProf = Integer.parseInt(sc.nextLine());

            System.out.print("Departamento: ");
            String departamento = sc.nextLine();

            System.out.print("Salario: ");
            double salario = Double.parseDouble(sc.nextLine());

            // Crear y guardar el profesor
            Profesor profesor = new Profesor(nombreProf, edadProf, departamento, salario);
            profesor.guardar("profesor.ser");
            System.out.println("✅ Profesor guardado con éxito.\n");

            //CARGAR Y MOSTRAR
            Estudiante estudianteCargado = new Estudiante("", 0, "", "");
            estudianteCargado.cargar("estudiante.ser");
            System.out.println("📂 Estudiante cargado: " + estudianteCargado);

            Profesor profesorCargado = new Profesor("", 0, "", 0.0);
            profesorCargado.cargar("profesor.ser");
            System.out.println("📂 Profesor cargado: " + profesorCargado);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("❌ Error: " + e.getMessage());
        }

        sc.close(); // Cerramos el scanner al final
    }
}
