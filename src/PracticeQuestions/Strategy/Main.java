package PracticeQuestions.Strategy;

//4. Strategy Pattern
//Exercise In the Exercises project, look at the strategy/ChatClient class. This class uses an encryption algorithm to encrypt a message before sending it out. What are the problems in this implementation? Refactor the code using the strategy pattern. What are the benefits of the new implementation?


public class Main {
    public static void main(String[] args){
        ChatClient chatClient = new ChatClient();

        chatClient.setEncryptionAlgorithm(new DESAlgorithm());
        chatClient.encryptMessage();
        chatClient.send();

        chatClient.setEncryptionAlgorithm(new AESAlgorithm());
        chatClient.encryptMessage();
        chatClient.send();

        chatClient.setEncryptionAlgorithm(new DESAlgorithm());
        chatClient.send();

        chatClient.setEncryptionAlgorithm(new AESAlgorithm());
        chatClient.send();

    }
}


