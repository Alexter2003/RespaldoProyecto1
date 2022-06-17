/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class Shop {

    private int oro = 100;
    private int numberShopVehicle = 0;

    public int getOro() {
        return this.oro;
    }

    public boolean canBuy() {
        if (oro > 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No tienes el dinero suficiente");
            return false;
        }
    }

    public void buyTank() {
        if (canBuy()) {
            if (numberShopVehicle < 2) {
                oro -= 30;
                numberShopVehicle++;
            }
        }

    }

    public void buyPlane() {
        if (canBuy()) {
            if (numberShopVehicle < 2) {
                oro -= 30;
                numberShopVehicle++;
            }
        }
    }
    
    public void buyWeapon(int weaponNumber){
        if(canBuy()){
            if(weaponNumber == 0){
                oro -= 15;
            }else if(weaponNumber == 1){
                oro -= 15;
            }else{
                oro -= 20;
            }
        }
    }
    
    public void buyKits (int kitsNumber){
        if(canBuy()){
            if(kitsNumber == 0){
                oro -= 10;
            }else{
                oro -= 20;
            }
        }
    }
    
    public void buyRepair(){
        oro -= 40;
    }
    
    
}
