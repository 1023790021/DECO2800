package AtlantisSinks.movement;

import java.util.Objects;

public class EnemyMovement {
    private MovementType movementType;
    private int speed;

    public EnemyMovement(MovementType movementType, int speed) {
        this.movementType = movementType;
        this.speed = speed;
    }

    public MovementType getMovementType() {
        return this.movementType;
    }

    // get the enemy type
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

    // check if player in the attacking range of enemy
    public boolean towardEntity() {
        return false;
    }

    // check if next pixel is possible to move
    public boolean canMove() {
        return false;
    }

    public String encode() {
        return String.format("%s%d", this.getMovementType(), this.getSpeed());
    }

    public int hashCode() {
        return Objects.hash(this.movementType);
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

        return false;
    }

    public String toString() {
        return String.format("%s%d", this.getMovementType(), this.getSpeed());
    }
}
