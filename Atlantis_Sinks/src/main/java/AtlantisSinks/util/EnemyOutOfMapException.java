package AtlantisSinks.util;

public class EnemyOutOfMapException extends Exception {
    public EnemyOutOfMapException() {
        super();
    }

    public EnemyOutOfMapException(String message) {
        super(message);
    }

    public EnemyOutOfMapException(Throwable cause) {
        super(cause);
    }

    public EnemyOutOfMapException(String message, Throwable cause) {
        super(message, cause);
    }
}
