public class A
{
    protected String a;
    protected X x = new X("from A to X");

    A(String a, X x) {
        this.x = x;
        this.a = a;
    }

    A(A a) {
        this.a = a.a;
        this.x = a.x;
    }

    public void getValue() {
        System.out.print(this.a + " ");
    }
}
