/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class PlayerCreator {
    private Player newPlayer;
    
    public PlayerCreator(String name){
        newPlayer =  new Player(name);
    }
    
    public Player getPlayer(){
        return newPlayer;
    }
}
