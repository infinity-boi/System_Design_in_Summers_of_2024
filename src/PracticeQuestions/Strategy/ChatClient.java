package PracticeQuestions.Strategy;

public class ChatClient {
    private EncryptionAlgorithm encryptionAlgorithm;

    public void encryptMessage(){
        encryptionAlgorithm.encryptMessage();
    }

    public void send(){
        encryptionAlgorithm.send();
    }

    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }


    public void setEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }
}
