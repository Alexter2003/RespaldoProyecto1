/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class Map1 {
    private vehicle vehicleInBattle;
    
    private section[][] map1 = new section[][]{
        {new Land(), new EnemySection(new Enemy(1, 0)), new EnemySection(new Enemy(2, 0)), new Land(), new Land(), new Land()},
        {new Land(), new Land(), new Land(), new Land(), new EnemySection(new Enemy(4, 1)), new Water()},
        {new Mountain(), new Land(), new Mountain(), new Mountain(), new Land(), new Water()},
        {new Mountain(), new Land(), new Mountain(), new Mountain(), new Land(), new Land()},
        {new Land(), new Land(), new Land(), new Land(), new Land(), new Land()},
        {new Land(), new Land(), new PlayerSection(vehicleInBattle, new Land()), new Land(), new Land(), new Land()}
    };
    
    
    
    
    public Map1(vehicle vehicleInBattle) {
        this.vehicleInBattle = vehicleInBattle;
    }

    public section[][] getMap1() {
        return map1;
    }
    
    
}
