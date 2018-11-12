/**
 * las interfaces son como las clases abstractas no se pueden crear objetos
 * de ellas, pues son un comportamiento de la clase
 * 
 * la diferencia entre una clase abstracta y una interface es que la clase
 * abstracta puedee implementar metodos y las interfaces sus metodos son 
 * forsosamente abstractos y por ende no pueden tener cuerpo
 * 
 * existen 2 tipos de herencias simple(hereda solo de una clase) y
 * multiple(que hereda de muchas clases) aunque java solo permite herencia
 * simple, puede simular la herencia multiple.
 * 
 * atravez de interfaces se puede simular la herencia multiple.
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
class Caballo implements ComportamientoAnimal
{
//metodos obligatorios
    @Override
    public void movimiento()
    {
        System.out.println("Galopar");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer()
    {
        System.out.println("Comer");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
interface ComportamientoAnimal
{
    public void movimiento();
    public void comer();
}