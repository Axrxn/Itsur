public class Prueba {
    public static void main(String[] args){
        
        //  No se puede crear una figura sin una forma concreta
//        Figura f = new Figura();
//        Cuadrilatero c = new Cuadrilatero();
        Circulo c1 = new Circulo();
        c1.setRadio(.5);
        c1.centro = new Ubicacion(2,9);
        
        Circulo c2 = new Circulo();
        c2.setRadio(.5);
        c2.centro.setX(2);
        c2.centro.setY(7);
        
        Circulo c3 = new Circulo();
        c3.setRadio(.5);
        c3.centro = new Ubicacion(2,9);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
 
        Cuadrado cu1 = new Cuadrado(5);
        cu1.vertices.add(new Ubicacion());
        cu1.vertices.add(new Ubicacion(0,5));
        cu1.vertices.add(new Ubicacion(5, 5));
        cu1.vertices.add(new Ubicacion(5,0));
        
        Cuadrado cu2 = new Cuadrado(10);
        cu2.vertices.add(new Ubicacion());
        cu2.vertices.add(new Ubicacion(0,10));
        cu2.vertices.add(new Ubicacion(10, 10));
        cu2.vertices.add(new Ubicacion(10,0));
        
        Cuadrado cu3 = new Cuadrado(10);
        cu3.vertices.add(new Ubicacion());
        cu3.vertices.add(new Ubicacion(0,10));
        cu3.vertices.add(new Ubicacion(10, 10));
        cu3.vertices.add(new Ubicacion(10,0));
        
        System.out.println(cu1.equals(cu2));
        System.out.println(cu2.equals(cu3));
          
    }
}
