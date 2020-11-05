public class B extends A
{
    protected String b;

    B(A a, String b) {
        super(a);
        this.b = b;
    }


    B( A a, B b )
    {
        super(a);
        this.b = b.b;
    }

    public void getValue()
    {
        super.getValue();
        System.out.print(b + " ");
    }
}
