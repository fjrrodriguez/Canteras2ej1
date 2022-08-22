
package primerEjercicio;

public class Animal {
    //Declaracion de atributos de la clase animal 
    //Atributo de tipo String para la asignacion de la especie a la que pertenece el animal con modificador de acceso publico 
    public String specie;
    //Atributo de tipo float para la asignacion de la edad del animal con modificador de acceso private
    private float age;
    //Atributo de tipo char para la asignacion del genero(sexo) del animal con modificador de acceso private
    private char gender;
    //Atributo de tipo float para la asignacion del peso del animal con modificador de acceso protected
    protected float weight;
    
    //Metodo set para la especie del animal 
    public void setSpecie(String specie){
        this.specie=specie;
    }
    
    //Metodo get que retorna la especie del animal 
    public String getSpecie(){
        return specie;
    }

    //Metodo set para el genero del animal
    public void setGender(char gender) {
        this.gender = gender;
    }
    
   
}
