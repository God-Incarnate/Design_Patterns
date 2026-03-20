package behavioral_patterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgencies implements Subject{
    private List<Observer> observers=new ArrayList<>();
    private String news;

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void setNewsAndSend(String content){
        this.news=content;
        notifyObserver();
    }

    public void notifyObserver(){
        for(Observer o:observers){
            o.update(news);
        }
    }
}
