package AtlantisSinks.movement;

public enum MovementType {
    SLOW(1),
    MEDIUM(3),
    FAST(5);

    public final int speed;
    MovementType(int speed) {
        this.speed = speed;
    }
}
