package comm.trungtamjava.model;

public class Nguoi {
    String ten;
    String diaChi;
    int age;

    public void diLai(String ten){
        System.out.println(ten+" di lai ");
    }

    public static void main(String[] args) {
        new Nguoi();
        Nguoi anhA = new Nguoi();
        Nguoi anhB = new Nguoi();

        anhA.diLai("A ");
        anhB.diLai("anh B ");

        Chair ghe= new Chair();
        ghe.input();
        ghe.info();
    }
}
