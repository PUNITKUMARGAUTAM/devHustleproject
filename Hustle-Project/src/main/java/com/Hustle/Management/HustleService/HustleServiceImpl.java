package com.Hustle.Management.HustleService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Hustle.Management.AdminEntity.AdminEntity;
import com.Hustle.Management.HustleEntity.HustleEntity;
import com.Hustle.Management.HustleRepository.HustleRepository;
@Service
public class HustleServiceImpl implements HustleService//, UserDetailsService {
{
    @Autowired
    HustleRepository hustleRepository;
    @Override
    public String addHustle(HustleEntity hustleEntity) {
        hustleRepository.save(hustleEntity);
        return "Data saved succesfully";
       // return "{\n" + "  \"result\": \"Data saved succesfully\"\n" + "}";
    }

    @Override
    public List<HustleEntity> findAll() {
        return hustleRepository.findAll();
    }

    @Override
    public String deleteById(int id) {
        hustleRepository.deleteById(id);
        return "Delete successfully";
    }

    @Override
    public HustleEntity getById(int id) {
        return hustleRepository.findById(id).get();
    }


    @Override
    public String updateById(HustleEntity hustleEntity) {
        hustleRepository.save(hustleEntity);
        return "Data updated Successfully";
    }

    @Override
    public String loginUser(String email, String password) {
        Optional<HustleEntity> hustleEntity = null;
        try {
            hustleEntity = hustleRepository.findByEmailAndPassword(email, password);
        }catch (Exception e){
            throw new RuntimeException("No user Found");
        }if (hustleEntity.isEmpty()){
            return "No user Found";
        }
        return "User Exists";
    }

}
