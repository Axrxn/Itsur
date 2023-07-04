import java.util.ArrayList;

/**
 *
 * @author Axrxn
 */
public abstract class Cuadrilatero extends Figura{
    private double ladoA; 
    private double ladoB;
    public ArrayList<Ubicacion> vertices = new ArrayList <>();
    
    public Cuadrilatero(){
    }
    
    public Cuadrilatero(int LadoA , int ladoB){
    setLadoA(ladoA);
    setLadoB(ladoB);
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
 
//    @Override
//    public abstract double calcularArea();

    @Override
    public double calcularPerimetro() {
        return 2 * ladoA * ladoB; 
    }

    @Override
   public boolean equals(Object obj){
       if(obj == null){
           return false;
       }
       
       if(obj.getClass() != this.getClass()){
           return false;
       }
       
       Cuadrilatero otro = (Cuadrilatero) obj;
       
       if(this.getLadoA() != otro.getLadoA()){
           return false;
       }
       
       if(this.getLadoB() != otro.getLadoB()){
           return false;
       }
       
       //Ver cada vertice
       if(!this.vertices.get(0).equals(otro.vertices.get(0))){
           return false;   
       }
       
       return true;
       
   }
}
