
package primerEjercicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 * @author Francy Ramirez
 */
public class Principal {

    public static void main(String[] args) {
        //Declaracion de variable para el menu principal
        int opc;
        //objeto de la clase Principal
        Principal cp = new Principal();
        //objeto Scanner para el ingreso de datos por consola
        Scanner entrada = new Scanner(System.in);
        //implementacion del menu principal mediante el uso de do while
        do{
            //Opciones del menu principal
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Crear persona\n2.Crear fruta\n3.Crear cuenta bancaria\n4.Registrar animal\n5.Registrar deporte\n6.Registrar prendas de vestir\n7.Salir");
            System.out.print("Elija una opcion:  ");
            opc=entrada.nextInt();
            
            switch(opc){
                
                case 1:
                    //metodo para crear persona
                    cp.crearPerson();
                    break;
                case 2:
                    //metodo para crear fruta 
                    cp.crearFruit();
                    break;
                case 3:
                    //Metodo para crear cuenta bancaria
                    cp.crearCuentaBancaria();
                    break;
                case 4:
                    //Metodo para registrar nuevo animal 
                    cp.registrarAnimal();
                    break;
                case 5:
                    //Metodo para registrar deporte 
                    cp.registrarSport();
                    break;
                case 6:
                    //Metodo para registrar nueva prenda de vestir 
                    cp.registrarClothing();
                    break;
                default:
                    //Al culminar la ejecucion del ciclo do while se confirma que se esta saliendo del ciclo
                    System.out.println("Saliendo.... ");
            }
            //Se ejecuta el ciclo do while miemtras la opcion sea menor a 6, si esto ya no es verdadero se culmina la ejecucion
        }while(opc<6);
        
    }
    
    //Metodo crear persona
    public void crearPerson(){
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables 
        int year,mounth,day;
        String name;
        String lastname1;
        String lastname2;
        Date datebirth;
        float height;
        //Se crea el objeto de la clase persona
        Person per = new Person();
        //Se registrar los valores para cada variable 
        System.out.println("DATOS DE LA PERSONA A CREAR ");
        System.out.print("Nombre: ");
        name=entrada.nextLine();
        per.setName(name);
        System.out.print("Primer apellido: ");
        lastname1 = entrada.nextLine();
        System.out.print("Segundo apellido: ");
        lastname2 = entrada.nextLine();
        System.out.println("Fecha de nacimiento: ");
        System.out.print("Año: ");
        year=entrada.nextInt();
        System.out.print("Mes: ");
        mounth=entrada.nextInt();
        System.out.print("Dia: ");
        day=entrada.nextInt();
        GregorianCalendar dt=new GregorianCalendar(year,mounth-1,day);
        datebirth = dt.getTime();
        System.out.print("Estatura: ");
        height = entrada.nextFloat();
        System.out.println("DATOS GUARDADOS...");
        System.out.println(per.getName()+"  Registrado");
    }
    
    //Metodo crear Fruta
    public void crearFruit(){
        //Declaracion de variables
        int opc;
        String name;
        String color;
        float averageWeight;
        ArrayList<String>colors=new ArrayList<>();
        Scanner entrada=new Scanner(System.in);
        //Se crea el objeto de la clase Fruit
        Fruit ft=new Fruit();
        //Se asignan los valores para cada variable 
        System.out.print("Nombre de la fruta: ");
        name=entrada.nextLine();
        ft.setColor(name);
        System.out.print("Peso promedio: ");
        averageWeight=entrada.nextFloat();
        //Se cargan los datos del ArrayList
        do{
            System.out.println("Agregar color");
            System.out.println("1. Si\n2.No");
            opc=entrada.nextInt();
            switch(opc){
                case 1: 
                   
                    System.out.print("Color: ");
                     entrada.next();
                    color=entrada.nextLine();
                    colors.add(color);
                    ft.setColors(colors);
                    break;
                case 2:
                    System.out.println("Datos guardados");
                    break;
                default: 
                    System.out.println("Opcion no valida");
            }
        }while(opc!=2);
        
        
    }
    
    //Metodo crear cuenta bancaria
    public void crearCuentaBancaria(){
        //Declaracion de variables 
        int accountNumber;
        boolean activated;
        int opc;
        Scanner entrada = new Scanner(System.in);
        //Se crea el objeto de la clase BankAccount
        BankAccount ba = new BankAccount();
        System.out.println("BIENVENIDO USTED ESTA REGISTRANDO UN NUEVO NUMERO DE CUENTA");
        //Asignacion de valores para cada variable
        System.out.print("Ingrese numero de cuenta: ");
        accountNumber=entrada.nextInt();
        do{
        System.out.println("¿Quiere activar la cuenta?");
            System.out.println("1. Si\n2. No");
        opc=entrada.nextInt();
        switch(opc){
            case 1:
                //Se activa la cuenta 
                    activated=true;
                    ba.setActivated(activated);
                    System.out.println("El estado de la cuenta es:" +ba.getActivated());
                    
                   break;
                
            case 2:
                //El estado de cuenta queda inactiva 
                    activated=false;
                    ba.setActivated(activated);
                    System.out.println("El estado de la cuenta es:" +ba.getActivated());
                    
                  break; 
            default:
                System.out.println("Entrada invalida");
                
        }
        //Se culmina la ejecucion del ciclo do while 
        }while(opc>=3);
        System.out.println("Cuenta guardada ");
    }
    
    //Metodo registrar animal 
    public void registrarAnimal(){
        //Declaracion de variables 
        String specie;
        float age;
        char gender;
        float weight;
        //Se crea el objeto de la clase Animal 
        Animal an = new Animal();
        Scanner entrada = new Scanner (System.in);
        //Se asignan valores para cada variable
        System.out.println("DATOS DEL ANIMAL A REGISTRAR");
        System.out.print("Nombre de la especie: ");
        specie=entrada.nextLine();
        an.setSpecie(specie);
        System.out.print("Edad del animal: ");
        age=entrada.nextFloat();
        //Se usa el ciclo do while para asignar el genero del animal 
    do{System.out.print("Genero del animal:  M (Macho) o H (Hembra):  ");
        gender=entrada.next().charAt(0);
        switch(gender){
            case 'H':
            case 'h':
            case 'M':
            case 'm':
                an.setGender(gender);
                break;
            default: 
                System.out.println("Entrada invalida");
        }    
       }while((gender!='H')&&(gender!='M')&&(gender!='h')&&(gender!='m'));
        System.out.println("Peso: ");
        weight= entrada.nextFloat();
        System.out.println("GUARDANDO...");
    }
    
    //Metodo registrar Deporte 
    public void registrarSport(){
        //Declaracion de variables 
        String name;
        int code;
        boolean state;
        int participants;
        int opc; 
        //Se crea el objeto de la clase Sport
        Sport sp = new Sport();
        Scanner entrada = new Scanner(System.in);
        System.out.println("DEPORTE");
        //Se asignan los valores para cada variable 
        System.out.print("Nombre: ");
        name=entrada.nextLine();
        System.out.print("Codigo: ");
        code=entrada.nextInt();
        //Se asigna un estado activo o descalificado al estado del deporte mediante la una variable booleana state
        do{
            System.out.println("Estado:");
            System.out.println("1.Activo\n2.Descalifocado");
            opc=entrada.nextInt();
            switch (opc) {
                case 1:
                    //estado activo
                    state=true;
                    break;
                case 2:
                    //estado descalificado 
                    state=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opc>=3);
        System.out.print("Numero de participantes: ");
        participants=entrada.nextInt();
        System.out.println("GUARDANDO...");
    }
    
    //Metodo registrar prenda de vestir 
    public void registrarClothing(){
        //Declaracion de variables 
        String garmen;
        String size;
        float price;
        int stock;
        Clothing cl=new Clothing();
        Scanner entrada=new Scanner(System.in);
        //asignacion de valores a cada variable 
        System.out.print("Nombre de la prenda de vestir: ");
        garmen=entrada.nextLine();
        System.out.print("Talla: ");
        size=entrada.nextLine();
        System.out.print("Precio: ");
        price=entrada.nextFloat();
        System.out.print("Unidades disponibles: ");
        stock=entrada.nextInt();
        System.out.println("GUARDANDO...");
    }
}
