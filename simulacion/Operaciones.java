
package simulacion;

public class Operaciones {
    

            public static int datosxi(int datosx[]){
                int r =0;
                for(int i = 0; i < datosx.length; i++) {

                    r +=datosx[i];
                }
                return r;
            }

            public static int datosxf(int datosx[]){
                int r =0;
                for(int i = 0; i < datosx.length; i++) {

                    r +=Math.pow(datosx[i],2);
                }
                return r;
            }
            public static int datosyi(int datosy[]){
                int r =0;
                for(int i = 0; i < datosy.length; i++) {

                    r +=datosy[i];
                }
                return r;
            }
            public static int datosmultiplicacion(int datosx[], int datosy[]){
                int r =0;
                for(int i = 0; i < datosy.length; i++) {
                    r +=(datosx[i] * datosy[i]);
                }
                return r;
            }
}
