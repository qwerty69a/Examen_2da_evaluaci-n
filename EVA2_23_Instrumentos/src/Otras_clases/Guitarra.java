/**
 *
 * @author Alberto Salazar
 */
package Otras_clases;
public class Guitarra extends Instrumento_musical implements Guitarra_electrica
{
    private int numCuerdas;
    public int getNumCuerdas()
    {
        return numCuerdas;
    }
    public void setNumCuerdas(int numCuerdas)
    {
        this.numCuerdas=numCuerdas;
    }
    @Override
    public void tocarInstrumento()
    {
        System.out.println("ggg");
    }
    @Override
    public void efectos(String tipoEfecto)
    {
        
    }
    @Override
    public void amplificador(int potencia)
    {
        
    }
}
