/**
 * class Animal y class Mamifero (animal es clase base porque de ahí vienen los
 * metodos heredados) y la otra clase es la clase hijo, java solo permite
 * herencia simple, otros si pero java puede simular la herencia multiple
 * (SIMULAR).
 * nunca debemos ocultar lo de la base porque puede ser algo importante
 * java y en la mayoria de los lenguajes toodas las clases decienden de la
 * clase Object, principalmente en los lenguajes de POO
 * super
 *
 * @author Alberto O, Salazar 18550300
 */
public class Main
{
    public static void main(String[] args)
    {
        Animal ani=new Animal();
        Mamifero mamife=new Mamifero();
        Mamifero jirafa=new Mamifero("Pararse");
    }
}
class Mamifero extends Animal
{
    public Mamifero()
    {
        //lo primero que hace es llamar al constructor de la clase animal (clase padrre o base)
        super();
    }
    public Mamifero(String accion)//si no ponemos el constructor igual que el de la clase base nos oculta el constructor de la clase base
    {
        super(accion);
    }
}
class Animal
{
    public Animal()
    {
        System.out.println("Respirando");
    }
    public Animal(String accion)
    {
        System.out.println("Respirar y "+accion);
    }
}