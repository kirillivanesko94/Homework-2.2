public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre(Bicycle bicycle) {
        System.out.println("Меняем покрышку");
    }
}
