package pattern3;


public class VideoStreamDemo {

    public static void main(String[] args) {
        // Создаем устройства для вывода
        Device tv = new TVDevice();
        Device monitor = new MonitorDevice();
        Device projector = new ProjectorDevice();

        // Создаем поток видео
        VideoStream stream = new VideoStream();

        // Добавляем устройства для вывода
        stream.addDevice(tv);
        stream.addDevice(monitor);
        stream.addDevice(projector);

        // Запускаем передачу видео
        stream.startStreaming("Название видео");
    }
}
