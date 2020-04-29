package oop.hw;

public class Shop {
    private String title;
    private String product;

    public Shop(String title, String product) {
        this.title = title;
        this.product = product;
    }

    public Shop() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}

