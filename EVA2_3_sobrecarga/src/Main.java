/**
 * java acepta constructores privados
 * Tarea para que sirve un constructor privado
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        operaciones obj1=new operaciones();
        System.out.println("la suma de 5+7 es: "+obj1.suma(5, 7));
        operaciones  obj2=new operaciones();
        System.out.println("la suma de Juan y Perez es: "+obj2.suma("Juan", "Perez"));
        operaciones obj3=new operaciones();
        System.out.println("true ANd false es: "+obj3.suma(true, false));
    }
}
class operaciones
{
    public int suma(int iVal1, int iVal2)
    {
        return iVal1+iVal2;//sumando
    }
    public String suma(String sVal1, String sVal2)
    {
        return sVal1+sVal2;//concatenando
    }
    public boolean suma(boolean bVal1, boolean bVal2)
    {
        return bVal1 && bVal2;//AND
    }
}