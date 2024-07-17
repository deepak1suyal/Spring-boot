package com.web.webapp;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class EmpController {
 //   List<employee> emp=new ArrayList<employee>();
 @Autowired
EmpService empService;
    @GetMapping("employees")
    public List<employee> getMethodName() {
        
        
        return empService.readEmployee();
    }

    @GetMapping("employees/{id}")
    public employee getMethodName(@PathVariable long id) {
        return empService.readEmploy(id);
    }
    
    @PostMapping("employees")
    public String postMethodName(@RequestBody employee em) {
       
        return empService.createEmployee(em);
    }
    @DeleteMapping("employees/{id}")
    public String deleEmployee(@PathVariable long id){
       if(empService.deleteEmployee(id))
       return "Delete Sucess Fully";
       else 
       return "Not Found";
    }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable long id, @RequestBody employee emp) {
        //TODO: process PUT request
        
        return empService.updateEmployee(id, emp);
    }

}
