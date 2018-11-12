/**
 * reglas de alcance o ambito de vida de una funcion
 * this es una palabra sreservada para así acceder a los miembros de la clase
 * o tambien es un apuntador a la instancia de la clase
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    int valor;
    public Main()
    {
        valor=10;
    }
    static String mensaje="hola";
    public static void main(String[] args)
    {
        Main obj=new Main();
        obj.imprimir();
        obj.imprimir2(10000);
        String meensaje="nada de hola";
        System.out.println(meensaje);
        for(int i=0; i<10; i++)
        {
            System.out.println(i);
        }
        for(int i=0; i<10; i++)
        {
            
        }
    }//aqui muere todo
    public void imprimir()
    {
        System.out.println("valor="+valor);
    }
    public void imprimir2(int valor)
    {
        System.out.println("valor="+valor);//la otra variable queda oculta
        System.out.println("valor del atributo="+this.valor);//aqui ya se usa la otra variable
    }
}