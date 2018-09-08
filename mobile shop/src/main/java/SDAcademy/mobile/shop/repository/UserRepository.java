package SDAcademy.mobile.shop.repository;

import SDAcademy.mobile.shop.entity.Phone;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Phone, Integer> {


}