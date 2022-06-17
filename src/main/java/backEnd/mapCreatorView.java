/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author julio
 */
public class mapCreatorView{
    section[][] map;
    JPanel panel;
    JLabel [][] matriz;
    
    
    public mapCreatorView (JPanel panel, section[][] map){
        this.panel =  panel;
        this.map = map;
        
    }
    
    public void createArray(int fila, int columna){
        panel.removeAll();
        matriz =  new JLabel[fila][columna];
        fila = 990/fila;
        columna = 420/columna;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                JLabel lbl =  new JLabel(new ImageIcon(map[j][i].GetImagen()));
                lbl.setBounds(fila * i, columna * j, fila, columna );
                lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                matriz[i][j] = lbl; 
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                panel.add(matriz[j][i]);
                panel.repaint();
            }
        }
    }
            
}
