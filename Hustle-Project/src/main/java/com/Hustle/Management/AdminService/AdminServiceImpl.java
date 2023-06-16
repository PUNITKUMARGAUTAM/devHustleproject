package com.Hustle.Management.AdminService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Hustle.Management.AdminEntity.AdminEntity;
import com.Hustle.Management.AdminRepository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
   private  AdminRepository adminRepository;


    @Override
    public String addAdmin(AdminEntity adminEntity) {
        adminRepository.save(adminEntity);
        return " Admin Data saved succesfully";
    }

    @Override
    public List<AdminEntity> findAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public String loginAdmin(String username, String password) {
        Optional<AdminEntity> adminEntity = null;
        try {
            adminEntity = adminRepository.findByEmailAndPassword(username, password);
        }catch (Exception e){
            throw new RuntimeException("No Admin Found");
        }if (adminEntity.isEmpty()){
            return "No Admin Found";
        }
        return "Admin Exists";
    }
}
