package structuralDesignPattern.flyWeightDesignPattern.solution;

import structuralDesignPattern.flyWeightDesignPattern.problem.Bullet;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class Game {
    public static void main(String[] args) {
        structuralDesignPattern.flyWeightDesignPattern.problem.Bullet
            bullet1 = new structuralDesignPattern.flyWeightDesignPattern.problem.Bullet(10, 20, 30, "Red");
        bullet1.display();

        structuralDesignPattern.flyWeightDesignPattern.problem.Bullet
            bullet2 = new structuralDesignPattern.flyWeightDesignPattern.problem.Bullet(15, 25, 35, "Red");
        bullet2.display();

        structuralDesignPattern.flyWeightDesignPattern.problem.Bullet
            bullet3 = new Bullet(20, 30, 40, "Blue");
        bullet3.display();
    }
}
