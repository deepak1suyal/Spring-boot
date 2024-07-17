package com.web.webapp;

import java.util.List;

public interface EmpService {
  
String createEmployee(employee em);
    List<employee> readEmployee();
   boolean deleteEmployee(long id);
   String updateEmployee(long id,employee emp);
   employee readEmploy(long id);
} 













