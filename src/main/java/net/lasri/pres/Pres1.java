package net.lasri.pres;

import net.lasri.dao.DaoImpl;
import net.lasri.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("res:" + metier.calcul());
    }
}
