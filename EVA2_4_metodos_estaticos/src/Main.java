/**
 * metodos estaticos!!!!
 * no tiene sentido crear objetos si no requieres nada de lo que esta dentro de la clase
 * para evitar lo de arriba existen los metodos estaticos (los cuales no rqeuiren de una instancia para poderse utilizar)
 * todo lo declarado "static" se crea en cuanto corre el programa y se puede utilizar haciendo o no un objeto.
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        //operaciones obj1=new operaciones();
        System.out.println("hola "+operaciones.iValor);
        //Math.
    }
}
class operaciones
{
    static int iValor=100;
    public static int suma(int iVal1, int iVal2)
    {
        return iVal1+iVal2;//sumando
    }
    public static String suma(String sVal1, String sVal2)
    {
        return sVal1+sVal2;//concatenando
    }
    public static boolean suma(boolean bVal1, boolean bVal2)
    {
        return bVal1 && bVal2;//AND
    }
}