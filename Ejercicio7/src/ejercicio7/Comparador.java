package ejercicio7;
public class Comparador {
    public static String comparar(String a,String b){
        int ai,bi;
        ai=Integer.parseInt(a);
        bi=Integer.parseInt(b);
        if (ai>bi){
            String m="A es mayor";
            return m;
        }
        else{
            if (ai==bi){
                String m="A es igual a B";
                return m;
            }
            else{
                String m="B es mayor";
                return m;
            }
        }     
    }
}
