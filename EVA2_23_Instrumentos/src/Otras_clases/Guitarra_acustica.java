/**
 *
 * @author Alberto Salazar
 */
package Otras_clases;
public class Guitarra_acustica extends Instrumento_musical
{
    private int numCuerdas;
    public int getNumCuerdas()
    {
        return numCuerdas;
    }
    public void setNumCuerdas(int numCuerdas)
    {
        this.numCuerdas = numCuerdas;
    }
    @Override
    public void tocarInstrumento()
    {
        System.out.println("ggg");
    }
    
}
