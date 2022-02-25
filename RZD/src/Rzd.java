public class Rzd {
    public static void main(String[] args) {

       /* RailwayStation station = new RailwayStation("UfaStation");
        station.setTrain();
        station.trainsList[1].setStop(true);
        Ticket ticket = new Ticket("Moscow", 6, 8);
        Passenger passenger1 = new Passenger("Camilla", ticket);
        Passenger passenger2 = new Passenger("Petya", null);
        Passenger passenger3 = new Passenger("Anya", null);
        Conductor conductor = new Conductor();
        Passenger[] passengers = {passenger1, passenger2, passenger3};
        for (Passenger p : passengers) {
            conductor.doSomeWork(p);
        }
        TrainDriver trainDriver = new TrainDriver();
        trainDriver.doSomeWork();
        trainDriver.getMoney();
        conductor.getMoney();*/

        //Lesson 7

        Train train1 = new Train(null, 15, "passengers");

        try {
            checkTrain(train1);
        } catch (NoDirectionOfTrainException e) {
            System.out.println(e);
        }

        Ticket ticket = new Ticket("Moscow - Surgut", 12, 123);
        Passenger passenger = new Passenger("Katya", ticket);

        try{
            checkTicket(passenger);
        }catch (WrongTicketNumber er){
            System.out.println(er);
        }finally {
            System.out.println("Поезд начинает движение.");
        }
    }

    public static void checkTrain(Train train) {
        if (train.getDirection() == null) {
            throw new NoDirectionOfTrainException();
        }
    }

    public static void checkTicket(Passenger passenger) throws WrongTicketNumber {
        if (passenger.ticket.numberOfPlace > 80 ) {
            throw new WrongTicketNumber("Нет билета " + passenger.ticket.numberOfPlace );
        }
    }
}