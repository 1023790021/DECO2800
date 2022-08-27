package AtlantisSinks.movement;

public class EnemyMoveEvent extends EnemyMovement{
    public EnemyMoveEvent(MovementType movementType, int speed, Coordinate coordinate) {
        super(movementType, speed, coordinate);
    }

    @Override
    public String toString() {
        
    }
}
