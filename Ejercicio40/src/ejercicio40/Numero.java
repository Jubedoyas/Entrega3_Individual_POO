package ejercicio40;
import java.util.*;
public class Numero {
    public static String Raiz(String l){
        String[] Sdatos=l.split(",");
        double[] raiz= new double[Sdatos.length];
        for (int i=0; i<raiz.length;i++){
            raiz[i]=Math.sqrt(Double.parseDouble(Sdatos[i]));
        }
        String r=Arrays.toString(raiz);
        return r;
    }
    public static String Cuadrado(String l){
        String[] Sdatos=l.split(",");
        double[] cuadro= new double[Sdatos.length];
        for (int i=0; i<cuadro.length;i++){
            cuadro[i]=Math.pow(Double.parseDouble(Sdatos[i]),2);
        }
        String cua=Arrays.toString(cuadro);
        return cua;
    }
    public static String Cubo(String l){
        String[] Sdatos=l.split(",");
        double[] cub= new double[Sdatos.length];
        for (int i=0; i<cub.length;i++){
            cub[i]=Math.pow(Double.parseDouble(Sdatos[i]),3);
        }
        String cu=Arrays.toString(cub);
        return cu;
    }
      
}
