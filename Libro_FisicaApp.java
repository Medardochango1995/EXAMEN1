/*
Diseñe, modele mediante el diagrama UML e implemente una clase Libro_Fisica que contenga los siguientes atributos: código de tipo entero, titulo de tipo String, autor de tipo String, anio_edicion de tipo entero.
Diseñe e implemente sus respectivos métodos get() y set() correspondientes para cada atributo; además, implemente el método toString() para mostrar la información relativa a la clase Libro_Fisica.
En la clase principal main(), diseñe e implemente 3 objetos que lleven el nombre de la clase Libro_Fisica, con valores considerados para la presente aplicación y muestre por pantalla. Finalmente, implemente la versión de prueba en Git Hub-Atom.


 */
package libro_fisicaapp;

/**
 *
 * @author Medardo Rene Chango Caguana
 */
class Libro_Fisica{
    /*Atributos*/
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
    
    /*Constructor*/
    
    public Libro_Fisica(int pCodigo,String pTitulo,String pAutor,int pAnio_edicion){
        
        codigo=pCodigo;
        titulo=pTitulo;
        autor=pAutor;
        anio_edicion=pAnio_edicion;
    }
    
    /*Metodos*/
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public int getAnio_edicion(){
        return anio_edicion;
    }
    
    public void setAnio_edicion(int anio_edicion){
        this.anio_edicion=anio_edicion;
    }
    
       @Override
    public String toString(){
        return "El libro de fisica "+titulo+" con CODIGO: "+codigo+"--"
                + "Del autor "+autor+
                 " tiene registrado el anion de edicion: "+anio_edicion+ "---- EDICION ";
    }
}
public class Libro_FisicaApp {
    
    
    public static void main(String[] args) {
        // Creamos los objetos
        Libro_Fisica libro1=new Libro_Fisica(502,"CUERPOS RIGIDOS","PETERSON", 3);
        Libro_Fisica libro2=new Libro_Fisica(503,"MOVIMIENTO DE UNA PARTICULA","ALONSO M", 6);
        Libro_Fisica libro3=new Libro_Fisica(504,"SISTEMA DE PARTICULAS","CARLOS GARCIA", 5);
        
        //Mostramos su estado
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        
       
            }
        }
     

