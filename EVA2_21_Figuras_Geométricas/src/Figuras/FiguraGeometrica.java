/**
 *
 * @author Alberto O, Salazar 18550300
 */
package Figuras;
abstract public class FiguraGeometrica
{
    private String color;
    private int anchoLinea;
    private Punto esqSupIzq;
    abstract public int calcArea();
    abstract public void dibujar();
    abstract public float calArea();
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public int getAnchoLinea()
    {
        return anchoLinea;
    }
    public void setAnchoLinea(int anchoLinea)
    {
        this.anchoLinea = anchoLinea;
    }
    public Punto getEsqSupIzq()
    {
        return esqSupIzq;
    }
    public void setEsqsupIzq(Punto EsqSupIzq)
    {
        this.esqSupIzq = EsqSupIzq;
    }
}