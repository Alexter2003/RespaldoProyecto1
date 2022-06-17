/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author julio
 */
public class PlayerSection implements section {

    private vehicle vechile;
    private section underSection;

    public PlayerSection(vehicle vechile, section underSection) {
        this.vechile = vechile;

        this.underSection = underSection;
    }

    public vehicle getVechile() {
        return vechile;
    }

    public void setVechile(vehicle vechile) {
        this.vechile = vechile;
    }

    public section getUnderSection() {
        return underSection;
    }

    public void setUnderSection(section underSection) {
        this.underSection = underSection;
    }

    @Override
    public String GetImagen() {
        
            return "src/main/java/Media/Vehicle.png";
       

    }

}
