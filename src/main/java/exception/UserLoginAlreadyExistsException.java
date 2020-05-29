package exception;

public class UserLoginAlreadyExistsException extends Exception {
    public UserLoginAlreadyExistsException() {
    }

    public UserLoginAlreadyExistsException(String message) {
        super(message);
    }
}
