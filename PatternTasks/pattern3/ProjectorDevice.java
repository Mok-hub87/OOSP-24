package pattern3;

class ProjectorDevice extends Device {
    @Override
    public void displayVideo(String videoName) {
        System.out.println("Проектор показывает: " + videoName);
    }
}