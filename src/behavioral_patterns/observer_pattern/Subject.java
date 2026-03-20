package behavioral_patterns.observer_pattern;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
