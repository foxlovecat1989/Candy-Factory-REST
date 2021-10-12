package tacos.api.repo;

import org.springframework.data.repository.CrudRepository;
import tacos.api.entities.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long>{

}
