/**
 *
 * @author Alberto O, Salazar 18550300
 */
public class Principal
{
    public static void main(String[] args)
    {
        Test test=new Test();
        Test copia=test;
        test.x=100666;
        System.out.println(test.x);
        System.out.println(test);
        System.out.println(copia);
        test=new Test();
        System.out.println("Señor slim, usted tiene : "+test.x);
        System.out.println(test);
        System.out.println(copia);
        test=null;
        System.out.println(test);
        System.out.println(copia);
        System.out.println("Pereme Sr. slim, tiene: "+copia.x);
    }
}
class Test
{
    int x;
}