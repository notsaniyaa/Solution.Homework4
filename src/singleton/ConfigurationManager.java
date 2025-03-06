package singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configSettings;

    // Приватный конструктор (запрещает создание объектов вне класса)
    private ConfigurationManager() {
        configSettings = new HashMap<>();
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    // Метод для получения единственного экземпляра (ленивая инициализация)
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Получение значения по ключу
    public String getConfig(String key) {
        return configSettings.getOrDefault(key, "Key not found");
    }

    // Вывод всех конфигураций
    public void printAllConfigs() {
        for (Map.Entry<String, String> entry : configSettings.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

