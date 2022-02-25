public class WrongTicketNumber extends Exception {
    public WrongTicketNumber(String s) {
        super("Неверный номер билета. " + s );
    }
}