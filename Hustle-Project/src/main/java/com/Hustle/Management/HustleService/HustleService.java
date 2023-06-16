package com.Hustle.Management.HustleService;

import java.util.List;
import java.util.Optional;
import com.Hustle.Management.HustleEntity.HustleEntity;
public interface HustleService {

    public String addHustle(HustleEntity hustleEntity);



   public List<HustleEntity> findAll();
    public String deleteById(int id);
    public HustleEntity getById(int id);

    public String updateById(HustleEntity hustleEntity);

    String loginUser(String email, String password);


}
