package pl.akademiakodu.sklep.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @OneToMany(mappedBy="category")
    List<Product> products;
    public List<Product> getProducts(){
        return products;
    }
    public void setProducts(List<Product> products){
        this.products = products;
    }

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Integer id;
    private String name;
    public Integer getId(){
            return id;
    }
public void setId(Integer id) {
    this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return getId()+"."+ getName()+" ";
    }
}


