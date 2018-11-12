/**
 * clase zoologico en la que creamos clases una llamada animales
 * una llamada reptil, una mamifero, y una ave con un atrivuto cada una excepto
 * la clase animal la cual contiene los atributos tipo de piel, mueve,
 * extremidades, ojos, y reproducción, dichos atributos de la clase animal
 * los heredan las demás clases individuales, los atributos de las otras
 * clases no los hereda ninguna otra.
 *
 * @author Alberto O, Salazar
 */
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        Ave ave1=new Ave();
        ave1.setExtremidades(4);
        ave1.setMueven("volando");
        ave1.setOjos(2);
        ave1.setReproduccion("oviparo");
        ave1.setTipoPiel("con plumas");
        ave1.setSizePico("12 cm");
        System.out.println("el ave 1 tiene:");
        System.out.println("estremidades: "+ave1.getExtremidades());
        System.out.println("se mueve de forma: "+ave1.getMueven());
        System.out.println("número de ojos: "+ave1.getOjos());
        System.out.println("clase de reproducción: "+ave1.getReproduccion());
        System.out.println("tipo de piel: "+ave1.getTipoPiel());
        System.out.println("tamaño del pico: "+ave1.getSizePico());
    }
}