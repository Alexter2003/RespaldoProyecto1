/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class Map3 {
    private vehicle vehicleInBattle;
    
    private section[][] map3 = new section[][]{
        {new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Water(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),},
        {new Land(),new Land(),new Water(),new Water(),new Water(),new Land(),new Land(),new Water(),new Land(),new Land(),new Mountain(),new Mountain(),new Mountain(),new Land(),new Land()},
        {new Land(),new Land(),new Water(),new Water(),new Water(),new Land(),new Land(),new Water(),new Land(),new Land(),new Mountain(),new Mountain(),new Mountain(),new Land(),new Land()},
        {new Land(),new Land(),new Land(),new EnemySection(new Enemy(3,3)),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new EnemySection(new Enemy(3,11)),new Land(),new Land(),new Land()},
        {new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land()},
        {new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land()},
        {new Mountain(),new Mountain(),new Mountain(),new Mountain(),new Land(),new Land(),new Land(),new EnemySection(new Enemy(6,7)),new Land(),new Land(),new Land(),new Mountain(),new Mountain(),new Mountain(),new Mountain()},
        {new Water(),new Water(),new Water(),new Mountain(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Mountain(),new Water(),new Water(),new Water()},
        {new Water(),new Water(),new Water(),new Mountain(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Mountain(),new Water(),new Water(),new Water()},
        {new Mountain(),new Mountain(),new Mountain(),new Mountain(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Mountain(),new Mountain(),new Mountain(),new Mountain()},
        {new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land()},
        {new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land()},
        {new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land(),new Land()},
        {new Land(),new Land(),new Mountain(),new Mountain(),new Mountain(),new Land(),new Land(),new  PlayerSection(vehicleInBattle, new Land()),new Land(),new Land(),new Water(),new Water(),new Water(),new Land(),new Land()},
        {new Land(),new Land(),new Mountain(),new Mountain(),new Mountain(),new Land(),new Land(),new  Land(),new Land(),new Land(),new Water(),new Water(),new Water(),new Land(),new Land()},
    };
    
    public Map3(vehicle vehicleInBattle){
        this.vehicleInBattle = vehicleInBattle;
    }

    public section[][] getMap3() {
        return map3;
    }
    
    
}
