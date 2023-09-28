import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("“Enter your age”");
        int age = scan.nextInt();
        if(age >= 21){
            System.out.println("You get a wristband");
        }

    }
}