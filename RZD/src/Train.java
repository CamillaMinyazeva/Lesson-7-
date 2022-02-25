public class Train {
    public static int speed;
    public static boolean isComing;
    private boolean isStanding;
    private int numbersOfWagons;
    private String direction;
    private String typeOfTransportation;


    public Train( String direction,int numbersOfWagons, String typeOfTransportation) {

        this.direction = direction;
        this.numbersOfWagons = numbersOfWagons;
        this.typeOfTransportation = typeOfTransportation;
    }

    public static void go(int currentSpeed) {
        isComing = true;
        speed = currentSpeed;
        System.out.println("Поезд тронулся" + " скорость поезда " + currentSpeed);
    }

    public void setStop(boolean stop) {
        isStanding = stop;
        System.out.println("направление " + direction+   " остановился");
    }

    public void viewedStatus() {
        System.out.println((isStanding == false) ? "Поезд идет " : "Поезд остановился");
    }

    public String getDirection() {
        return direction;
    }
}
