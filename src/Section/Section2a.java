package Section;

import com.trungtamjava.vonglap.Break;

import java.util.Scanner;

public class Section2a {
    public static void main(String[] args) {
        //Hiển thị câu hỏi trắc nghiệp với 4 lựa chọn.
        // dung cầu dkien để nhận trả lời qua nhập vào từ scanner. và in câu trả lời đó ra màn hình.
        Scanner scan = new Scanner(System.in);

        System.out.println("Vui long lua chon do uong ");
        System.out.println("1. cafe");
        System.out.println("2. coca");
        System.out.println("3. ruou");
        System.out.println("4. bia");
        System.out.println("q. khong muon uong gi ");

        while (true) {
            String luaChon = scan.nextLine();

            if (luaChon.equals("1")) {
                System.out.println("Ban da lua chon cafe");
                break;
            } else if (luaChon.equals("2")) {
                System.out.println("Ban da lua chon coca");
                break;
            } else if (luaChon.equals("3")) {
                System.out.println("Ban da lua chon ruou");
                break;
            } else if (luaChon.equals("4")) {
                System.out.println("Ban da lua chon bia");
                break;
            }else if (luaChon.equals("q")){
                System.out.println("ban khong muon uong gi sao ?");
                System.out.println("nhap ok de thoat ");
                String thoat = scan.nextLine();

                if (thoat.equals("ok")){
                    System.out.println("ban da thoat ");
                    break;
                }
                quayLai();

            }else {
                System.out.println("vui long chon gia tri");
            }
        }

    }
    public static void quayLai (){
        Scanner scan = new Scanner(System.in);

        System.out.println("Vui long lua chon do uong ");
        System.out.println("1. cafe");
        System.out.println("2. coca");
        System.out.println("3. ruou");
        System.out.println("4. bia");
        System.out.println("q. khong muon uong gi ");

        while (true) {
            String luaChon = scan.nextLine();

            if (luaChon.equals("1")) {
                System.out.println("Ban da lua chon cafe");
                break;
            } else if (luaChon.equals("2")) {
                System.out.println("Ban da lua chon coca");
                break;
            } else if (luaChon.equals("3")) {
                System.out.println("Ban da lua chon ruou");
                break;
            } else if (luaChon.equals("4")) {
                System.out.println("Ban da lua chon bia");
                break;
            }else if (luaChon.equals("q")){
                System.out.println("ban khong muon uong gi sao ?");
                System.out.println("nhap ok de thoat ");
                String thoat = scan.nextLine();

                if (thoat.equals("ok")){
                    System.out.println("ban da thoat ");
                    break;
                }
                quayLai();
            }
            System.out.println("Ban da thoat ");
        }

    }

}
