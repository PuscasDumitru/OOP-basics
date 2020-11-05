public class C extends B
{
    protected String c;

    C(A a, B b, String c) {
        super(a, b);
        this.c = c;
    }

    C(A a, B b, C c) {
        super(a, b);
        this.c = c.c;
    }

    public void getValue() {
        super.getValue();
        System.out.print(this.c + " ");
    }

}
