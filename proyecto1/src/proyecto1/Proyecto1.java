/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import javax.swing.SwingUtilities;

/**
 *
 * @author diegormsb
 */
public class Proyecto1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            empresaInterfaz inicio = new empresaInterfaz();
            inicio.setVisible(true);


        });
    }
}
