public class Cuadrado extends Cuadrilatero {

    public Cuadrado(int a){
        setLadoA(a);
    }
    
    @Override
    public void setLadoB(double ladoB) {
        super.setLadoB(ladoB);
        super.setLadoA(ladoB);
    }

    @Override
    public void setLadoA(double ladoA) {
        super.setLadoA(ladoA);
        super.setLadoB(ladoA);
    }
    
    
    @Override
    public double calcularArea(){
        return getLadoA() * getLadoA();
    }
    
    
    
}
