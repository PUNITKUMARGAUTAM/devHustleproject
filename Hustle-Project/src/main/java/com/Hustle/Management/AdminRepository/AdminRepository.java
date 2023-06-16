package com.Hustle.Management.AdminRepository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Hustle.Management.AdminEntity.AdminEntity;
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,String> {
    @Query(value = "select * from adminhustle where email =  ?1 and password = ?2 ", nativeQuery = true)
    Optional<AdminEntity> findByEmailAndPassword(String username, String password);
}
