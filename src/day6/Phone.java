package day6;

public class Phone {
    private String brand;
    private int price;
    private String type;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void type(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void fly() {
        System.out.println("运行速度特别快");
    }
}
