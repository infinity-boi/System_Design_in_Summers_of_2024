package PracticeQuestions.Strategy;

public class AESAlgorithm implements EncryptionAlgorithm {
    boolean encrypted = false;
    @Override
    public void encryptMessage() {
        System.out.println("Encrypting Message using AES Algorithm");
        encrypted = true;
    }
    @Override
    public void send(){
        if(encrypted){
            System.out.println("Sending the AES encrypted message...");
        }
        else {
            System.out.println("Sorry Message not Encrypted!");
        }
    }
}
