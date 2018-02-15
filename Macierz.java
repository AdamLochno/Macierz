package zadanie53;
import java.util.*;

class matrix
{
    double suma;
    public void czytajDane(double [][]macierz, int rozmiar)
    {
    int i,j;
    
    Random random = new Random(); //generowanie liczb losowych
        for (i=0; i<rozmiar; i++)
        {
            for (j=0; j<rozmiar; j++)
            {
            if (i==j)
                macierz [i][j] = Math.round(9*(random.nextDouble()));
            else
                macierz [i][j]=0;
            }
        }
    }
    public void przetworzDane(double[][]macierz, int rozmiar)
    {
    int i;
    suma = 0;
    
    for (i=0; i<rozmiar; i++)
    suma = suma + macierz[i][i];
       
    }
    
    public void wyswietlWyniki (double[][]macierz, int rozmiar)
    {
    int i,j;
    for (i=0; i<rozmiar;i++)
    {
        for (j=0;j<rozmiar;j++)
        {
            System.out.print((int) macierz [i][j]+ " ");
        }
        System.out.println(" ");
    }
    System.out.println("Suma elementów na przekątnej wynosi: " + (int)suma + "."); 
    }
}

public class Macierz {


    public static void main(String[] args) 
    {
    int rozmiar = 10;
    double [][] tablica = new double [rozmiar][rozmiar];
    matrix matrix1 = new matrix();
    
    matrix1.czytajDane(tablica, rozmiar);
    matrix1.przetworzDane(tablica, rozmiar);
    matrix1.wyswietlWyniki(tablica, rozmiar);
    }
    
}
