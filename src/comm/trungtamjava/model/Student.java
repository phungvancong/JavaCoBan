package comm.trungtamjava.model;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    String address;
    String major;


    public Student(){

    }
    public Student(int id, String name, String address, String major){
        this.id= id;
        this.name= name;
        this.address= address;
        this.major= major;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void input(){
        System.out.println("Please enter information of student");
        Scanner scId= new Scanner(System.in);
        System.out.println("Enter the Id");
        id= scId.nextInt();

        Scanner scName= new Scanner(System.in);
        System.out.println("Enter the Id");
        name= scName.nextLine();

        Scanner scAddress= new Scanner(System.in);
        System.out.println("Enter the Id");
        address= scAddress.nextLine();

        Scanner scMajor= new Scanner(System.in);
        System.out.println("Enter the Id");
        major= scMajor.nextLine();

    }
    public void info(){
        System.out.println("Information of student");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(major);
    }
}
