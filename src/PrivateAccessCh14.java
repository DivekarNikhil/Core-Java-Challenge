public class PrivateAccessCh14 {


        private static int  bc( )
        {

            return 20;
        }

    private static void Pv()
    {
        int b=21;
        System.out.println(b);
    }

    private PrivateAccessCh14()
    {
       int c= 33;
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        PrivateAccessCh14 a=new PrivateAccessCh14();
        a.Pv();

        int x=bc();
        System.out.println(x);




    }

}
