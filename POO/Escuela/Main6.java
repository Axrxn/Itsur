public class IdentificarTipos {
    public static void main(String[] args) {
       Object[] objetos = new Object[6];
       objetos[0] = "S";
       objetos[1] = 10;
       objetos[2] = 5.5;
       objetos[3] = false;
       objetos[4] = 'c';
       objetos[5] = "C";
        
    }
    
 /**
     * @param arreglo
     */
    public static void explorarTipos(Object[] arreglo){
        int Ccad=0;
        int Cent=0;
        int Cdec=0;
        int Cboo=0;
        int Ccar=0;
        
       for(int i=0; i<arreglo.length; i++)
    {
        if(arreglo[i].getClass()==Integer.class)
        {
            Cent++;
        }if(arreglo[i].getClass()==Double.class)
        {
            Cdec++;
        }if(arreglo[i].getClass()==Character.class)
        {
            Ccar++;
        }if(arreglo[i].getClass()==Boolean.class)
        {
            Cboo++;
        }if(arreglo[i] instanceof String )
        {
            Ccad++;
        }
        
      
    }
        System.out.println("i= " + Cent + "\n" + 
        "b= " + Cboo + "char= " + Ccar + 
                "Cadenas= " + Ccad + "D= " + Cdec);
   }
}
   
