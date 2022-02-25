
//Lesson 6-interface

public class FreightTrain implements TransportGoodsAbility {
    private int numbersOfWagons;
    private String direction;
    private String typeOfTransportation;

    public FreightTrain(String direction, int numbersOfWagons, String typeOfTransportation) {
        this.direction = direction;
        this.numbersOfWagons = numbersOfWagons;
        this.typeOfTransportation = typeOfTransportation;
    }

    @Override
    public void transfer(String goods, String direction) {
        System.out.printf("направление - %s,тип перевозки %s ", direction, goods);

    }
}