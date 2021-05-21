package org.Charles.excep;

/**
 * @author Charles
 * @date 2021-05-17 18:33
 */

//Custom runtime exception
public class NotEnoughException extends RuntimeException {
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
