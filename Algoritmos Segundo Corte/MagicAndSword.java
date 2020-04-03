/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author juan3
 */
public class MagicAndSword {

    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        int it = lc.nextInt();
        for (int i = 0; i < it; i++) {
            int w = lc.nextInt();
            int h = lc.nextInt();
            int x0 = lc.nextInt();
            int y0 = lc.nextInt();
            String spell = lc.next();
            int lvl = lc.nextInt();
            int cx = lc.nextInt();
            int cy = lc.nextInt();
            if (spell.equalsIgnoreCase("Fire") && lvl <= 3) {
                fire(w, h, x0, y0, cx, cy, lvl, spell);
            } else if (spell.equalsIgnoreCase("Water") && lvl <= 3) {
                water(w, h, x0, y0, cx, cy, lvl, spell);
            } else if (spell.equalsIgnoreCase("Earth") && lvl <= 3) {
                earth(w, h, x0, y0, cx, cy, lvl, spell);
            } else if (spell.equalsIgnoreCase("Air") && lvl <= 3) {
                air(w, h, x0, y0, cx, cy, lvl, spell);
            }
        }
    }

    public static void fire(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        Integer damageF = 200;
        if (spell.toUpperCase().equalsIgnoreCase("FIRE")) {
            switch (level) {
                case 1:
                    if (cx >= x0 & cy >= y0) {
                        System.out.println(damageF = 0);
                    } else {
                        System.out.println(damageF = damageF + 20);
                    }
                    break;
                case 2:
                    if (cx >= x0 & cy >= y0) {
                        System.out.println(damageF = damageF + 0);
                    } else {
                        System.out.println(damageF = damageF + 30);
                    }
                    break;
                case 3:
                    if (cx >= x0 & cy >= y0) {
                        System.out.println(damageF = damageF + 0);
                    } else {
                        System.out.println(damageF = damageF + 50);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void water(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        Integer damageW = 300;
        if (spell.toUpperCase().equalsIgnoreCase("WATER")) {
            switch (level) {
                case 1:
                    if (cx > x0 & cy > y0) {
                        System.out.println(damageW = 0);
                    } else {
                        System.out.println(damageW = damageW + 10);
                    }
                    break;
                case 2:
                    if (cx > x0 & cy > y0) {
                        System.out.println(damageW = damageW + 0);
                    } else {
                        System.out.println(damageW = damageW + 25);
                    }
                    break;
                case 3:
                    if (cx >= x0 & cy >= y0) {
                        System.out.println(damageW = damageW + 0);
                    } else {
                        System.out.println(damageW = damageW + 40);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void earth(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        Integer damageE = 400;
        if (spell.toUpperCase().equalsIgnoreCase("EARTH")) {
            switch (level) {
                case 1:
                    if (cx > x0 & cy > y0) {
                        System.out.println(damageE = 0);
                    } else {
                        System.out.println(damageE = damageE + 25);
                    }
                    break;
                case 2:
                    if (cx > x0 & cy > y0) {
                        System.out.println(damageE = damageE + 0);
                    } else {
                        System.out.println(damageE = damageE + 55);
                    }
                    break;
                case 3:
                    if (cx > x0 & cy > y0) {
                        System.out.println(damageE = damageE + 0);
                    } else {
                        System.out.println(damageE = damageE + 70);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void air(int w, int h, int x0, int y0, int cx, int cy, int level, String spell) {
        Integer damageA = 100;
        if (spell.toUpperCase().equalsIgnoreCase("AIR")) {
            switch (level) {
                case 1:
                    if (cx >= x0 & cy >= y0) {
                        System.out.println(damageA = 0);
                    } else {
                        System.out.println(damageA = damageA + 18);
                    }
                    break;
                case 2:
                    if (cx > x0 & cy > y0) {
                        System.out.println(damageA = damageA + 0);
                    } else {
                        System.out.println(damageA = damageA + 38);
                    }
                    break;
                case 3:
                    if (cx >= x0 & cy >= y0) {
                        System.out.println(damageA = damageA + 0);
                    } else {
                        System.out.println(damageA = damageA + 60);
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
