package repository;

import dataAccess.DataDao;
import java.util.List;
import model.Data;

/**
 *
 * @author Admin
 */
public class DataRepository implements IDataRepository {

    @Override
    public void importCSV(List<Data> datas) {
        System.out.println("---------- Import CSV ---------");
        DataDao.Instance().importCSV(datas);
    }

    @Override
    public void formatAddress(List<Data> datas) {
        if (datas.isEmpty()) {
            System.err.println("Please import CSV");
        } else {
            System.out.println("---------- Format Address ---------");
            DataDao.Instance().formatAddress(datas);
        }
    }

    @Override
    public void formatName(List<Data> datas) {
        if (datas.isEmpty()) {
            System.err.println("Please import CSV");
        } else {
            System.out.println("---------- Format Name ---------");
            DataDao.Instance().formatName(datas);
        }
    }

    @Override
    public void exportCSV(List<Data> datas) {
        if (datas.isEmpty()) {
            System.err.println("Please import CSV");
        } else {
            System.out.println("---------- Export CSV ---------");
            DataDao.Instance().exportCSV(datas);
        }
    }
}