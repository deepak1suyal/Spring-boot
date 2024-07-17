package com.web.webapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
@Service
public class EmpServiceImp implements EmpService{
      
 @Autowired
private EmployReposetry employReposetry;

 
    
   @Override
    public String createEmployee(employee em) {
        
        EmployEntity employEntity=new EmployEntity();
   // BeanUtils.copyProperties(em,employEntity);
      employEntity.setId(em.getId());
      employEntity.setName(em.getName());
      employEntity.setEmail(em.getEmail());
      employEntity.setPhone(em.getPhone());
      employReposetry.save(employEntity);
      // emp.add(em);
       return "Saved Successfully";
       
    }

    @Override
    public List<employee> readEmployee() {
        // TODO Auto-generated method stub
       List<EmployEntity> em= employReposetry.findAll();
       List<employee> emp=new ArrayList<employee>();
        for(EmployEntity employEntity:em){
         employee ee=new employee();
         ee.setName(employEntity.getName());
         ee.setEmail(employEntity.getEmail());
         ee.setPhone(employEntity.getPhone());
         ee.setId(employEntity.getId());
         emp.add(ee);
        }



      return emp; 
    }
    @Override
    public employee readEmploy(long id) {
      // TODO Auto-generated method stub
      EmployEntity em=employReposetry.findById(id).get();
      employee emp=new employee();
      BeanUtils.copyProperties(em,emp);
      return emp;
    }
    
    @Override
    public boolean deleteEmployee(long id) {
        employReposetry.deleteById(id);
     //  emp.remove(id-1);
       return true;
      
       
    }

    @Override
    public String updateEmployee(long id, employee emp) {
      // TODO Auto-generated method stub
      try{EmployEntity e=employReposetry.findById(id).get();
     e.setId(id);
      e.setName(emp.getName());
      e.setEmail(emp.getEmail());
      e.setPhone(emp.getPhone());
    // BeanUtils.copyProperties(emp,e);
      employReposetry.save(e);
    return "Update Sucessfully";}
    catch(Exception e){
      return "Not Found";
    }
    }

    


    
}
