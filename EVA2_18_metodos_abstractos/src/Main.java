/**
 * los metodos abstractos solo pueden ir en una clase abstracta
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Caballo horsy=new Caballo();
        horsy.movimiento();
        horsy.comer();
    }
}
class Caballo extends Animal
{
    //metodos creados por el ambiente automaticamente pues al parecer es obligatorio crearlos
    @Override
    public void movimiento()
    {
        System.out.println("Galopar");
        //throw new UnsupportedOperationException("Not supported yet."); To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void comer()
    {
        System.out.println("comer");
        //throw new UnsupportedOperationException("Not supported yet."); To change body of generated methods, choose Tools | Templates.
    }
    
}
abstract class Animal
{
    abstract public void movimiento();
    abstract public void comer();
}