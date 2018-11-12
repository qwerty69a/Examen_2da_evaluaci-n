/**
 * metodos con el mismo nombre pero diferentes argumentos es sobre carga over ride
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Banco cliente=new Banco();
        System.out.println("nobre de cliente: "+cliente.getNombre_cliente());
        System.out.println("saldo del cliente: "+cliente.getSaldo());
        Banco cliente2=new Banco("alberto",655);
        System.out.println("nobre de cliente: "+cliente2.getNombre_cliente());
        System.out.println("saldo del cliente: "+cliente2.getSaldo());
    }
}
class Banco
{
    private String nombre_cliente;
    private double saldo;
    public Banco()//constructor que no requiere valores
    {
        nombre_cliente="Alberto O, Salazar";
        saldo=Math.PI;
    }

    public Banco(String nombre_cliente, double saldo)//constructor que requiere valores
    {
        this.nombre_cliente = nombre_cliente;
        this.saldo = saldo;
    }
    
    public String getNombre_cliente()
    {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente)
    {
        this.nombre_cliente = nombre_cliente;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
}