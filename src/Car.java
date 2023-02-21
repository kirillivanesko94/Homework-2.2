public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public String modelName;
    public int wheelsCount;

    public void updateTyre(Car car) {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine(Car car) {
        System.out.println("Проверяем двигатель");
    }
}
