/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package el.area.altura.volumen.de.un.cilindro;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class ElAreaAlturaVolumenDeUnCilindro {
/*//área=2(pi)*r*(h+r)
 
//volumen=(pi)*r*r*h
 
    double CalculaArea(double radio, double altura )
    {   double area=0;
        area=2*(3.1415)*radio*(altura+radio);
        return area;
    }
     
    double CalculaVolumen(double radio, double altura)
    {
        double volumen=0;
        volumen=3.1415*(radio*radio)*altura;
        return volumen;
    }
*/
 //   static double radio, altura;
//static float area, volumen;
    public static void main(String[] args) {
      /*  double a=0,v=0,radio=0,altura=0;
        ElAreaAlturaVolumenDeUnCilindro areaVol = new ElAreaAlturaVolumenDeUnCilindro();
        if(args.length<2)
            System.out.println("Ingrese: [radio altura]");
        else
        {
                 
                radio=Double.parseDouble(args[0]);
                altura=Double.parseDouble(args[1]);
             
             
            a=areaVol.CalculaVolumen(radio,altura);
            v=areaVol.CalculaArea(radio,altura);
            System.out.println("El Radio del Cilindro es: "+radio);
            System.out.println("La Altura del Cilindro es: "+altura);
            System.out.println("El Area del Cilindro es: "+a);
            System.out.println("El Volumen del Cilindro es: "+v);
        }*/
        
          
    /*  Scanner sc=new Scanner(System.in);  
      System.out.println("Ingresa radio");  
      float r= sc.nextFloat();  
      System.out.println("Ingresa altura");  
      float h= sc.nextFloat();  
      double area = 2*Math.PI*r*(r+h);  
      System.out.println(area); */
        
       

 /*   double radio,radio2, altura, area, volumen;
 
String dato1, dato2;
dato1 = JOptionPane.showInputDialog("Digite valor radio de la base:");
radio =  Double.parseDouble(dato1);
radio2 = Math.pow(radio, 2);
dato2 = JOptionPane.showInputDialog("Digite valor altura:");
altura = Double.parseDouble(dato2 );
area = (2*3.1416*radio*altura +radio);
//area = ((2*3.1416*radio2)*altura + 2*3.1416*radio2*radio2);
 volumen = (3.1416*radio2*altura);
 JOptionPane.showMessageDialog(null, "El area es ="+ area +"\nEl volumen es = "+volumen );
 */
      //Metodo Scanner para ingresar datos des de la consola 
      Scanner entrada=new Scanner(System.in);  
      //Declaramos la variable de tipo double
      double radio,radio2, altura, area, volumen;
      //Mensage a mostrar en la consola 
      System.out.println("Ingrese el radio del cilindro"); 
      /*A la variable radio se le asigno el medoto 
        para ingresar el dato des de la consola */
     radio = entrada.nextDouble();
     //Mensage a mostrar en la consola 
      System.out.println("Ingrese la altura del cilindro"); 
      /*A la variable radio se le asigno el medoto 
        para ingresar el dato des de la consola */
      altura = entrada.nextDouble();
      /* A la variable area se le asigno la formula para
        sacar el area del cilindro*/
      area = (2*3.1416*radio*altura +radio);
      /*Elevamos al cuadrado el dato almacenado en la variable
      radio para poder sacar el volumen del cilindro */
      radio2 = Math.pow(radio, 2);
      /* A la variable volumen se le asigno la formula para
        sacar el volumen del cilindro*/
     volumen = (3.1416*radio2*altura);
     //Mensaje que muestra el resultado por la consola 
     System.out.println("El area es ="+ area +"\nEl volumen es = "+volumen );
}
    }

