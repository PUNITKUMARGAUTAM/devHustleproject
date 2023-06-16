package com.Hustle.Management.HustleController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Hustle.Management.HustleEntity.HustleEntity;
import com.Hustle.Management.HustleService.HustleService;

@RequestMapping("/hustle")
@CrossOrigin (origins = "*",allowedHeaders = "*")
@RestController
public class HustleController {
    @Autowired
    private HustleService hustleService;

    @PostMapping ("/addHustle")
    public String addHustle(@RequestBody HustleEntity hustleEntity) {
        return hustleService.addHustle(hustleEntity);
    }

    @GetMapping ("/findAll")
    public List<HustleEntity> findAll() {
        return hustleService.findAll();
    }

    @DeleteMapping ("/deleteById")
    public String deleteById(@RequestParam int id) {
        return hustleService.deleteById(id);
    }

    @GetMapping ("/getById/{id}")
    public HustleEntity getById(@PathVariable ("id") int id) {
        return hustleService.getById(id);
    }

    @PostMapping ("/updateById")
    public String updateById(@RequestBody HustleEntity hustleEntity) {
        return hustleService.updateById(hustleEntity);
    }

    @PostMapping ("/loginUser") public ResponseEntity<String> loginUser(@RequestParam (name = "email") String email, @RequestParam (name = "password") String password ){
        String entity = hustleService.loginUser(email, password);
            return new ResponseEntity<>(entity, HttpStatus.OK);
        }

    }

