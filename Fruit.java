
package primerEjercicio;

import java.util.ArrayList;

public class Fruit {
    //Definicion de atributos de la clase 
    //Atributo de tipo cadena para asignar el nombre de la fruta con modificador de acceso publico
    public String name;
    //Atributo de tipo float para asignar el peso promedio de la fruta con modificador de acceso privado
    private float averageWeight;
    //Atributo tipo ArrayListe para asignar los colores de la fruta con modificador de acceso publico
    public ArrayList<String> colors;
    
    //Metodo set
    public void setColor(String name){
        this.name=name;
    }
    
    //Metodo get que retorna el arreglo de colores registrados
    public ArrayList<String> getColors() {
        return colors;
    }
    
    //Metodo set para el arreglo de colores
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
}
