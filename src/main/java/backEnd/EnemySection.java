/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class EnemySection implements section {

    private Enemy enemy;

    public EnemySection(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    @Override
    public String GetImagen() {
        if (enemy.isLife()) {
            return "src/main/java/Media/Enemy.png";
        } else {
            return "src/main/java/Media/Dead.png";
        }
    }

}
