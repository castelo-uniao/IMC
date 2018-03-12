/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package entradasaida;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author digita
 */
public class CustomDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String t = (String)JOptionPane.showInputDialog(
            null, // Component
            "Lorem ipsum:\n" // Texto
            + "\"lorem...\"",
            "Caixa customizada", // Título
            JOptionPane.WARNING_MESSAGE, // Tipo
            null, // Ícone
            null, // Opções
            "ipsum" // Valor padrão
        ); 

        Double x = Math.floor(Double.parseDouble(t));
        
        JOptionPane.showMessageDialog(null, 
            x, // Texto
            "Título customizado", // Título
            JOptionPane.INFORMATION_MESSAGE // Tipo
        );
    }
    
}
