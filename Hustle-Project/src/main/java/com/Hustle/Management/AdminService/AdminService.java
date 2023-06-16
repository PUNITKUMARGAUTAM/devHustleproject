package com.Hustle.Management.AdminService;

import java.util.List;
import com.Hustle.Management.AdminEntity.AdminEntity;

public interface AdminService {



    public String addAdmin(AdminEntity adminEntity);



    public List<AdminEntity> findAllAdmin();

    String loginAdmin(String email, String password);
}
