package spring.ft.edu.vn.core.repository;

import org.springframework.data.repository.CrudRepository;

import spring.ft.edu.vn.core.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
