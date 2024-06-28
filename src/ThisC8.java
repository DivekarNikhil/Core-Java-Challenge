public class ThisC8 {

    static  void main()
    {
        System.out.println("Main method ");


    }

    void access()
    {
        this.s();
        this.ns();
        System.out.println("Access block ");

    }
    static void s()
    {
        System.out.println("Static block");
    }
    void ns(){
        System.out.println("Non  static ");
    }

    public static void main(String[] args) {
        ThisC8 a=new ThisC8();
        a.access();


    }

}
