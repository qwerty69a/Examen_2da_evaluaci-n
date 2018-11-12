/**
 *                         INSTRUCCIONES DE LA PRACTICA:
 * 
 * crear una clase que nos permitar crear un obejto para que se comporte como
 * un control de television (podamos encenderla y apagarla, podamos subir y bajar los
 * los canales, subir y bajar el volumen, tambien que guarde el ultimo canal
 * para regresar a el, o introducir el numero de canal para ingresar a él)
 * cnales(1-999) volumen(0-100) mute(pone el volumen en 0 pero almacena el
 * volumen previo, para cuando se desactive el mute reestablecer el volumen
 * tal cual estaba antes de activar mute)
 * 
 * @author Alberto O, Salazar 18550300
 */
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Control tele1=new Control();
        System.out.println("bienvenido al es tu emulador de televisión");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
class Control//la clase control para crear objetos(televisiones) en el main para que se comporten como tal
{
    private int canal=1, volumen=15, mute, precanal;//el canal por default es 1 y el volumen empieza en valor 15
    private boolean encender=false;//por default la tele está apagada
    public void prender()//metodo para encender la tele
    {
        this.encender=true;
    }
    public void apagar()//metodo para apagar la tele
    {
        this.encender=false;
    }
    public int masVol()//subir volumen
    {
        if(volumen<100)
        {
            this.volumen=volumen+1;
            return volumen;
        }
        else if(volumen==100)
        {
            return volumen;
        }
        else
        {
            return volumen;
        }
    }
    public int menosVol()//bajar volumen
    {
        if(volumen<=100&&volumen>0)
        {
            this.volumen=volumen-1;
            return volumen;
        }
        else if(volumen==0)
        {
            return volumen;
        }
        else
        {
            return volumen;
        }
    }
    public int mute()//metodo para mutear la television
    {
        this.mute=this.volumen;
        this.volumen=0;
        return volumen;
    }
    public int unMute()//desacticvar el mute de la tele
    {
        if(mute>0&&mute<=100)
        {
            this.volumen=this.mute;
            return volumen;
        }
        else
        {
            return volumen;
        }
    }
    public int canalMas()//para controlar el canal que se está sintonizando
    {
        if(this.canal>0&&this.canal<=999)
        {
            this.precanal=this.canal;
            this.canal=this.canal+1;
            return canal;
        }
        else if(this.canal==999)
        {
            this.precanal=this.canal;
            this.canal=1;
            return canal;
        }
        else
        {
            return canal;
        }
    }
    public int canalMenos()//para controlar el canal que se está sintonizando
    {
        if(this.canal<=999)
        {
            this.precanal=this.canal;
            this.canal=this.canal-1;
            return canal;
        }
        else if(this.canal==1)
        {
            this.precanal=this.canal;
            this.canal=999;
            return canal;
        }
        else
        {
            return canal;
        }
    }
    public int ir_al_canal(int val)//ingresa el canal deseado
    {
        if(val>0||val<=999)
        {
            this.precanal=this.canal;
            this.canal=val;
            return canal;
        }
        else if(val<0)
        {
            return canal;
        }
        else if(val>999)
        {
            return canal;
        }
        else
        {
            return canal;
        }
    }
    public int canalPrevio()//regresa al canal previo
    {
        int vali;
        vali=this.canal;
        if(this.precanal>0&&this.precanal<=999)
        {
            this.canal=this.precanal;
            this.precanal=vali;
            return canal;
        }
        else
        {
            return canal;
        }
    }
}
