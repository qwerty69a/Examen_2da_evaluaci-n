/**
 * 
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Alumno alumno = new Alumno();
        Empleado empleado = new Empleado();
        alumno.setNombre("Alberto");
        alumno.setApellido("Salazar");
        alumno.setNoControl("18550300");
        imprimirDatos(alumno);
        empleado.setNombre("Alberto");
        empleado.setApellido("Salazar");
        empleado.setRfc("ASSD25002R5S");
        imprimirDatos(empleado);
    }
    public static void imprimirDatos(Persona p)
    {
        p.imprimirNombre();
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
        this.rfc = rfc;
    }
    @Override
    public void imprimirNombre()
    {
        System.out.println("Empleado: " + getNombre() + " " + getApellido() + " " + getRfc());
    }
}
class Alumno extends Persona
{
    private String noControl;
    public String getNoControl()
    {
        return noControl;
    }
    public void setNoControl(String noControl)
    {
        this.noControl = noControl;
    }
    @Override
    public void imprimirNombre()
    {
        System.out.println("Alumno: " + getNombre() + " " + getApellido() + " " + getNoControl());
    }
}
abstract class Persona
{
    private String nombre;
    private String apellido;
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    abstract public void imprimirNombre();
}