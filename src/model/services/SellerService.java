package model.services;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
    private SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll(){
        // MOCK - retornar os dados de mentira
        return dao.findAll();
    }

    public void updateOrSave(Seller seller){
        if(seller.getId() == null){
            dao.insert(seller);
        }else{
            dao.update(seller);
        }
    }

    public void remove(Seller seller){
        dao.deleteById(seller.getId());
    }
}
