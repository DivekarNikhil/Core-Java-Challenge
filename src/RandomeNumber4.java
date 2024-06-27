import java.util.Random;

public class RandomeNumber4 {
    public static void main(String[] args) {

        Random rno=new Random();

        int count=0;
        while(count<20)
        {
            int x=rno.nextInt(200);
            if(x>99)
            {
                count++;
                System.out.println(+x);
            }
        }

    }
}
