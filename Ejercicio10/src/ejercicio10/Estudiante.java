package ejercicio10;
public class Estudiante {
    public static int Matricula(int p, int e){
        int matri;
        matri=50000;
        if (p > 2000000 && e>3){
            matri+=(0.03*p);
        }return matri;
    }
}
