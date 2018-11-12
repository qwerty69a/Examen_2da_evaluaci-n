/**
 * las clases abstractas se utilizan como base para generar objetos,
 * solo sirve como base de herencia.
 * 
 * la herencia se puede limitar para evitar complicaciones o evitar que se
 * reutilice el codigo con la clase final no se puede usar para heredar
 * 
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Ostra ostre=new Ostra();
        ostre.movimiento();
    }
}
//FINAL --> no permite que se herede de esa clase
class Almejas extends Animal
{
    
}
final class Ostra extends Animal // con FINAL no se permite heredar de esta clase
{
    
}
abstract class Animal
{
    public void movimiento()
    {
        System.out.println("Movimiento indefinido");
    }
}