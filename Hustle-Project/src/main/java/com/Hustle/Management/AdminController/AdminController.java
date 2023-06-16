package com.Hustle.Management.AdminController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Hustle.Management.AdminEntity.AdminEntity;
import com.Hustle.Management.AdminService.AdminService;
import com.Hustle.Management.HustleEntity.HustleEntity;

@RequestMapping ("/admin")
@CrossOrigin (origins = "*")
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping ("/addAdmin")
    public String addAdmin(@RequestBody AdminEntity adminEntity){
        return adminService.addAdmin(adminEntity);
    }

    @GetMapping ("/findAll")
    public List<AdminEntity> findAllAdmin(){
        return adminService.findAllAdmin();
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password ){
        String entity = adminService.loginAdmin(email,password);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

}
