/**
 * atravez de la interfaces se puede simular la herencia multiple en java
 *
 * @author Alberto Salazar
 */
public class Main
{
    public static void main(String[] args)
    {
        Hijo obj=new Hijo();
        obj.OtroMensaje();
        obj.otroOtroMensaje();
    }
}
class Hijo extends Padre implements Accesorio, AlgoMas
{
//metodos obligatorios
    @Override
    public void OtroMensaje()
    {
        System.out.println("ñeñeeee");
    }
    @Override
    public void otroOtroMensaje()
    {
        System.out.println("kk");
    }
}
class Padre
{
    public void algo()
    {
        System.out.println("mensaje de la clase padre");
    }
}
interface Accesorio
{
    public void OtroMensaje();
}
interface AlgoMas
{
    public void otroOtroMensaje();
}