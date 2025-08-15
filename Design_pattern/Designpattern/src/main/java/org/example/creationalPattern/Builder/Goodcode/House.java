package org.example.creationalPattern.Builder.Goodcode;

public class House {

    private   String foundation;
    private  String structure;
    private  String roof;
    private  boolean hasGarage;
    private  boolean hasSwimmingPool;
    private  boolean hasGarden;


    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.roof = builder.roof;
        this.structure = builder.structure;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage='" + hasGarage + '\'' +
                ", hasSwimmingPool='" + hasSwimmingPool + '\'' +
                ", hasGarden='" + hasGarden + '\'' +
                '}';
    }

    public static  class HouseBuilder{
        private String foundation;
        private  String structure;
        private  String roof;
        private  boolean hasGarage;
        private  boolean hasSwimmingPool;
        private  boolean hasGarden;

        public HouseBuilder(String foundation,String structure,String roof){
            this.foundation = foundation;
            this.roof = roof;
            this.structure = structure;

        }

        // optional parameters
        // why returning housebuilder object - for chaining go to main method and see that
        public  HouseBuilder setGarden(boolean hasGarden){
            this.hasGarden=hasGarden;
            return this;
        }

        public  HouseBuilder hasSwimmingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool=hasSwimmingPool;
            return this;
        }
        public  HouseBuilder sethasGarage(boolean hasGarage){
            this.hasGarage=hasGarage;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

}
