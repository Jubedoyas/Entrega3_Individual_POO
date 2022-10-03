
package ejercicio19;
public class Triangulo {
    public static double perimetro (double l){
        double p=3*l;
        return p;
    }
    
    public static double area (double l){
        double a= ((Math.sqrt(3))/4)*(Math.pow(l,2));
        return a;
    }
    
    public static double altura (double l){
        double al=((Math.sqrt(3))/2)*(l);
        return al;
    }
}
