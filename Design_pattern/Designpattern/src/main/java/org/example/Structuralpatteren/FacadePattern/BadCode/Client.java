package org.example.Structuralpatteren.FacadePattern.BadCode;



public class Client {

    public static void main(String[] args) {


        UserService userService = new UserService();
        OrderDetails orderDetails = new OrderDetails();
        inventoryService invent = new inventoryService();

        userService.getUserDetails();
        orderDetails.getOrderDetails();
        invent.getinventoryDetails();
    }


}
