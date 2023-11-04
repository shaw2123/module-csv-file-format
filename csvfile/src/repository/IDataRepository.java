package repository;

import java.util.List;
import model.Data;


public interface IDataRepository {

    void exportCSV(List<Data> datas);

    void formatAddress(List<Data> datas);

    void formatName(List<Data> datas);

    void importCSV(List<Data> datas);
    
}