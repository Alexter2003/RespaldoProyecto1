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
public class Map {

    private section[][] map;
    private Position playerPosition;
    private Enemy[] enemiesPosition = new Enemy[3];
    private vehicle newVehicle;
    private int enemies = 0;

    public Map(section[][] map, int positionY, int positionX, int longitud, int longitud2, vehicle vehicle, Enemy enemy1, Enemy enemy2, Enemy enemy3) {
        this.map = new section[longitud][longitud2];
        this.map = map;
        Position newPlayer = new Position(positionY, positionX);
        playerPosition = newPlayer;
        newVehicle = vehicle;
        enemiesPosition[0]= enemy1;
        enemiesPosition[1]= enemy2;
        enemiesPosition[2]= enemy3;
        
    }

    public Enemy[] getEnemiesPosition() {
        return enemiesPosition;
    }

    public Position getPlayerPosition() {
        return playerPosition;
    }

    public vehicle getNewVehicle() {
        return newVehicle;
    }
    
    
    
    public section[][] getMap() {
        return map;
    }
    
    public Enemy getEnemy(int numberEnemy){
        return enemiesPosition[enemies];
    }

    public section getAPosicionMap(int y, int x) {
        return map[y][x];
    }

    public void setVehicle(vehicle newVehicle) {
        this.newVehicle = newVehicle;
    }

    public void addEnemy(int positionX, int positionY) {
        enemiesPosition[enemies] = new Enemy(positionX, positionY);
        enemies++;
    }

    public void move(int movedSpaces, String direction) {

    }

    public void moveVehicle(int movedSpaces, String direction) {
        PlayerSection playerSection = (PlayerSection) (map[playerPosition.getPositionY()][playerPosition.getPositionX()]);
        playerSection.setVechile(newVehicle);
        section aux = playerSection.getUnderSection();

        if (direction.equalsIgnoreCase("Derecha")) {
            section newSection = map[playerPosition.getPositionY()][playerPosition.getPositionX() + movedSpaces];
            if (playerSection.getVechile() instanceof Plane) {
                if (newSection instanceof Mountain) {
                    JOptionPane.showMessageDialog(null, "Un avion no puede estar en una montaña");
                } else {
                    playerSection.setUnderSection(newSection);
                    map[playerPosition.getPositionY()][playerPosition.getPositionX() + movedSpaces] = playerSection;
                    map[playerPosition.getPositionY()][playerPosition.getPositionX()] = aux;
                    playerPosition.setPositionX(playerPosition.getPositionX() + movedSpaces);
                }
            } else if (playerSection.getVechile() instanceof Tank) {
                if (newSection instanceof Mountain || newSection instanceof Water) {
                    JOptionPane.showMessageDialog(null, "Un tanque no puede estar en una montaña o en agua");
                } else {
                    playerSection.setUnderSection(newSection);
                    map[playerPosition.getPositionY()][playerPosition.getPositionX() + movedSpaces] = playerSection;
                    map[playerPosition.getPositionY()][playerPosition.getPositionX()] = aux;
                    playerPosition.setPositionX(playerPosition.getPositionX() + movedSpaces);
                }
            }

        } else if (direction.equalsIgnoreCase("Izquierda")) {
            section newSection = map[playerPosition.getPositionY()][playerPosition.getPositionX() - movedSpaces];
            if (playerSection.getVechile() instanceof Plane) {
                if (newSection instanceof Mountain) {
                    JOptionPane.showMessageDialog(null, "Un avion no puede estar en una montaña");
                } else {
                    playerSection.setUnderSection(newSection);
                    map[playerPosition.getPositionY()][playerPosition.getPositionX() - movedSpaces] = playerSection;
                    map[playerPosition.getPositionY()][playerPosition.getPositionX()] = aux;
                    playerPosition.setPositionX(playerPosition.getPositionX() - movedSpaces);
                }
            } else if (playerSection.getVechile() instanceof Tank) {
                if (newSection instanceof Mountain || newSection instanceof Water) {
                    JOptionPane.showMessageDialog(null, "Un tanque no puede estar en una montaña o en agua");
                } else {
                    playerSection.setUnderSection(newSection);
                    map[playerPosition.getPositionY()][playerPosition.getPositionX() - movedSpaces] = playerSection;
                    map[playerPosition.getPositionY()][playerPosition.getPositionX()] = aux;
                    playerPosition.setPositionX(playerPosition.getPositionX() - movedSpaces);
                }
            }
        } else if (direction.equalsIgnoreCase("Arriba")) {
            section newSection = map[playerPosition.getPositionY() - movedSpaces][playerPosition.getPositionX()];
            if (playerSection.getVechile() instanceof Plane) {
                if (newSection instanceof Mountain) {
                    JOptionPane.showMessageDialog(null, "Un avion no puede estar en una montaña");
                } else {
                    playerSection.setUnderSection(newSection);
                    map[playerPosition.getPositionY() - movedSpaces][playerPosition.getPositionX()] = playerSection;
                    map[playerPosition.getPositionY()][playerPosition.getPositionX()] = aux;
                    playerPosition.setPositionY(playerPosition.getPositionY() - movedSpaces);
                }
            } else if (playerSection.getVechile() instanceof Tank) {
                if (newSection instanceof Mountain || newSection instanceof Water) {
                    JOptionPane.showMessageDialog(null, "Un tanque no puede estar en una montaña o en agua");
                } else {
                    playerSection.setUnderSection(newSection);
                    map[playerPosition.getPositionY() - movedSpaces][playerPosition.getPositionX()] = playerSection;
                    map[playerPosition.getPositionY()][playerPosition.getPositionX()] = aux;
                    playerPosition.setPositionY(playerPosition.getPositionY() - movedSpaces);
                }
            }
        } else if (direction.equalsIgnoreCase("Abajo")) {
            section newSection = map[playerPosition.getPositionY() + movedSpaces][playerPosition.getPositionX()];
            if (playerSection.getVechile() instanceof Plane) {
                if (newSection instanceof Mountain) {
                    JOptionPane.showMessageDialog(null, "Un avion no puede estar en una montaña");
                } else {
                    playerSection.setUnderSection(newSection);
                    map[playerPosition.getPositionY() + movedSpaces][playerPosition.getPositionX()] = playerSection;
                    map[playerPosition.getPositionY()][playerPosition.getPositionX()] = aux;
                    playerPosition.setPositionY(playerPosition.getPositionY() + movedSpaces);
                }
            } else if (playerSection.getVechile() instanceof Tank) {
                if (newSection instanceof Mountain || newSection instanceof Water) {
                    JOptionPane.showMessageDialog(null, "Un tanque no puede estar en una montaña o en agua");
                } else {
                    playerSection.setUnderSection(newSection);
                    map[playerPosition.getPositionY() + movedSpaces][playerPosition.getPositionX()] = playerSection;
                    map[playerPosition.getPositionY()][playerPosition.getPositionX()] = aux;
                    playerPosition.setPositionY(playerPosition.getPositionY() + movedSpaces);
                }
            }
        }
    }

    public void attack(int positionY, int positionX) {
        PlayerSection playerSection = (PlayerSection) (map[playerPosition.getPositionY()][playerPosition.getPositionX()]);
        playerSection.setVechile(newVehicle);
        if (playerSection.getVechile().impact()) {
            if (map[positionY][positionX] instanceof EnemySection) {

                if (playerPosition.getPositionX() == positionX) {
                    EnemySection enemySection = (EnemySection) (map[positionY][positionX]);
                    enemySection.getEnemy().attacked(playerSection.getVechile().attack(distanceX(positionX)));
                    JOptionPane.showMessageDialog(null, "El disparo ha impactado");
                    if(!enemySection.getEnemy().isLife()){
                        map[positionY][positionX] = new Land();
                    }
                } else if (playerPosition.getPositionY() == positionY) {
                    EnemySection enemySection = (EnemySection) (map[positionY][positionX]);
                    enemySection.getEnemy().attacked(playerSection.getVechile().attack(distanceY(positionY)));
                    JOptionPane.showMessageDialog(null, "El disparo ha impactado");
                    if(!enemySection.getEnemy().isLife()){
                        map[positionY][positionX] = new Land();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El objetivo no esta en tu linea de tiro");
                }

            } else if (map[positionY][positionX] instanceof Mountain) {

                if (playerPosition.getPositionX() == positionX) {
                    Mountain mountainAttacked = (Mountain) map[positionY][positionX];
                    mountainAttacked.attacked(playerSection.getVechile().attack(distanceX(positionX)));
                    JOptionPane.showMessageDialog(null, "El disparo ha impactado");
                    if (!mountainAttacked.isLife()) {
                        map[positionY][positionX] = new Land();
                    }
                } else if (playerPosition.getPositionY() == positionY) {
                    Mountain mountainAttacked = (Mountain) map[positionY][positionX];
                    mountainAttacked.attacked(playerSection.getVechile().attack(distanceY(positionY)));
                    JOptionPane.showMessageDialog(null, "El disparo ha impactado");
                    if (!mountainAttacked.isLife()) {
                        map[positionY][positionX] = new Land();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El objetivo no esta en tu linea de tiro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningun objetivo que se pueda atacar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ah fallado el disparo");
        }
    }
    
    public void enemyAttack(int positionY, int positionX){
        if(map[positionY][positionX] instanceof PlayerSection){
            PlayerSection player =  (PlayerSection)(map[positionY][positionX]);
            player.getVechile().attacked(positionY);
        }
    }

    public int distanceX(int positionX) {
        if (positionX > playerPosition.getPositionX()) {
            return positionX - playerPosition.getPositionX();
        } else {
            return -(positionX - playerPosition.getPositionX());
        }
    }

    public int distanceY(int positionY) {
        if (positionY > playerPosition.getPositionY()) {
            return positionY - playerPosition.getPositionY();
        } else {
            return -(positionY - playerPosition.getPositionY());
        }
    }

}
