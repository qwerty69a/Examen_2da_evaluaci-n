/**
 * cuando se hereda se hereda cierto comportamiento no todos los comportamientos
 * se heredan exactamente si son exactamente iguales
 * 
 * la sobre carga se utiliza para tener metodos con el mismo nombre pero con
 * diferentes argumentos a diferencia de la sobre escritura que oculta lo de la
 * clase base y reemplaza
 * 
 * super es para llamar al constructor de la clase base (sin reemplazar)
 * 
 * hay clases que solo sirven para la herencia como en este caso las clase Animal
 * para darle sentido a los comportamientos de las demás clases (solo servir como
 * referencia) 
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Animal ani=new Animal();
        ani.movimiento();;
        Caballo caballo1=new Caballo();
        caballo1.movimiento();
        ostra ostre=new ostra();
        ostre.movimiento();
    }
}
class ostra extends Animal
{
    
}
class Caballo extends Animal
{
    @Override
    public void movimiento()//oculta el movimiento de la clase animal y lo reemplaza
    {
        System.out.println("Galopar");
    }
}
class Animal
{
    public void movimiento()
    {
        System.out.println("movimiento indefinido");
    }
    public void movimiento(String movil)//sobre escribe
    {
        
    }
}