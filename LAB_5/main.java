import java.util.ArrayList;

public class main
{
    public static void main(String[] args)
    {
        ArrayList<A> obj = new ArrayList<A>();
        A A_ = new A("a", new X("TEST")); obj.add(A_);
        B B_ = new B(A_,"b"); obj.add(B_);
        C C_ = new C(A_, B_, "c"); obj.add(C_);
        D D_ = new D(A_, B_, C_, "d"); obj.add(D_);
        E E_ = new E(A_, B_, C_, D_, "e"); obj.add(E_);
        F F_ = new F(A_, B_, C_, D_, E_, "f"); obj.add(F_);
        G G_ = new G(A_, B_, C_, D_, E_, F_, "g"); obj.add(G_);
        H H_ = new H(A_, B_, C_, D_, E_, F_, G_, "h"); obj.add(H_);
        I I_ = new I(A_, B_, C_, D_, E_, F_, G_, H_, "i"); obj.add(I_);
        J J_ = new J(A_, B_, C_, D_, E_, F_, G_, H_, I_, "j"); obj.add(J_);


        for (int i = 0; i < obj.size(); i++)
        {
            System.out.print(obj.get(i).getClass().getName() +  " class object -> ");
            obj.get(i).getValue();System.out.println();

        }

        System.out.println("\n" + "Object x from class A accessed by J_: " + J_.x + "\n");

        System.out.print("The x name from the class J: ");
        J_.printXname();

    }
}