
package primerEjercicio;

public class BankAccount {
    //Definicion de aributos de la clase BankAccount 
    //Atributo de tipo entero con modificador de acceso privado que permite asignar un numero entero a la cuenta bancaria 
    private int accountNumber;
    //Atributo de tipo bollean qcon modificador de acceso protected que permite asignar un estado a la cuenta bancaria 
    protected boolean activated;
    
    //Metodo set para el estado de cuenta bancaria 
    public void setActivated(boolean activated){
        this.activated=activated;
    }
    
    //Metodo get para retornar el estado de la cuenta bancaria 
    public boolean getActivated(){
        return activated;
    }
}
