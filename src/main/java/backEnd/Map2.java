/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class Map2 {
     private vehicle vehicleInBattle;
     
     private section[][] map2 = new section[][]{
        {new Land(), new Land(), new Land(), new Mountain(), new EnemySection(new Enemy(0, 4)), new Water(),new Water(),new Water(),new Water(), new Water()},
        {new Land(), new Land(), new Land(), new Land(), new Land(), new EnemySection(new Enemy(1, 5)),new Land(),new Water(),new Water(),new Water()},
        {new Mountain(), new Mountain(), new Land(), new Land(), new Land(), new Land(),new Land(),new Water(),new Land(),new Land()},
        {new Land(), new Land(), new Land(), new Land(), new Land(), new Land(), new Water(), new Water(), new Land(), new Land()},
        {new Water(), new Land(), new Land(), new Land(), new Land(), new Land(), new Water(), new Water(), new Land(), new Land()},
        {new Water(), new Water(), new PlayerSection(vehicleInBattle, new Land()), new Land(), new Land(), new Land(), new Land(), new Land(), new Land(), new Land()},
        {new Land(), new Land(), new Land(), new Land(), new Land(), new Land(), new Land(), new Land(), new Land(), new Land(), new Land()},
        {new Land(), new Land(), new Land(), new Land(), new Land(), new Land(), new EnemySection(new Enemy(6, 7)), new Land(), new Land(), new Land(), new Land()},
        {new Mountain(), new Mountain(),new Land(), new Land(), new Water(), new Water(), new Mountain(), new Mountain(),new Land(), new Land()},
        {new Mountain(), new Mountain(),new Land(), new Land(), new Water(), new Water(), new Mountain(), new Mountain(),new Land(), new Land()}
            
    };

    public Map2(vehicle vehicleInBattle) {
        this.vehicleInBattle = vehicleInBattle;
    }

    public section[][] getMap2() {
        return map2;
    }

    
     
     
}
