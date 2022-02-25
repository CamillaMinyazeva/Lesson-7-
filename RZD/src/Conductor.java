public class Conductor extends RGDWorker {
    private int countWorkDay;

    // method overloading
    //Контрольный билет кондуктора

    protected void doSomeWork(Passenger passenger) {
        System.out.print("Кондуктор");
        super.doSomeWork();
        if(passenger.ticket == null){
            System.out.println(passenger.name + " Вы должны купить билет");
        } else {
            System.out.printf( "%s ваш вагон %d ваше место %d.", passenger.name, passenger.ticket.numberOfWagon, passenger.ticket.numberOfPlace);
            System.out.println();
            countWorkDay+=1;
        }


    }
    @Override
    public void getMoney() {
        if(countWorkDay < 1){
            System.out.println("нет денег");
        }else
            System.out.println("Сотрудник получает зп за 1 день");
    }
}
