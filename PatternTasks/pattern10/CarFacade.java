package pattern10;

class CarFacade {
    private Car car;

    public CarFacade(Car car) {
        this.car = car;
    }

    public void startCar() {
        car.startEngine();
    }

    public void stopCar() {
        car.stopEngine();
    }

    public void setComfortableTemperature() {
        car.setTemperature(22);
        car.setFanSpeed(2);
    }

    public void playFavoriteSong() {
        car.playMusic("My Favorite Song");
    }
}