package ejercicio23;
public class Ecuacion {
    public static String solucion(double a, double b, double c){
        double d,x1,x2;
        String s1,s2,s3;
        d=(b*b)-(4*a*c);
        if (d==0){
            x1=(-b)/(2*a);
            s1=String.valueOf(x1);
            return s1;
        }
        else if(d>0){
            x1=((-b) + (Math.sqrt(d)))/(2*a);
            x2=((-b) - (Math.sqrt(d)))/(2*a);
            s1=String.valueOf(x1);
            s2=String.valueOf(x2);
            return s1 + " y " + s2;
        }
        else {
            s3="No tiene solucion";
            return s3;
        }
    }
}
