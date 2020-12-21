package comm.trungtamjava.model;

import javax.smartcardio.ATR;
import java.util.Scanner;

public class Teacher {
    int id;
    String name;
    String address;
    String facility;

    public Teacher(){

    }
    public Teacher(int id, String name, String address, String facility){
        this.id=id;
        this.name= name;
        this.address= address;
        this.facility= facility;

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

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }
    public void input(){
        System.out.println("Enter info ");
        System.out.println("Enter the id");
        Scanner scId = new Scanner(System.in);
        id= scId.nextInt();

        System.out.println("Enter the address");
        Scanner scAddress = new Scanner(System.in);
        address= scAddress.nextLine();

        System.out.println("Enter the name");
        Scanner scName = new Scanner(System.in);
        name= scName.nextLine();

        System.out.println("Enter the facility");
        Scanner scFacility = new Scanner(System.in);
        facility= scFacility.nextLine();
    }
    public void info(){
        System.out.println("info");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(facility);
    }
}
