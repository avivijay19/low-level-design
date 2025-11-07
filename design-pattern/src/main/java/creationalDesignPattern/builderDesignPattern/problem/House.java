package creationalDesignPattern.builderDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 04/11/25, Tuesday
 **/

public class House {
    private final String foundation;

    private String structure;

    private String roof;

    private boolean hasGarage;

    private boolean hasSwimmingPool;

    private boolean hasGarden;

    public House(String foundation, String structure, String roof, boolean hasGarage,
                 boolean hasSwimmingPool, boolean hasGarden) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
    }

    public House(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "House{" +
            "foundation='" + foundation + '\'' +
            ", structure='" + structure + '\'' +
            ", roof='" + roof + '\'' +
            ", hasGarage=" + hasGarage +
            ", hasSwimmingPool=" + hasSwimmingPool +
            ", hasGarden=" + hasGarden +
            '}';
    }
}
