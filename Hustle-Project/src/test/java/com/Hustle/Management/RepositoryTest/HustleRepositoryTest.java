//package com.Hustle.Management.RepositoryTest;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//import com.Hustle.Management.HustleEntity.HustleEntity;
//import com.Hustle.Management.HustleRepository.HustleRepository;
//
//@SpringBootTest
//public class HustleRepositoryTest {
//    @Mock
//    HustleRepository hustleRepository;
//
//    @Test
//    public void getCreateHustleTest(){
//        HustleEntity hustleEntity=new HustleEntity(1,"Avanish","Singh","avanish@gmail.com","avs@123","Danganj","Male");
//        hustleRepository.findById(hustleEntity.getId());
//
//    }
//
//    @Test
//    public void findAllTest(){
//        List<HustleEntity> hustleEntityList=new ArrayList<>();
//        when(hustleRepository.findAll()).thenReturn(hustleEntityList);
//
//    }
//
//    @Test
//    public void deleteByIdTest() {
//        HustleEntity hustleEntity=new HustleEntity();
//        hustleEntity.setId(8);
//        hustleRepository.deleteById(hustleEntity.getId());
//
//
//    }
//
//    @Test
//    public void getByIdTest(){
//        HustleEntity hustleEntity=new HustleEntity();
//        hustleEntity.setId(10);
//        when(hustleRepository.findById(hustleEntity.getId())).thenReturn(any());
//
//    }
//    @Test
//    public void updateByIdTest(){
//        HustleEntity hustleEntity=new HustleEntity(1,"Avanish1","Singh1","avanish1@gmail.com","avs1@123","DanganjCity","Male");
//        when(hustleRepository.save(hustleEntity)).thenReturn(any());
//
//
//    }
//}
