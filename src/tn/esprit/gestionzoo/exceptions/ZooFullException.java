package tn.esprit.gestionzoo.exceptions;

public class ZooFullException extends Exception {
    public ZooFullException(){}

    public ZooFullException(String message){
        super(message);
    }
}
