
package ejercicio18;
public class Empleado {
        public static double Bruto(double h,double v){
            double b= h*v;
            return b;
        }
        public static double Neto(double h,double v,double f){
            double ff=f/100;
            double r=(h*v)*ff;
            double n=(h*v)-r;
            return n;
        }
        
}
