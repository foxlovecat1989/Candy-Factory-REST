package tacos.api.repo;

import org.springframework.data.repository.CrudRepository;

import tacos.api.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
