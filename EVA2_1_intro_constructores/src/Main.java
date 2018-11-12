/**
 * basicamente la creacion del constructor se puede ver como crear la clase
 * java en automatico le pone un constructor defaul a toda clase
 * el constructor defaul es aquel en el que no pide nada "nombre_clase()"
 * el constructor sirve para inicializaer una clase (darle un valor de arranque, como a las variables)
 * en java existe algo llamado "Garbage collector"
 * los contructores no son metodos para ejeciutar pues se ejecutan cuando lo llamamos (usamos)
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Main objeto1=new Main();//constructor de la clase Main
        Prueba objetini1=new Prueba();//constructor de la clase Prueba
        System.out.println(objetini1.x);
    }
}
class Prueba
{
    int x;
    public Prueba()//los constructores no regresan un valor, y sirve para inicializar la clase
    {
        x=100;//dar valor a la variable de la clase
    }
    
}