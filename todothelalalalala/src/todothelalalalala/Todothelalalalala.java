/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todothelalalalala;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tanuló
 */
public class Todothelalalalala {

    static ArrayList<String> todo = new ArrayList<>();
    
    static Scanner be = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        
        while (true){
        int v = val();
        if ( v == 1){
            ujf();
        }
        else if (v == 2){
            int szam = 1;
            if (!todo.isEmpty()){
                for (String n : todo){
                    System.out.println(szam+". :"+n);
                    szam++;
                }
            szam = 1;
            }
            else
                System.out.println("ÜRES!!!!");
        }
        else if (v == 3){
            clr();
        }
        else if (v == 4){
            System.exit(0);
        }
        }
    }

    private static int val() {
        System.out.println("Menü:\n1. Új feladat.\n2. Feladatok megjelenítése\n3. Feladatok eltávolítása\n4. Kilépés");
        return be.nextInt();
    }

    private static void ujf() {
        System.out.println("Kérem az új feladatot: ");
        String fel = be.next();
        todo.add(fel);
    }

    private static void clr() {
        System.out.println("Hanyadik feladatot toroljem?");
        int t = be.nextInt();
        todo.remove(t-1);
    }
    
}
