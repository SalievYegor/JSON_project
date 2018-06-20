package main.java;

public class Goods {

    public void productPrint() {
        JsonProduct jp = new JsonProduct();

        for (Product prod : jp.getProductList()) {
            System.out.println("Name: " + prod.getName());
            System.out.println("price: " + prod.getPrice());
            ShelfLife sl = prod.getShelf();
            System.out.println("Manufacture date: " + sl.getManufacture() + " expire date: " + sl.getExpire());
            System.out.println("weight: " + prod.getWeight());
            System.out.println(" delivery date: " + prod.getDelivery());

        }
    }
}
