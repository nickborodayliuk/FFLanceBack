package users;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrderfRepository extends CrudRepository<Orderf, Integer> {

    Optional<Orderf> findById(Integer id);

}
