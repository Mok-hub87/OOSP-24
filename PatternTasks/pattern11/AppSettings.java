package pattern11;

public class AppSettings {
    private String theme;
    private int fontSize;
    private boolean notificationsEnabled;

    public AppSettings(String theme, int fontSize, boolean notificationsEnabled) {
        this.theme = theme;
        this.fontSize = fontSize;
        this.notificationsEnabled = notificationsEnabled;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    public void setNotificationsEnabled(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    // Метод для клонирования настроек
    public AppSettings clone() {
        return new AppSettings(this.theme, this.fontSize, this.notificationsEnabled);
    }
}
