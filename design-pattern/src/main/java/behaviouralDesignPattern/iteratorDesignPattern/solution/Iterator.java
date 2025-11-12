package behaviouralDesignPattern.iteratorDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
