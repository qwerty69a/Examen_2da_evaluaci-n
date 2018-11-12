/**
 * polimorfismo orientado a objetos es cuando un objeto de una clase se 
 * comporte como de otra clases relacionadas por herencia.
 *
 * @author Alberto O, Salazar 18550300
 */
import Clasesinis.*;
public class Main
{
    public static void main(String[] args)
    {
        Automovil tsuru=new Automovil();
        Motocicleta harley=new Motocicleta();
        Avion avion1=new Avion();
        tsuru.setRuedas(4);
        harley.setRuedas(2);
        avion1.setRuedas(24);
        System.out.println("ruedas del auto: "+tsuru.getRuedas());
        System.out.print("seguridad del auto: ");tsuru.seguridad();
        System.out.print("clase de moto: ");harley.chopper();
        System.out.println("ruedas de la moto: "+harley.getRuedas());
        System.out.print("movimientro del avion: ");avion1.movimiento();
        System.out.println("ruedas del avion: "+avion1.getRuedas());
    }
    public static void imprimirRuedas(Automovil arg)
    {
        System.out.println("Ruedas del vehiculo");
        arg.getRuedas();
    }
}