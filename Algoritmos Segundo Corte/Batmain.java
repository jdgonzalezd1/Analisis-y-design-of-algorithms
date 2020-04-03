/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juan3
 */
public class Batmain {

    static String villanosu[] = {"Bane", "Black Mask", "Catwoman", "Clayface", "Deadshot",
        "Harley Quinn", "Hugo Strange", "Hush", "Joker", "Killer Croc", "Killer Moth",
        "Mad Hatter", "Man-Bat", "Mr. Freeze", "Penguin", "Poison Ivy", "Ra's al Ghul",
        "Riddler", "Scarecrow", "Solomon Grundy", "Two-face", "Ventriloquist",
        "Anarky", "Barbatos", "Brother EYE", "Calculator", "Calendar Man",
        "Catman", "Clock King II", "Cluemaster", "Copperhead", "Count Vertigo",
        "Doctor Hurt", "Electrocutioner", "Firefly", "Great White Shark",
        "Joker's Daughter", "KGBeast", "Kite Man", "Maxie Zeus", "Onomatopoeia",
        "Owlman", "Prometheus", "Rag Doll", "Ratcatcher", "Reverse-flash", "Riddler's Daughter",
        "The Batman who Laughs", "Tweedledum and Tweedledee", "Vandal Savage",
        "Victor Zsasz"};

    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        String a;
        int x = lc.nextInt(), aux = 0;
        while (x > 0) {
            a = lc.next();
            Pattern pat = Pattern.compile("[a-zA-Z]");
            Pattern pat2 = Pattern.compile("[^a-z^A-Z]");
            Matcher mat = pat.matcher(a);
            Matcher mat2 = pat2.matcher(a);
            if (mat2.find()) {
            } else if (mat.find()) {
                //entre a-z y A-Z
                System.out.println(viyianos(a));
                x--;
            }
        }
    }

    public static String viyianos(String viyianosu) {
        for (int i = 0; i < villanosu.length; i++) {
            if (villanosu[i].equals(viyianosu)) {
                return "Y";
            }
        }
        return "N";
    }

}
