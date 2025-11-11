package structuralDesignPattern.flyWeightDesignPattern.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : avinashvijayvargiya
 * @created : 11/11/25, Tuesday
 **/

public class BulletFactory {
    private static final Map<String, BulletType> bulletTypeMap = new HashMap<>();

    public static BulletType getBulletType(String color) {
        BulletType bulletType = bulletTypeMap.get(color);
        if (bulletType == null) {
            bulletType = new BulletType(color);
            bulletTypeMap.put(color, bulletType);
        }
        return bulletType;
    }

}
