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
public class Enemy  {

    private int HP = 20;
    private int positionX;
    private int positionY;
    private boolean life =  true;

    public Enemy(int positionY, int positionX) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
    
    
    
    public boolean getLife(){
        return life;
    }

    public int attackInX(int sizeMap){
        Random random = new Random();
        int direction = random.nextInt(sizeMap);
        
        return direction;
    }
    
    public int attackInY(int sizeMap){
       Random random = new Random();
        int direction = random.nextInt(sizeMap);
        
        return direction;
    }
    
    public void attacked(int damageReduce){
        HP -= damageReduce;
        if(!isLife()){
            life =  false;
        }
    }
    
    public boolean isLife(){
        return HP>0;
    }

    

}
