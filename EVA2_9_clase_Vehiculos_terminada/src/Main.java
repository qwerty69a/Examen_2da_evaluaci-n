/**
 * 1.- llevar el vehiculo a la velocidad indicada por el usuario (de 10 en 10)
 * 2.- detener el vehiculo (llearlo a 0  k/hr)
 * 
 * 
 * @author Alberto O, Salazar 18550300
 */
import java.util.*;
import Mis_vehiculos.Vehiculo;
public class Main
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        boolean salir=false;
        String acelera;
        Vehiculo carro=new Vehiculo();
        carro.imrpimirDatos();
        if(!carro.isEncendido()==true)//verificamos si el uto esta encendido, si no lo esta lo prendemos
        {
            carro.prender();
        }
        carro.acelerar();
        System.out.println("vas a fabulosos "+carro.getVelocidad()+" k/hr");
        carro.frenar();
        carro.apagar();
        carro.Viajar();//llamo lafuncion viajar para hacer un pequeño viaje con las instrucciones del usuario
    }
}