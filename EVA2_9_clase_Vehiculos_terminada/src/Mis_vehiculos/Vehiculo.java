/**
 * @author Alberto O, Salazar 18550300
 * 
 * 
 * 
 * 
 */
package Mis_vehiculos;
import java.util.*;
public class Vehiculo
{
    private Scanner leer=new Scanner(System.in);
    private String marca="Ford", modelo="F-150";
    private int año=2017, cilindros=8, velocidad=0, conta1, conta2;
    private boolean encendido=false, encender;
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public int getAño()
    {
        return año;
    }
    public void setAño(int año)
    {
        this.año = año;
    }
    public int getCilindros()
    {
        return cilindros;
    }
    public void setCilindros(int cilindros)
    {
        this.cilindros = cilindros;
    }
    public void imrpimirDatos()
    {
        System.out.println("Tu vehiculo de la marca: "+marca);
        System.out.println("Tu vehiculo es un modelo: "+modelo);
        System.out.println("Tu vehiculo es del año: "+año);
        System.out.println("Tu vehiculo tiene "+cilindros+" cilindros");
    }
    public void prender()
    {
        encendido=true;
    }
    public void apagar()
    {
        encendido=false;
    }
    public void acelerar()
    {
        if(encendido==true)
        {
            velocidad=velocidad+10;
        }
    }
    public void frenar()
    {
        if(encendido==true&&velocidad>10)
        {
            velocidad=velocidad-10;
        }
    }
    public int getVelocidad()
    {
        return velocidad;
    }
    public void setVelocidad(int velocidad)
    {
        this.velocidad = velocidad;
    }
    public boolean isEncendido()
    {
        return encendido;
    }
    public String Viajar()
    {
        System.out.println("hola, hoy viajaras en un auto virtual");
        System.out.println("¿quieres encender el auto?");
        this.encender=leer.nextBoolean();
        if(this.encender==true)
        {
            this.prender();
            System.out.println("¿el auto está encendido? "+isEncendido());
            System.out.println("¿a que velocidad quieres ir? (160km/hr velocidad maxima)");
            this.conta1=leer.nextInt();
            conta2=conta1/10;
            switch(conta2)
            {
               case 1: for(int i=0; i<1; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 2: for(int i=0; i<2; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 3: for(int i=0; i<3; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 4: for(int i=0; i<4; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 5: for(int i=0; i<5; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 6: for(int i=0; i<6; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 7: for(int i=0; i<7; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 8: for(int i=0; i<8; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 9: for(int i=0; i<9; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 10: for(int i=0; i<10; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 11: for(int i=0; i<11; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 12: for(int i=0; i<12; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 13: for(int i=0; i<13; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 14: for(int i=0; i<14; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 15: for(int i=0; i<15; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
               case 16: for(int i=0; i<16; i++)
                       {
                           this.acelerar();
                       }
                       System.out.println("velocidad actual "+this.velocidad+" km/hr");
               break;
            }
            System.out.println("          RECOMIENDA ESTE VIAJE VIRTUAL CON TUS AMIGOS\n\n");
            System.out.println("                deteniendo el vehiculo");
            System.out.println("              (el viaje está por acabarse)");
            for (int i=0; i<conta2; i++)
            {
                this.frenar();
                System.out.println("disminuyendo velocidad "+this.velocidad+" km/hr");
            }
            System.out.println("apagando vehiculo");
            this.apagar();
            System.out.println("Fin del viaje");
        }
        else
        {
            System.out.println("            auto no encendido");
            System.out.println("            No habrá tal viaje");
        }
        return encender+" gracias bay";
    }
}