package za.ac.cput;

/*
 * @Author: Tye Walker
 * Student Number: 218338562
 *
 * Item Class.
 * Contains Constructor, Getters, Setters, and toString
 */

public class Item {

    private String prodName;
    private double prodPrice;

    public Item(String prodName, double prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }
}
