package behaviouralDesignPattern.observerDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
