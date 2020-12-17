package comm.trungtamjava.model;

import java.util.Scanner;

public class Chair {
    String color;
    int price;
    String type;

    public Chair(){
    };
    public  Chair(String color,int price, String type ){
        this.color=color;
        this.price=price;
        this.type=type;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the price ");
        price= sc.nextInt();
        System.out.println("Enter the color :");
        color = sc.nextLine();
        System.out.println("Enter the type :");
        type = sc.nextLine();
    }
    public void info(){
        System.out.println(price);
        System.out.println(color);
        System.out.println(type);
        System.out.println("===============");
    }

}
