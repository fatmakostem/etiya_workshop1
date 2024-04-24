import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();


        // Örnek kullanıcılar
        usernames.add("berk10");
        passwords.add("123");
        firstName.add("berk");
        lastName.add("mamikoglu");
        emails.add("berk@etiya.com");

        usernames.add("mert11");
        passwords.add("456");
        firstName.add("mert");
        lastName.add("ozbey");
        emails.add("mert@etiya.com");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen giriş yapmak için kullanıcı adı, emailinizi ve şifrenizi girin:");
        System.out.print("Kullanıcı Adı: ");
        String username = scanner.nextLine();
        System.out.print("email: ");
        String email = scanner.nextLine();
        System.out.print("Şifre: ");
        String password = scanner.nextLine();


        boolean isAuthenticated = false;
        for (int i = 0; i < usernames.size(); i++) {
            if (usernames.get(i).equals(username) && passwords.get(i).equals(password) && emails.get(i).equals(email)) {
                isAuthenticated = true;
                break;
            }
        }


        if (isAuthenticated) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyin.");
        }


    }
}