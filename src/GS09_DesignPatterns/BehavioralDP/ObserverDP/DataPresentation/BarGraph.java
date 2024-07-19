package GS09_DesignPatterns.BehavioralDP.ObserverDP.DataPresentation;

public class BarGraph implements Observer {
    private DataSource dataSource;

    BarGraph(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void update(){
        System.out.println("Bar Graph got updated!");
    }

    @Override
    public String toString() {
        return "BarGraph{" +
                "dataSource=" + dataSource +
                '}';
    }
}
