/**
 * 
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("arera del cuadrado es: "+Geometria.calAreaCuadrado(100));
        System.out.println("el area del triangulo es: "+Geometria.calAreaTriangulo(21, 65));
        System.out.println("el area del circulo es: "+Geometria.calAreaCirculo(56));
        System.out.println("el area del rectangulo es: "+Geometria.calAreaRectangulo(12, 24));
        System.out.println("el area del romboide es: "+Geometria.calAreaRomboide(20, 32));
        System.out.println("el area del trapecio es: "+Geometria.calAreaTrapecio(12, 12, 12));
        System.out.println("el area del rombo es: "+Geometria.calAreaRombo(10, 10));
        System.out.println("el area del hexagono es: "+Geometria.calAreaHexagono(45, 62));
        System.out.println("el area del pentagono es: "+Geometria.calAreaPentagono(8, 56));
        System.out.println("el area del elipse es: "+Geometria.calAreaElipse(12, 15));
    }
}
class Geometria
{
    public static double calAreaCuadrado(double dLado)
    {
        return dLado*dLado;
    }
    public static double calAreaTriangulo(double base, double altura)
    {
        return ((base*altura)/2);
    }
    public static double calAreaCirculo(double radio)
    {
        return Math.pow((Math.PI*radio), 2);
    }
    public static double calAreaRectangulo(double base, double altura)
    {
        return base*altura;
    }
    public static double calAreaRomboide(double base, double altura)
    {
        return base*altura;
    }
    public static double calAreaTrapecio(double base, double altura, double baseMayor)
    {
        return ((base+baseMayor)/2)*altura;
    }
    public static double calAreaRombo(double D, double d)
    {
        return (1/2)*D*d;
    }
    public static double calAreaHexagono(double p, double a)
    {
        return (p*a)/2;
    }
    public static double calAreaPentagono(double p, double a)
    {
        return (p*a)/2;
    }
    public static double calAreaElipse(double S, double s)
    {
        return Math.PI*S*s;
    }
}