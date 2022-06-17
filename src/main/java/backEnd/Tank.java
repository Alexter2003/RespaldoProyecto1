/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class Tank extends vehicle{
    public Tank(){
        damage = 10;
        shield = 6;
        punteria = 50;
    }

   
    public int specialAtack() {
        return damage*2;
    }
    
}
