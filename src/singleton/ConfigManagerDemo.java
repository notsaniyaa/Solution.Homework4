package singleton;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        // Проверяем работу Singleton
        System.out.println("Max Players: " + config.getConfig("maxPlayers"));
        System.out.println("\nAll Configurations:");
        config.printAllConfigs();
    }
}
