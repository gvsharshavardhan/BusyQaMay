package bankProject;

public class InvalidCredentialsException extends RuntimeException{
    InvalidCredentialsException(String message){
        super(message);
    }
}
