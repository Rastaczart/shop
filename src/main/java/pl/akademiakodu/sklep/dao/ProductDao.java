package pl.akademiakodu.sklep.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.sklep.model.Product;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
