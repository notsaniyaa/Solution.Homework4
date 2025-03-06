package adapter;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);

        // Отправляем сообщение через адаптер
        chatService.sendMessage("Hello world!");
    }
}
