package org.example.creationalPattern.Builder.Goodcode;

public class WithBuilder {

    public static void main(String[] args) {
//        House house = new House.HouseBuilder("concrete","wooden","title")
//                .setGarden(true).sethasGarage(true).hasSwimmingPool(false).build()
//                ;

        House house = new House.HouseBuilder("concrete","wooden","title")
                .hasSwimmingPool(true).build()
                ;

        System.out.println(house);

    }
}
