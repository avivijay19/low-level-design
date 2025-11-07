package creationalDesignPattern.builderDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 04/11/25, Tuesday
 **/

public class House {
    private final String foundation;

    private final String structure;

    private final String roof;

    private final boolean hasGarage;

    private final boolean hasSwimmingPool;

    private final boolean hasGarden;

    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
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

    public static class Builder {
        private final String foundation;

        private final String structure;

        private final String roof;

        private boolean hasGarage;

        private boolean hasSwimmingPool;

        private boolean hasGarden;

        public Builder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}
