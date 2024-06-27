import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int no=s.nextInt();

        if(no%2!=0)
        {
            System.out.println("Hello");
        }

        if(no%2==0)
        {
            if(no>=0 && no<10)
            {
                System.out.println("HI");
            }
            if(no>10 && no<20)
            {
                System.out.println("Hello");
            }
            if(no>20)
            {
                System.out.println("Bye");
            }

        }


    }
}
