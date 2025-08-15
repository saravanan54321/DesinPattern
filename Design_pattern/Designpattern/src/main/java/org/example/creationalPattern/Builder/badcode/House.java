package org.example.creationalPattern.Builder.badcode;

public class House {

    private  String foundation;
    private  String structure;
    private  String roof;
    private  boolean hasGarage;
    private  boolean hasSwimmingPool;
    private  boolean hasGarden;


    public House(String foundation, String roof, String structure, boolean hasGarage, boolean hasGarden, boolean hasSwimmingPool) {
        this.foundation = foundation;
        this.roof = roof;
        this.structure = structure;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
        this.hasSwimmingPool = hasSwimmingPool;
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



}
