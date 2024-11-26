package cn.edu.nwpu;

public class FormatException extends Exception {
    public FormatException(String message) {
        super(FormatException.class.getName() + ": " + message);
    }
}
