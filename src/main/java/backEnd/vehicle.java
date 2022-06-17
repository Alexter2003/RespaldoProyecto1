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
public class vehicle  {

    private String name;
    private int level = 1;
    private int HP = 50;
    private int PP = 5;
    private int XP = 0;
    private Weapon firstWeapon = null;
    protected int damage;
    protected int shield;
    protected int punteria;
    private boolean dead = false;

    
    public int attack(int distance){
        if(impact()){
            return Damage(distance);
        }else{
            System.out.println("Fallo es disaparo");
            return 0;
        }
    }
    

    //determinar si dio el disparo
    public boolean impact() {
        Random random = new Random();

        int probability = random.nextInt(99 + 1) + 1;

        return probability <= punteria;
    }

    //determinar la reduccion de daño por distancia
    public int Damage(int distance) {
        return damage - distance;
    }

    public void attacked(int DamageEnemy) {
        HP = HP - damageReduction(DamageEnemy);
        if (HP <= 0) {
            dead = true;
        }
    }

    public boolean isDead() {
        return dead;
    }

    public int damageReduction(int DamageEnemy) {
        return DamageEnemy - DamageEnemy * shield * 10 ^ -2;
    }

    public void addWeapon(Weapon newWeapon) {
        firstWeapon = newWeapon;
        damage += (firstWeapon.getDamage());
        punteria += (firstWeapon.getPunteria());
    }

    public void repair(int extraHP) {
        HP += extraHP;
    }

    public void restore() {
        HP += 50;
    }
}
