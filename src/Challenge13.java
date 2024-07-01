import java.util.Scanner;

public class Challenge13 {




        void m1(int a, int b) {
            System.out.println("the value of Sum:" + (a + b));
        }

        public static void main(String args[]) {
            String a = "", b = "";
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Num1");
            a = s.nextLine();
            System.out.println("Enter the Num2");
            b = s.nextLine();

            if (!a.isEmpty() && !b.isEmpty()) {
                int sum = Integer.parseInt(a) + Integer.parseInt(b);
                System.out.println("Sum==>" + sum);
            } else {
                System.out.println("insuficient Arguments");
            }

        }
    }



