
package simulacion;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;
public class Simulacion extends Agent {
    
    @Override
    public void setup()
    {
        /// atributos 
            int xi,yi,yf,xf,n,i;
            Operaciones operaciones =new Operaciones();
            Scanner entrada = new Scanner(System.in);
            System.out.print("inserta cuantos numeros tiene el problema: ");
            n=entrada.nextInt();
            int[]datosx = new int[n];
            int[]datosy = new int[n];


            for(i = 0; i < datosx.length; i++) {
                System.out.print("inserta el xi: ");
                datosx[i] = entrada.nextInt();
            }

            for(i = 0; i < datosy.length; i++) {
                System.out.print("inserta el yi: ");
                datosy[i] = entrada.nextInt();
            }
            double datosx1=operaciones.datosmultiplicacion(datosx, datosy);
            double xp=operaciones.datosxi(datosx);
            double xt=operaciones.datosxf(datosx);
            double yp=operaciones.datosyi(datosy);
            double x =xp / n;
            double y =yp / n;
            double b1=((n*datosx1)-(xp * yp))/((n * xt)-(xp * xp));
            double b0=y- (b1*x);
            System.out.print("b1 el valor es:  "+b1+"\n");
            System.out.print("b0 el valor es: "+b0);
            addBehaviour(new MyOneShotBehaviour());
    }   
    private class MyOneShotBehaviour extends OneShotBehaviour{
        @Override
    public void action(){
    System.out.println("Agent's action method executed"+"\n");
}
    @Override
    public int onEnd(){
        myAgent.doDelete();
        return super.onEnd();
    }
}

}