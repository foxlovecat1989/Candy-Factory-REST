package tacos.api.repo;

import org.springframework.data.repository.CrudRepository;
import tacos.api.entities.Ingredient;

public interface IngredientRepositry extends CrudRepository<Ingredient, String>{

}
