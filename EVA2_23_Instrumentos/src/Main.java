/**
 * 
 *
 * @author Alberto O, Salazar 18550300
 */
import Otras_clases.Guitarra;
import Otras_clases.Guitarra_acustica;
public class Main
{
    public static void main(String[] args)
    {
        Guitarra guitarra=new Guitarra();
        Guitarra_acustica guitarra2=new Guitarra_acustica();
        guitarra.setNombre("Gibson");
        guitarra.amplificador(200);
        guitarra.efectos("electrica");
        guitarra.setNumCuerdas(6);
        guitarra2.setNombre("krunck");
        System.out.print("Sonido de guitarra: ");guitarra.tocarInstrumento();
        System.out.println("Nombre: "+guitarra.getNombre());
        System.out.println("Numero de cuerdas: "+guitarra.getNumCuerdas());
        
    }
}