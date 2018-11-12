/**
 *
 * @author Alberto O, Salazar 18550300
 */
public class Principal
{
    public static void main(String[] args)
    {
        System.out.println("iniciando Main");
        A();
        System.out.println("terminaando Main");
    }
    public static void A()
    {
        System.out.println("iniciando A");
        B();
        System.out.println("terminando A");
    }
    public static void B()
    {
        System.out.println("iniciando B");
        C();
        System.out.println("terminando B");
    }
    public static void C()
    {
        System.out.println("iniciando C");
        System.out.println("terminando C");
    }
}