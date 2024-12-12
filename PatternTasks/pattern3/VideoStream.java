package pattern3;

import java.util.ArrayList;
import java.util.List;

// Класс потока видео
class VideoStream {
    private List<Device> devices = new ArrayList<>();

    // Добавление устройства для вывода
    public void addDevice(Device device) {
        devices.add(device);
    }

    // Запуск передачи видео
    public void startStreaming(String videoName) {
        for (Device device : devices) {
            device.displayVideo(videoName);
        }
    }
}

