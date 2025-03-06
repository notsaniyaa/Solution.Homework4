package adapter;

// Адаптер, который делает старый сервис совместимым с новым интерфейсом
public class ChatServiceAdapter implements ChatService {
    private LegacyChatService legacyChat;

    public ChatServiceAdapter(LegacyChatService legacyChat) {
        this.legacyChat = legacyChat;
    }

    @Override
    public void sendMessage(String message) {
        legacyChat.sendLegacyMessage(message);
    }
}

