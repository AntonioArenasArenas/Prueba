package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
