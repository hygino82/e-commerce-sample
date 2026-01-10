package br.dev.hygino.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.hygino.ecom.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
