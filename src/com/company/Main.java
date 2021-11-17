package com.company;

import com.knyga.Knyga;
import com.knyga.KnygaImpl;
import com.leidinys.LeidinysImpl;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LeidinysImpl leidinys1 = new LeidinysImpl("knygos", false, 118);
        LeidinysImpl leidinys2 = new LeidinysImpl("laikraščiai", true, 25);
        LeidinysImpl leidinys3 = new LeidinysImpl("žurnalai", true, 44);
        LeidinysImpl leidinys4 = new LeidinysImpl("laikraščiai", true, 12);
        LeidinysImpl leidinys5 = new LeidinysImpl("žurnalai", true, 20);

        KnygaImpl knyga1 = new KnygaImpl("knygos", false, 118, "Fizika", false, "mokomoji");
        KnygaImpl knyga2 = new KnygaImpl("laikrasciai", true, 25, "Rambo", true, "grožinė");
        KnygaImpl knyga3 = new KnygaImpl("knygos", false, 44, "Remas", true, "fantastika");
        KnygaImpl knyga4 = new KnygaImpl("knygos", false, 105, "Dviratis", true, "grožinė");
        KnygaImpl knyga5 = new KnygaImpl("knygos", false, 44, "Taika", true, "mokomoji");

        LeidinysImpl[] sarasaLeidiniuIrKnygu = {leidinys1, leidinys2, leidinys3, leidinys4, leidinys5, knyga1, knyga2, knyga3, knyga4, knyga5};

        for (LeidinysImpl leidinys : sarasaLeidiniuIrKnygu) {
            if (leidinys instanceof KnygaImpl) {
                KnygaImpl knyga = (KnygaImpl) leidinys;
                if (knyga.getTipas() == "grožinė") {
                    System.out.println(knyga);
                }
            }
        }
    }
}



