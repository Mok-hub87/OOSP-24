package pattern10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CarFacade carFacade = new CarFacade(car);

        // Использование фасада для управления автомобилем
        carFacade.startCar();
        carFacade.setComfortableTemperature();
        carFacade.playFavoriteSong();
    }
}
