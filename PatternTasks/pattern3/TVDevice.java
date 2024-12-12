package pattern3;

class TVDevice extends Device {
    @Override
    public void displayVideo(String videoName) {
        System.out.println("Телевизор показывает: " + videoName);
    }
}