//package com.Hustle.Management.ControllerTest;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import com.Hustle.Management.HustleController.HustleController;
//import com.Hustle.Management.HustleEntity.HustleEntity;
//import com.Hustle.Management.HustleService.HustleService;
//
//@SpringBootTest
//public class HustleControllerTest {
//
//    @Autowired
//    private HustleController hustleController;
//
//    @Mock
//    HustleService hustleService;
//
//    @Test
//    public void addHustleTest(){
//        HustleEntity hustleEntity=new HustleEntity(1,"Deepak","kumar","deepak@gmail.com","dee@123","Gorakhpur","Male");
//        when(hustleService.addHustle(hustleEntity)).thenReturn(any());
//        hustleController.addHustle(hustleEntity);
//    }
//
//    @Test
//    public void getByIdTest(){
//        HustleEntity hustleEntity=new HustleEntity();
////        HustleEntity.setId(2);
//        when(hustleService.getById(hustleEntity.getId())).thenReturn(any());
//        hustleController.getById(hustleEntity.getId());
//
//    }
//
//    @Test()
//    public void findAllTest(){
//        List<HustleEntity> hustleEntityList = new ArrayList<HustleEntity>();
//        when(hustleService.findAll()).thenReturn(hustleEntityList);
//        hustleController.findAll();
//
//    }
//
//    @Test
//    public void deleteByIdTest() {
//        HustleEntity hustleEntity=new HustleEntity();
////        HustleEntity.setId(5);
//        when(hustleService.deleteById(hustleEntity.getId())).thenReturn(any());
//        hustleController.deleteById(hustleEntity.getId());
//
//    }
//
//    @Test
//    public void updateByIdTest(){
//        HustleEntity hustleEntity=new HustleEntity(1,"Deepak","Yadav","deepak@gmail.com","dee@123","Gorakhpur","Male");
//        when(hustleService.updateById(hustleEntity)).thenReturn(any());
//        hustleController.updateById(hustleEntity);
//
//    }
//}
