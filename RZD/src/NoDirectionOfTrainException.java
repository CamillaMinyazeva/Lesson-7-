public class NoDirectionOfTrainException extends RuntimeException {
    public NoDirectionOfTrainException(){
        super("Поезд не ходит по данному направлению. ");
    }
}