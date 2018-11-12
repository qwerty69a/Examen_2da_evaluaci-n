/**
 * En java el plano carteciano está al reves es decir que el eje Y esta de
 * cabeza (los positivos abajo y los negativos arriba).
 * 
 * Figuras geométricas.
 * clases para crear una figura con coordenadas, y para calcular sus areas y sus
 * perimetros
 *
 * @author Alberto O, Salazar 18550300
 */
import Figuras.Rectangulo;
import Figuras.Circulo;
public class Main
{
    public static void main(String[] args)
    {
        Rectangulo rec1=new Rectangulo();
        Circulo circ1=new Circulo();
        rec1.setAltura(20);
        rec1.setBase(50);
        circ1.setRadio(21);
        System.out.println("     Radio del circulo es: "+circ1.getRadio());
        System.out.println("   El area del circulo es: "+circ1.calArea());
        System.out.println("");
        System.out.println("      base del rectangulo: "+rec1.getBase());
        System.out.println("    Altura del rectangulo: "+rec1.getAltura());
        System.out.println("El area del rectangulo es: "+rec1.calcArea());
    }
}