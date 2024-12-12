package pattern11;

import java.util.HashMap;
import java.util.Map;

class SettingsManager {
    private Map<String, AppSettings> userSettings = new HashMap<>();

    // Создание настроек по умолчанию
    public void createDefaultSettings() {
        AppSettings defaultSettings = new AppSettings("Light", 12, true);
        userSettings.put("default", defaultSettings);
    }

    // Создание настроек для пользователя
    public void createUserSettings(String userId) {
        AppSettings defaultSettings = userSettings.get("default");
        AppSettings userSettings = defaultSettings.clone();
        this.userSettings.put(userId, userSettings);
    }

    // Получение настроек пользователя
    public AppSettings getSettings(String userId) {
        return userSettings.get(userId);
    }

    // Изменение настроек пользователя
    public void updateSettings(String userId, AppSettings newSettings) {
        userSettings.put(userId, newSettings);
    }
}
