/**
 * se pueden crear clase anonimas de interfaces o de clases abstractas
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Operaciones obj=new Operaciones()
        {
            @Override
            public int suma(int v1, int v2)
            {
                return v1+v2;
            }
            @Override
            public String suma(String c1, String c2)
            {
                return c1+c2;
            }
            @Override
            public boolean suma(boolean b1, boolean b2)
            {
                return b1&&b2;
            }
        };
        System.out.println(obj.suma("1", "2"));
        System.out.println(obj.suma(true, false));
        System.out.println(obj.suma(1, 2));
    }
}
interface Operaciones
{
    public int suma(int v1, int v2);
    public String suma(String c1, String c2);
    public boolean suma (boolean b1, boolean b2);
}