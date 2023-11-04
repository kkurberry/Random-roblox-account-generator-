import java.util.Random;

public class RobloxAccountMaker {
    public static void main(String[] args) {
        String[] adjectives = {"Happy", "Sad", "Brave", "Clever", "Funny"};
        String[] nouns = {"Cat", "Dog", "Bird", "Tree", "Car"};

        Random random = new Random();
        String username = adjectives[random.nextInt(adjectives.length)] + nouns[random.nextInt(nouns.length)];
        String password = generatePassword();

        sendToDiscordWebhook(username, password);
    }

    private static String generatePassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    private static void sendToDiscordWebhook(String username, String password) {
        // Replace "YOUR_WEBHOOK_LINK" with your actual Discord webhook link
        String webhookLink = "FILL_IN_HERE_YOUR_WEBHOOOK_LINK";

        // Send the username and password to the Discord webhook
        // Implementation details omitted for brevity
    }
}
