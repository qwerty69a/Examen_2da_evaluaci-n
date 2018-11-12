/**
 * 
 *
 * @author Alberto Salazar
 */
package Otras_clases;
abstract public class Instrumento_musical
{
    private String nombre;
    abstract public void tocarInstrumento();
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
}