public class TrainDriver extends RGDWorker {
    private  int countWorkDay;
    @Override
    protected void doSomeWork() {
        System.out.print("Машинист ");
        super.doSomeWork();

        Train.go(15);
        countWorkDay+=1;
    }

    @Override
    public void getMoney() {
        if(countWorkDay < 1){
            System.out.println("нет денег");
        }else
            System.out.println("Сотрудник получает зп за 1 день");
    }
}
