package dao;

import domain.security.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorityRepository extends JpaRepository<SystemUser, Long> {
    @Query("select u from SystemUser u where u.userName = userName")
    SystemUser findSystemUserByUserName(String userName);
}
