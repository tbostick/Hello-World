import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Declared an integer variable called num and
        //assigned a starting value of 0.

        int num = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = keyboard.nextInt();
        System.out.println(num);

        //new comment
    }
}
