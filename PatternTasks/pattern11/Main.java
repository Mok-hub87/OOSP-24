package pattern11;

public class Main {
    public static void main(String[] args) {
        SettingsManager settingsManager = new SettingsManager();

        // Создание настроек по умолчанию
        settingsManager.createDefaultSettings();

        // Создание настроек для пользователя "user1"
        settingsManager.createUserSettings("user1");

        // Получение настроек пользователя "user1"
        AppSettings user1Settings = settingsManager.getSettings("user1");

        // Изменение темы для пользователя "user1"
        user1Settings.setTheme("Dark");
        settingsManager.updateSettings("user1", user1Settings);

        // Получение обновленных настроек пользователя "user1"
        AppSettings updatedUser1Settings = settingsManager.getSettings("user1");

        System.out.println("User 1 settings: " + updatedUser1Settings.getTheme());
    }
}
