package pattern8;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GameSettingsManager {

    private static class GameSettings implements Serializable {
        public int volume;
        public boolean fullscreen;
        public String resolution;

        public GameSettings(int volume, boolean fullscreen, String resolution) {
            this.volume = volume;
            this.fullscreen = fullscreen;
            this.resolution = resolution;
        }
    }

    private GameSettings currentSettings;
    private Map<String, GameSettings> savedSettings = new HashMap<>();

    public GameSettingsManager() {
        // Инициализация начальных настроек
        currentSettings = new GameSettings(50, false, "1920x1080");
    }

    // Сохранение текущих настроек
    public void saveSettings(String saveName) {
        savedSettings.put(saveName, new GameSettings(currentSettings.volume, currentSettings.fullscreen, currentSettings.resolution));
    }

    // Загрузка сохраненных настроек
    public void loadSettings(String saveName) {
        if (savedSettings.containsKey(saveName)) {
            currentSettings = savedSettings.get(saveName);
        }
    }

    // Изменение настроек
    public void setVolume(int volume) {
        currentSettings.volume = volume;
    }

    public void setFullscreen(boolean fullscreen) {
        currentSettings.fullscreen = fullscreen;
    }

    public void setResolution(String resolution) {
        currentSettings.resolution = resolution;
    }

    // Получение текущих настроек
    public int getVolume() {
        return currentSettings.volume;
    }

    public boolean isFullscreen() {
        return currentSettings.fullscreen;
    }

    public String getResolution() {
        return currentSettings.resolution;
    }


    // Пример использования:
    public static void main(String[] args) {
        GameSettingsManager manager = new GameSettingsManager();

        // Установка новых настроек
        manager.setVolume(75);
        manager.setFullscreen(true);
        manager.setResolution("1280x720");

        // Сохранение настроек под именем "profile1"
        manager.saveSettings("profile1");

        // Загрузка настроек из "profile1"
        manager.loadSettings("profile1");

        // Вывод текущих настроек
        System.out.println("Volume: " + manager.getVolume());
        System.out.println("Fullscreen: " + manager.isFullscreen());
        System.out.println("Resolution: " + manager.getResolution());
    }
}
