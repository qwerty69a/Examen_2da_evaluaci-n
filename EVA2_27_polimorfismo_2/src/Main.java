/**
 * siempre se hace hacia atras con el polimorfismo para comvertir de un dato a
 * otro es decir:
 * primero  clasePadre obj=new claseHio();  -->ignora lo que tiene el hijo porque se comporta como la clasePadre
 * segundo  claseHijo obj2=(claseHijo)obj;  -->se comvierte a claseHijo para poder usar lo de ambas clases
 * 
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        //POLIMORFISMO
        Persona per1=new Alumno();//ignora lo que tiene el hijo porque se comporta como la clasePadre
        per1.setNombre("Alberto");
        per1.setApeido("Salazar");
        //casting (para conmvertir un tipo de dato a otro)
        Alumno alumn=(Alumno)per1;//se comvierte a claseHijo para poder usar los atributos y metodos de ambas clases
        System.out.println("Nombre: "+per1.getNombre());
        System.out.println("Apeido: "+per1.getApeido());
        System.out.println("Número de control: "+alumn.getNumControl());
    }
}
class Persona
{
    private String nombre, apeido;
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getApeido()
    {
        return apeido;
    }
    public void setApeido(String apeido)
    {
        this.apeido=apeido;
    }
}
class Empleado extends Persona
{
    private String rfc;
    public String getRfc()
    {
        return rfc;
    }
    public void setRfc(String rfc)
    {
        this.rfc=rfc;
    }
}
class Alumno extends Persona
{
    private int numControl;
    public Alumno()
    {
        numControl=18550300;
    }
    public int getNumControl()
    {
        return numControl;
    }
    public void setNumControl(int numControl)
    {
        this.numControl=numControl;
    }
}