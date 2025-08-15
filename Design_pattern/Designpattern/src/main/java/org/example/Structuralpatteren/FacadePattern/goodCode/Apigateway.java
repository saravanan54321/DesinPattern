package org.example.Structuralpatteren.FacadePattern.goodCode;



public class Apigateway {
    UserService userService;
    OrderDetails orderDetails;
    inventoryService inventoryService;

    Apigateway(){
        userService= new UserService();
        orderDetails= new OrderDetails();
        inventoryService = new inventoryService();
    }

    public void getFullDetials(){
        userService.getUserDetails();
        orderDetails.getOrderDetails();
        inventoryService.getinventoryDetails();
    }

}
