public class Test {

    Test()
    {
        this(12);
        System.out.println("Constructor First");

    }
    Test(int x)
    {
        this(2,3);
        System.out.println("Constructor Second :"+x);
        //this(2,3);

    }
    Test(int x , int y)
    {
        System.out.println("Constructor Third :");

    }

    public static void main(String[] args)
    {
        Test t=new Test();
       // t.this(2);

    }


}
