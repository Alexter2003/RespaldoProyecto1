/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class Mountain implements section {

    private int HP = 10;

    @Override
    public String GetImagen() {
        if (isLife()) {
            return "src/main/java/Media/mountain.png";
        } else {
            return "src/main/java/Media/Land.png";
        }
    }

    public void attacked(int damage) {
        HP -= damage;

    }

    public boolean isLife() {
        return HP > 0;
    }
}
