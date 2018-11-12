package Mis_clases;
import Mis_clases.estadoCivil;
public class Persona
{
    private String nombre, apeido, direccion;
    private int edad, eStadoCivil;
    public boolean Persona;
    public Persona()
    {
        nombre="X";
        apeido="Y";
        edad=1;
        this.eStadoCivil=estadoCivil.soltero;
        direccion="downn wfj";
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getApeido()
    {
        return apeido;
    }
    public void setApeido(String apeido)
    {
        this.apeido = apeido;
    }
    public String getDireccion()
    {
        return direccion;
    }
    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    public int getEdad()
    {
        return edad;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    public int getEstadoCivil()
    {
        return eStadoCivil;
    }
    public void setEstadoCivil(int estadoCivil)
    {
        this.eStadoCivil = estadoCivil;
    }
}