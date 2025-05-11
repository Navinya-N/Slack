import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

       
        int num=10;

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }
}
