package io.javabrains.springsecurityjwt.Repository;

import io.javabrains.springsecurityjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer >
{
     Optional< User > findByUserName( String Username ) ;
}
