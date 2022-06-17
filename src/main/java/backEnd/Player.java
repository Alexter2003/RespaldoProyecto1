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
public class Player {

    private String name = null;
    private vehicle[] team = new vehicle[3];
    private int position = 0;

    public Player(String name) {
        this.name = name;
        
    }

    public String getName() {
        return name;
    }

    public vehicle[] getTeam() {
        return team;
    }

    public void setTeam(vehicle[] team) {
        this.team = team;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void addVehicle(vehicle newVehicle) {
        if (position > 2) {
            JOptionPane.showMessageDialog(null, "No te puedes agregar mas vehiculos");
        } else {
            team[position] = newVehicle;
            position++;
        }
    }

    public vehicle getVehicle(int numberVehicle) {
        return team[numberVehicle];
    }
}
