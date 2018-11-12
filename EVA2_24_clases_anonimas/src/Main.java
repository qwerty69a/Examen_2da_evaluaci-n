/**
 * se declara una clase anonima (de la interface) para crear el objeto y utilizarlo pero solo se
 * puede utilizar en el momento.
 *
 * @author Alberto Salazar
 */
public class Main implements imprimirMensaje
{
    public static void main(String[] args)
    {
       Main obj=new Main();
       obj.imprime("Alberto");
       imprimirMensaje obje=new imprimirMensaje()//clase anonima de la interface
       {
           @Override
           public void imprime(String mensaje)//implementando el metodo abstracto (es obligatorio)
           {
               System.out.println("Hola "+mensaje);
           }
       };
       obje.imprime("Alberto");//usamos el objeto de la clase anonima
    }
    @Override
    public void imprime(String mensaje)//metodo de la interfaxce (obligatorio)
    {
        
    }
}
interface imprimirMensaje
{
    public void imprime(String mensaje);
}