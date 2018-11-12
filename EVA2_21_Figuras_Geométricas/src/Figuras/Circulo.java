/**
 *
 * @author Alberto O, Salazar 18550300
 *
 */
package Figuras;
public class Circulo extends FiguraGeometrica
{
    private float radio;
    public float getRadio()
    {
        return radio;
    }
    public void setRadio(int radio)
    {
        this.radio = radio;
    }
    @Override
    public float calArea()
    {
        return (float) (3.1416*(radio*radio));
    }
    @Override
    public void dibujar()
    {
        
    }
    @Override
    public int calcArea()//metodo abstracto de la clase padre que se tiene que implementar pero esta clase no lo usara
    {
        return 0;//como esta classe no usara este metodo por eso solo devueve "0"
    }
}