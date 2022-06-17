/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class Plane extends vehicle{
    private int speed = 1;
    
    public Plane(){
        damage = 7;
        shield = 3;
        punteria = 70;
    }

    
    public int specialAtack() {
        shield += 5;
        return damage/2;
        
    }
    
    @Override
    public int Damage(int distance){
        return (damage*speed)-distance;
    }
    
    
}
