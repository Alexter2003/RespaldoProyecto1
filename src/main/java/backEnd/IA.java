/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

import java.util.Random;

/**
 *
 * @author julio
 */
public class IA {
    private boolean mode = true;

    public boolean isMode() {
        return mode;
    }

    public void setMode(boolean mode) {
        this.mode = mode;
    }
    
    
    // modo facil
    public boolean shootingDirection(){
        Random rdm = new Random();
        int direction =  rdm.nextInt(2)+1;
        return direction == 1;
    }
    
    
    // modo dificl
    
    public boolean shooting(int playerY, int playerX,int enemyY, int enemyX){
            if(playerY == enemyY){
                return true;
            }else return playerX == enemyX;
        
    }
}
