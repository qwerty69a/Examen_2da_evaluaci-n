/**
 * uso de memoria
 * para guarar un valor se necesita otra variable igual para copiartlo lo mismo con los objetos
 * cuando instancian un objeto le das memoria, por eso le da una direccion en memoria
 * con los objeto solo es una direccion referenciada con 2 variabbles distintas
 * las memorias si se guardan por separado
 * en otros lenguajes las referencias se les llaman apuntadores
 * solo JAVA no usa apuntadores porque trabaja con ma maquina virtual
 *
 * @author Alberto O, Salazar 18550300
 * 
 */
public class Main
{
    public static void main(String[] args)
    {
        Prueba obj=new Prueba();
        obj.valor=10;
        System.out.println("El valor es "+obj.valor);
        int algo=70, copia=algo;
        System.out.println("algo="+algo);
        System.out.println("copia="+copia);
        Prueba copiaObj=obj;//copia del objeto esta es una referencia a la direccion en memoria del objeto "obj"
        System.out.println("El valor de la copia es "+copiaObj.valor);
    }
}
class Prueba
{
    int valor;//4 bytes minimo para un entero aquí en JAVA
}