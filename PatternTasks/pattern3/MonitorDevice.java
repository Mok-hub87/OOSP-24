package pattern3;

class MonitorDevice extends Device {
    @Override
    public void displayVideo(String videoName) {
        System.out.println("Монитор показывает: " + videoName);
    }
}