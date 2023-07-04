import java.util.ArrayList;


public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circulo circ = new Circulo(70);
              
       Cuadrilatero cuad1 = new Cuadrilatero(0.5,3);
        
       Cuadrilatero cuad2 =new Cuadrilatero(3, 3);
        
       Cuadrado cu = new Cuadrado(5);
        
       TrianguloRectangulo triang2 = new TrianguloRectangulo(7,3);
        
       TrianguloRectangulo triang1 = new TrianguloRectangulo();
       
       ArrayList<Figura> figuras = new ArrayList<>();
       figuras.add(circ);
       figuras.add(cuad1);
       figuras.add(cuad2);
       figuras.add(cu);
       figuras.add(triang1);
       figuras.add(triang2);
       
       /*for(int i = 0; i < figuras.size(); i++){
           //Figura f = figuras.get(i);
           //f.redimensionar(150);
           figuras.get(i).redimensionar(150);
           figuras.get(i).redimensionar(30);
       }*/
       
       int circulos =0;
       int cuadrados =0;
       int cuadrilateros =0;
       int triangulos =0;
       
       for(Figura f: figuras){
           f.redimensionar(150);
           f.redimensionar(30);
           if(f.getClass() == Cuadrilatero.class){
               cuadrados++;
           }else if(f.getClass() == Cuadrado.class){
               cuadrilateros++;
           }else if(f.getClass() == Circulo.class){
               circulos++;
           }else{
               triangulos++;
           }
       }
      
      
      
      /*DecimalFormat formateador = new DecimalFormat("#####,####.###"); 
        DecimalFormat formateador1 = new DecimalFormat("#####,####.000"); 
        DecimalFormat formateador2 = new DecimalFormat("0.000"); 
        double numero = 123456.7868786;
        
        System.out.println(formateador.format(numero);
        System.out.println(formateador1.format(numero);
        System.out.println(formateador2.formtat(numero);*/
    }
    
}
