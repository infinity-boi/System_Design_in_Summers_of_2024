package GS04_Synchronisation.Counter;

public class CounterSynchronized {
    private int cnt;
    public CounterSynchronized(){
        cnt = 0;
    }
    synchronized void increment(){
        cnt++;
    }
    synchronized void decrement(){
        cnt--;
    }
    int getCnt(){
        return cnt;
    }
}
