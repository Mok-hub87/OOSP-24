package pattern10;

public class Car {
    private Engine engine;
    private ClimateControl climateControl;
    private MusicPlayer musicPlayer;

    public Car() {
        this.engine = new Engine();
        this.climateControl = new ClimateControl();
        this.musicPlayer = new MusicPlayer();
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void setTemperature(int temperature) {
        climateControl.setTemperature(temperature);
    }

    public void setFanSpeed(int fanSpeed) {
        climateControl.setFanSpeed(fanSpeed);
    }

    public void playMusic(String song) {
        musicPlayer.play(song);
    }

    public void stopMusic() {
        musicPlayer.stop();
    }
}


