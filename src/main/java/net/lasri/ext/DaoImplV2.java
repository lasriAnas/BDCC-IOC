package net.lasri.ext;
import net.lasri.dao.IDao;

public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("version web service");
        return 41;
    }
}
