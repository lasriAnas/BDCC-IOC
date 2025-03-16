package net.lasri.metier;

import net.lasri.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;


    public MetierImpl(IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 12 * Math.PI/2 * Math.cos(t);
    }
}
