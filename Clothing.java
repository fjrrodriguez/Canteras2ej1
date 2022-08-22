
package primerEjercicio;

public class Clothing {
    //Declaracion de atributos de la clase prendas de vestir 
    //Atributo tipo cadena para el nombre de la preda de vestir con modificador de acceso publico 
    public String garmen;
    //Atributo tipo cadena para la talla de la preda de vestir con modificador de acceso privado
    private String size;
    //Atributo tipo float para el precio de la preda de vestir con modificador de acceso protected
    protected float price;
    //Atributo tipo entero para la cantidad de existencias de la preda de vestir con modificador de acceso protected
    protected int stock;
    
    //METODOS SET
    public void setGarmen(String garmen){
        this.garmen=garmen;
    }
    
    private void setSize(String size){
        this.size=size;
    }
    
    protected void setPrice(float price){
        this.price=price;
    }
    
    protected void setStock(int stock){
        this.stock=stock;
    }
    
}
