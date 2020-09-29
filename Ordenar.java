/**
 * Ordenar
 */
import java.io.*; 
import java.util.ArrayList;

  
public class Ordenar {

    public static void main(String[] args) throws Exception {
        String Ordenado[] =new String[0];
        String Disordenado[] =new String[0];
      
        String storage[] =new String[2];
        File file = new File("prueba.txt"); 
        BufferedReader texto = new BufferedReader(new FileReader(file)); 
        
        String st; int count=0;
        while ((st = texto.readLine()) != null) {
             if(!(st.equals(""))){
                storage[count]=st;
                count++;
             }
        }

        Ordenado=(storage[0].replace("[","").replace("]","").replace("\n","").replace("\r","").split(","));
        Disordenado=(storage[1].replace("[","").replace("]","").replace("\n","").replace("\r","").split(" "));
        
        String Resordenado[] =new String[Ordenado.length];
        for (int i = 0; i < Disordenado.length; i++) {
            Resordenado[find(Ordenado, Disordenado[i])]=Disordenado[i];
        }
        for (int i = 0; i < Resordenado.length; i++) {
            if (Resordenado[i]!=null){
            System.out.println(Resordenado[i]);}
        }
        

    } 
    public static int find(String[] a, String target)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i].equals(target))
                return i;

        return -1;
    }
}