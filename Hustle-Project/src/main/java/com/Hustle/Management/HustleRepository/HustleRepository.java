package com.Hustle.Management.HustleRepository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Hustle.Management.AdminEntity.AdminEntity;
import com.Hustle.Management.HustleEntity.HustleEntity;

@Repository
    public interface HustleRepository extends JpaRepository<HustleEntity,Integer> {

    @Query (value = "select * from userhustlegym where email =  ?1 and password = ?2 ", nativeQuery = true)
    Optional<HustleEntity> findByEmailAndPassword(String username, String password);



}
