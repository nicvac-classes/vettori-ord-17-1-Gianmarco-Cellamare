//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    import java.util.*;
    import java.lang.Math;
       
        public static void bubbleSort(int[] v, int n) {
            boolean trovato;
            int i, j, t;
    
            i = 0;
            trovato = false;
            while (i < n && !trovato) {
                j = 0;
                trovato = true;
                while (j < n - 1 - i) {
                    if (v[j] > v[j + 1]) {
                        t = v[j];
                        v[j] = v[j + 1];
                        v[j + 1] = t;
                        trovato = false;
                    }
                    j = j + 1;
                }
                i = i + 1;
            }
        }
        
        public static void merge(int[] v, int[] r, int numV, int numR, int[] vMerge) {
            int i, j, k;
    
            i = 0;
            j = 0;
            k = 0;
            while (i < numV && j < numR) {
                if (v[i] <= r[j]) {
                    vMerge[k] = v[i];
                    i = i + 1;
                } else {
                    vMerge[k] = r[j];
                    j = j + 1;
                }
                k = k + 1;
            }
            while (i < numV) {
                vMerge[k] = v[i];
                k = k + 1;
                i = i + 1;
            }
            while (j < numR) {
                vMerge[k] = r[j];
                k = k + 1;
                j = j + 1;
            }
        }
        
        public static int ricercaBinaria(int[] v, int n, int numero) {
            int i;
            int inizio, fine, medio;
            boolean trovato;
    
            trovato = false;
            medio = 0;
            i = -1;
            inizio = 0;
            fine = n - 1;
            while (inizio <= fine && !trovato) {
                medio = inizio + (double) (fine - inizio) / 2;
                if (v[medio] == numero) {
                    trovato = true;
                    i = medio;
                } else {
                    if (v[medio] < numero) {
                        inizio = medio + 1;
                    } else {
                        fine = medio - 1;
                    }
                }
            }
            
            return i;
        }




        public static void main(String[] args) {
            int n, num, numP, numD, index, i;
    
            System.out.println("Inserire il numero di numeri da generare: ");
            n = input.nextInt();
            int[] tempP = new int[n], tempD = new int[n];
    
            numD = 0;
            numP = 0;
            for (i = 0; i <= n - 1; i++) {
                num = random.nextInt(100);
                if (num % 2 == 0) {
                    tempP[numP] = num;
                    numP = numP + 1;
                } else {
                    tempD[numD] = num;
                    numD = numD + 1;
                }
            }
            int[] p = new int[numP];
            int[] d = new int[numD];
    
            for (i = 0; i <= numP - 1; i++) {
                p[i] = tempP[i];
            }
            for (i = 0; i <= numD - 1; i++) {
                d[i] = tempD[i];
            }
            bubbleSort(d, numD);
            bubbleSort(p, numP);
            int[] vMerge = new int[n];
    
            merge(d, p, numD, numP, vMerge);
            System.out.println("Vettore unito e ordinato: ");
            for (i = 0; i <= n - 1; i++) {
                System.out.println(Integer.toString(i) + ":" + vMerge[i] + " ");
            }
            int numeroRicerca;
    
            System.out.println("Inerire numero da ricercare nel vettore: ");
            numeroRicerca = input.nextInt();
            index = ricercaBinaria(vMerge, n, numeroRicerca);
            if (index != -1) {
                System.out.println("Il numero: " + vMerge[index] + " si trova nella posizione: " + index + "!");
            } else {
                System.out.println("Numero non trovato!");
            }
        }
    }
    

//LEGGERE LE ISTRUZIONI NEL FILE README.md