public class StaticAndInstance6 {

    static  public void sblock()
    {
        System.out.println("Static block");

    }
    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {

        StaticAndInstance6 st=new StaticAndInstance6();
        st.sblock();

    }
}
