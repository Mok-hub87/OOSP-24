package pattern9;

import java.util.HashMap;
import java.util.Map;

public class DataCache {

    private static DataCache instance;
    private Map<String, Object> cache = new HashMap<>();

    private DataCache() {
        // Конструктор - приватный для запрета создания экземпляров
    }

    public static DataCache getInstance() {
        if (instance == null) {
            instance = new DataCache();
        }
        return instance;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }

    public void clear() {
        cache.clear();
    }

    // Пример использования:
    public static void main(String[] args) {
        DataCache cache = DataCache.getInstance();

        // Сохранение данных в кэш
        cache.put("user1", "John Doe");
        cache.put("user2", "Jane Doe");

        // Получение данных из кэша
        String user1 = (String) cache.get("user1");
        System.out.println("User 1: " + user1); // Вывод: User 1: John Doe

        // Проверка наличия ключа в кэше
        if (cache.containsKey("user2")) {
            System.out.println("User 2 exists in the cache.");
        }

        // Очистка кэша
        cache.clear();
    }
}
