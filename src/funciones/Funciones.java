/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funciones;

import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Funciones 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //2
        //System.out.println(FuncionSerie2(3, 4));
        //8
        //System.out.println("Hay "+FuncionContarA("ala, holA como estás")+ " palabras con A");
        //9
        //System.out.println(FuncionPotenciaDeDos(16));
        //10
        //System.out.println(FuncionNumPerfecto(5, 7));
        //13
       //System.out.println(FuncionOrdenar());
        //14
        //System.out.println(FuncionSerie14(5, 3, 3));
        //16
        //System.out.println(FuncionSerie16(5,3,2));
        //17
        System.out.println(FuncionLetrasAnumero("DOSCIENTOS QUINCE"));
    }
    
    //2
    public static int FuncionSerie2(int X, int Y)
    {
        int ValorReturn;
        if (X<=0 || X>255 || Y<=0 || Y>255)
        {
            return -1;
        }
        else
        {
            int[] Vector = new int[Y];
            Vector[0] = X;
            for (int i = 1; i < Vector.length; i++) 
            {
               X = X * (i+1);
               Vector[i]=X;
            }
            for (int i = 0; i < Vector.length; i++) 
            {
                if(i==(Y-1))
                {
                    ValorReturn = Vector[i];
                    return ValorReturn;
                }
            }
        }
        return 0;
    }
    
    //3
    public static int FuncionSerie3()
    { 
        
        return 0;        
    }
    
    //4
    public static String FuncionCadenas(String S1, String S2)
    {
        int longitud1=S1.length();
        int longitud2=S2.length();
        char[] frase1 = S1.toCharArray();
        char[] frase2 = S2.toCharArray();          
        for (int i = 0; i < longitud2; i++)
           {
              for (int j = 0; j < longitud1; j++) 
               {
                  if (frase1[j]== frase2[i]) 
                   {
                      frase1[j]=' ';
                   }
               }
            }
           for (int i=0;i<frase1.length;i++)
           {   
               if (frase1[i]!=' ') 
               {
                   System.out.println(" " + frase1[i]);
               }
           } 
        return null;
    }
    
    //7
    public static String FuncionMinusculas(String Cadena)
    {
        int longitud1 = Cadena.length();    
        char [] frase1= Cadena.toCharArray();        int i;

        for (i = 0; i < longitud1; i++)
        {
            if (Cadena.codePointAt(i)>=65 && Cadena.codePointAt(i)<=90)
            {
                int codigo = Cadena.codePointAt(i);
                codigo =codigo+32;           
                char x=(char)codigo;
                return x + " = " + Cadena.codePointAt(i);
                //System.out.print(x);             
            }
            else                  
            {
              return Cadena.charAt(i)+ " = " + Cadena.codePointAt(i);
              //System.out.print( Cadena1.charAt(i)); 
            }
        }
        return Cadena.charAt(i)+ " = " + Cadena.codePointAt(i);
    }
    
    //8
    public static int FuncionContarA(String Cadena)
    {
        Cadena = " "+ Cadena +" "; 
        int longitud = Cadena.length();
        char[] frase1 = Cadena.toCharArray();
        int ContarA = 0;
        for (int i = 0; i< Cadena.length() ; i++)
        {
            if (frase1[i]=='A' || frase1[i]=='a') 
            {
                ContarA += 1;
                for (int j = i; j < Cadena.length(); j++) 
                {
                    if (frase1[j] == ' ') 
                    {
                      i = j;
                      j = Cadena.length();                      
                    }   
                }                
            }            
        }    
        return ContarA;
    }
    
    //9
    public static boolean FuncionPotenciaDeDos(int Numero)
    {
        int c = 0;
        for (int i = 0; i < 2; i++) 
        {
            if (Numero>0)
            {
                i = 2;
            }
            else
            {   
                i = 0;
                JOptionPane.showMessageDialog(null, "Ingresar Valores Enteros Positivos Mayores a 0" );
            }  
        }        
        long[] arreglo=new long[Numero];
        for (int i = 0; i < arreglo.length; i++) 
        {
            arreglo[i]=i*i;           
        }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (Numero==arreglo[i])
            {
                i=arreglo.length;
                c=1;
            }
        }
        if (c==1 || Numero==1)
        {
            return true;            
        }
        else
        {
            return false;            
        }                
    }
    
    //10
    public static int FuncionNumPerfecto(int X, int Y)
    {
        int S = 0;
        for (int i = X; i <= Y; i++) 
        {
            S=0; 
            for (int j = 1  ; j < i; j++) 
            {
                if ((i % j)==0) 
                {
                    S =S+j;
                }
                if (i==Y && i%j!=0) 
                {
                    S = 0; 
                }
            }
            if (S == i) 
            {
                i = Y;
                return S;
            }
        }
            if(S == 0) 
            {
                return -1;
            }
        return 0;
    }
    
    //13
    public static int[] FuncionOrdenar(int[] valores)
    {
        
     int respaldo[] = new int[valores.length];
    int cont = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < 0) {
                respaldo[cont] = valores[i];
                cont++;
                }
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] >= 0) {
                respaldo[cont] = valores[i];
                cont++;
                }
        }
        return respaldo;
    }
    
    //14
    public static int FuncionSerie14(int X, int Y, int Z)
    {
        int vector[] = new int[Z+1];
        int cont = 0;
        if ((X<=0) || (X>255) || (Y<=0) || (Y>255) || (Z<=0) || (Z>255)) 
        {
            return -1;
        }
        else
        {
            do 
            {
                vector[cont]= Integer.parseInt(String.valueOf(X)+String.valueOf(Y));
                vector[cont+1]= Integer.parseInt(String.valueOf(Y)+String.valueOf(X));
                X = X + 1;
                Y = Y + 1;
                cont = cont + 2;
            }
            while (Z>=cont);
        }
        return vector[Z-1];
    }
    
    //16
    public static int FuncionSerie16(int X, int Y, int Z)
    {
        int cont = 0;
        int a = 0;
        int acum = 0;
        int vector[] = new int[Z+1];
        if (Y > Z) 
        {
            return 0;
        }
        if ((X<=0) || (X>255) || (Y<=0) || (Y>255) || (Z<=0) || (Z>255)) 
        {
            return -1;
        }
        do 
        {
            if (a==0) 
            {
                vector[cont] = X;
            }else
            {
                vector[cont]=vector[cont-1]*a;
            }
            cont++;
            a=a+2;
        } 
        while (Z >= cont);
        for (int i = Y-1; i < Z; i++)
        {
            acum = acum + vector[i];
        }
        return acum;
    }
    
    //17
    public static String FuncionLetrasAnumero(String Numero)
    {
        String[] Letras = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
        "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
        "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA",
        "CIEN", "CIENTO", "DOSCIENTOS"};
        Integer[] Valores = {1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        20, 30, 40, 50, 60, 70, 80, 90,
        100, 100, 200};
        
        List lstLetras = java.util.Arrays.asList(Letras);
        StringTokenizer st = new StringTokenizer(Numero);
        Integer numer = 0;
        while (st.hasMoreTokens()) 
        {
            String t = st.nextToken();
            if (lstLetras.indexOf(t) > -1) 
            {
                numer += Valores[lstLetras.indexOf(t)];
            }
        }
        if ((numer>255)) 
        {
            return String.valueOf(-1);
        }
        return String.valueOf(numer);
    }
}

    
  

