/**
 *
 * @author Alberto O, Salazar 18550300
 */
package Figuras;
public class Rectangulo extends FiguraGeometrica
{
    private int base, altura;
    public int getBase()
    {
        return base;
    }
    public void setBase(int base)
    {
        this.base = base;
    }
    public int getAltura()
    {
        return altura;
    }
    public void setAltura(int altura)
    {
        this.altura = altura;
    }
    @Override
    public int calcArea()
    {
        return base*altura;
    }
    @Override
    public void dibujar()
    {
        Punto esqInfIz=new Punto();
        Punto esqSupDer=new Punto();
        Punto esqInfDer=new Punto();
        /*esqInfIz.setX(getEsqSupIzq().getX());
        esqInfIz.setY(getEsqSupIzq().getY());
        esqSupDer.setX(getEsqSupIzq().getX());
        esqSupDer.setY(getEsqSupIzq().getY());
        esqInfDer.setX(getEsqSupIzq().getX());
        esqInfDer.setY(getEsqSupIzq().getY());*/
    }
    @Override
    public float calArea()//metodo abstracto de la clase padre que se tiene que implementar pero esta clase no lo usara
    {
        return 0;//como esta classe no usara este metodo por eso solo devueve "0"
    }
}