package ejercicio41;
public class Numero {
    public static double Mayor(String l){
        String[] Sdatos=l.split(",");
        double[] datos= new double[Sdatos.length];
        for (int i=0; i<datos.length;i++){
            datos[i]=Double.parseDouble(Sdatos[i]);
        }
        double mayor=datos[0];
        for (int i=0;i<datos.length;i++){
            if (datos[i]>mayor){
                mayor=datos[i];
            }
        }
        return mayor;
    }
}
