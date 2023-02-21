public class Truck extends Transport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre(Truck truck) {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine(Truck truck) {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer(Truck truck) {
        System.out.println("Проверяем прицеп");
    }
}
