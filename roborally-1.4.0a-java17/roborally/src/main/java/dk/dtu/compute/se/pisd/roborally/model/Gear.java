package dk.dtu.compute.se.pisd.roborally.model;

import dk.dtu.compute.se.pisd.roborally.controller.GameController;

public class Gear {
    public Direction direction;

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public Gear(Direction direction) {
        this.direction = direction;
    }

    public boolean setDirection(GameController gC, Space space) {
        Player player = space.getPlayer();

        switch (direction) {


            case LEFT:
                gC.turnLeft(player);
                break;


            case RIGHT:
                gC.turnRight(player);
                break;

        }
        return true;

    }
}


