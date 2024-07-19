package GS09_DesignPatterns.BehavioralDP.StrategyDP.Strategy;

public class DESAlgorithm implements EncryptionAlgorithm {
    boolean encrypted = false;
    @Override
    public void encryptMessage(){
        System.out.println("Encrypting Message using DES Algorithm");
        encrypted = true;
    }
    @Override
    public void send(){
        if(encrypted){
            System.out.println("Sending the DES encrypted message...");
            encrypted = false;
        }
        else {
            System.out.println("Sorry Message not Encrypted!");
        }
    }
}
