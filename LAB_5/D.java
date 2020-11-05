public class D extends C
{
    protected String d;
    protected X x = new X("X in D");

    D(A a, B b, C c, String d) {
        super(a, b, c);
        this.d = d;
    }

    D(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d.d;
    }

    public void getValue() {
        super.getValue();
        System.out.print(this.d + " ");
    }
}
