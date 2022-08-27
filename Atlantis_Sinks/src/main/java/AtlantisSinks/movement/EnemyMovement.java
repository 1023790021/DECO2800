package AtlantisSinks.movement;

import javax.print.DocFlavor;
import java.lang.annotation.Target;
import java.util.Objects;

public class EnemyMovement {
    private MovementType movementType;
    private int speed;

    private Coordinate coordinate;

    public EnemyMovement(MovementType movementType, int speed, Coordinate coordinate) {
        this.movementType = movementType;
        this.speed = speed;
        this.coordinat = coordinate;
    }

    public MovementType getMovementType() {
        return this.movementType;
    }

    // get enemy type
    public int getSpeed() {
        if (movementType.equals(MovementType.SLOW)) {
            speed = MovementType.SLOW.speed;
        } else if (movementType.equals(MovementType.MEDIUM)) {
            speed = MovementType.MEDIUM.speed;
        } else if (movementType.equals(MovementType.FAST)) {
            speed = MovementType.FAST.speed;
        }
        return speed;
    }

    // get enemy current coordinate
    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    // check if player in the attacking range of enemy (depending on the enemy attacking range)
    public aimTarget towardEntity(aimTarget target) {
        int distance = Math.pow((enemyCoordinate.getX() - playCoordinate.getX()), 2) + Math.pow((enemyCoordinate.getY() - playCoordinate.getY()), 2);
        if (distance <= attackrage) {
            target = player;
        } else {
            target = buildings;
        }
        return target;
    }

    // check if enemy is inside of map bounds
    public boolean isInMap() {
        return enemyCoordinate.getX() > 0 && ennemyCoordinate.getX() < map.getWidth() && enemyCoordinate.getY() > 0 && ennemyCoordinate.getY() < map.getHeight();
    }

    public String encode() {
        return String.format("%s%d", this.getMovementType(), this.getSpeed());
    }

    public int hashCode() {
        return Objects.hash(this.movementType, this.speed);
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof EnemyMovement)) {
            return false;
        }

        EnemyMovement other = (EnemyMovement) object;

        if (!other.getMovementType().equals(this.getMovementType())) {
            return false;
        }

        return other.speed == this.speed;
    }

    public String toString() {
        return String.format("%s%d", this.getMovementType(), this.getSpeed());
    }
}
