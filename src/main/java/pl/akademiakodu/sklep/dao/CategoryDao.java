package pl.akademiakodu.sklep.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.sklep.model.Category;

public interface CategoryDao extends CrudRepository<Category,Integer> {
}
