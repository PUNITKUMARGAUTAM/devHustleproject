//package com.Hustle.Management.ServiceTest;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import com.Hustle.Management.HustleEntity.HustleEntity;
//import com.Hustle.Management.HustleRepository.HustleRepository;
//import com.Hustle.Management.HustleService.HustleService;
//
//@SpringBootTest
//public class HustleServiceTest {
//
//    @Mock
//    private HustleRepository hustleRepository;
//    @Autowired
//    private HustleService hustleService;
//
//    @Test
//    public void addHustleTest(){
//        HustleEntity hustleEntity=new HustleEntity(1,"Avanish","Singh","avanish@gmail.com","avs@123","Danganj","Male");
//        when(hustleRepository.save(hustleEntity)).thenReturn(any());
//        hustleService.addHustle(hustleEntity);
//
//    }
//
//    @Test
//    public void updateByIdTest(){
//        HustleEntity hustleEntity=new HustleEntity(1,"Avanish","Rajput","rj@gmail.com","rjas@123","Varansi","Male");
//        when(hustleRepository.save(hustleEntity)).thenReturn(any());
//        hustleService.updateById(hustleEntity);
//
//    }
//    @Test
//    public void getByIdTest(){
//        HustleEntity hustleEntity=new HustleEntity();
//        hustleEntity.setId(1);
//        when(hustleRepository.findById(hustleEntity.getId())).thenReturn(any());
//        hustleService.getById(hustleEntity.getId());
//    }
//
//    @Test()
//    public void findAllTest(){
//        List<HustleEntity> hustleEntityList = new ArrayList<HustleEntity>();
//        when(hustleRepository.findAll()).thenReturn(hustleEntityList);
//        hustleService.findAll();
//
//    }
//
//    @Test
//    public void deleteByIdTest() {
//        HustleEntity hustleEntity=new HustleEntity();
//        hustleEntity.setId(3);
//        hustleRepository.deleteById(hustleEntity.getId());
//        hustleService.deleteById(hustleEntity.getId());
//
//    }
//}
