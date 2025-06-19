/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author juane
 */
package Archivos;

import java.io.IOException;

public interface Deberes {
        void guardar(String ruta) throws IOException;
    void cargar(String ruta) throws IOException, ClassNotFoundException;
}
