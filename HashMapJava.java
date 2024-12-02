import java.util.HashMap;
import java.util.Scanner;

public class HashMapJava {
    public static void main(String[] args) {
        // Create a HashMap to store usernames and passwords    
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "1");
        users.put("user2", "1");
        users.put("user3", "1");
        users.put("user4", "2");
        users.put("user5", "123456");
        users.put("user6", "123456");
        users.put("user7", "123456");
        users.put("user8", "123456");
        users.put("user9", "123456");
        users.put("user10", "123456");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập user name : ");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu : ");
        String pass = sc.nextLine();

        // kiểm tra
        if (!users.containsKey(userName)) {
            // neu khong co key nay trong hassmap users thì đồng nghĩa là user không tồn tại
            System.out.println("User khong ton tai");
        } else if (!users.get(userName).equals(pass)) {
            // sai mat khau
            System.out.println(" Pass sai ");                     
        }
        else
            System.out.println("ban da dang nhap thanh cong");


    }
}
