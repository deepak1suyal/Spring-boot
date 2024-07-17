package com.web.webapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class employee {
    private Long id;
    private String Name;
    private String Phone;
    private String Email;
}
