
package primerEjercicio;

public class Sport {
    //Declaracion de atributos de la clase Sport
    //Atributo de tipo cadena que asigna un nombre del deporte con modificador de acceso publico
    public String name;
    //Atributo de tipo entero que asigna un codigo al deporte con modificador de acceso private
    private int code;
    //Atributo de tipo bolean que asigna un estadon del deporte co modificador de acceso private
    private boolean state;
    //Atributo de tipo entero que asigna un numero de participantes por deporte con modificador de acceso protected
    protected int participants;
    
    //Metodo set para el nombre del deporte
    public void setName(String name){
        this.name=name;
    }
    //Metodo set para el codigo del deporte 
    private void setCode(int code){
        this.code=code;
    }
    //Metodo set para el estado asignado del deporte 
    private void setState(boolean state){
        this.state=state;
    }
    //Metodo set pra el numero de participantes del deporte 
    protected void setParticipants(int participants){
      this.participants=participants;  
    }
   
}
