package net.lasri.pres;

import net.lasri.dao.DaoImpl;
import net.lasri.dao.IDao;
import net.lasri.metier.IMetier;
import net.lasri.metier.MetierImpl;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassnName = scanner.nextLine();
        Class cDao = Class.forName(daoClassnName);
        IDao dao = (IDao) cDao.newInstance();


        String metierClassnName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassnName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("res:" + metier.calcul());
    }
}
