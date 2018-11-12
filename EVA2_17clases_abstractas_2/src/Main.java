/**
 * se puede utilizar el movimiento de la clase padre como la hijo
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Caballo horsy=new Caballo();
        horsy.Movimiento();
    }
}
class Caballo extends Animal
{
    @Override
    public void Movimiento()
    {
        super.Movimiento();//el puro super llama al constructor y se puede usar como el "this"
        System.out.println("Galopar");
    }
}
abstract class Animal
{
    public void Movimiento()
    {
        System.out.println("Algún tipo de movimiento");
    }
}