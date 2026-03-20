package behavioral_patterns.observer_pattern;

public class NewsChannel implements Observer{
    private String name;

    public NewsChannel(String name){
        this.name=name;
    }
    public void update(String news){
        System.out.println(name+" Recieved news: "+news);
    }
}
