package org.example.express_backend.dto;

import lombok.Data;

import java.io.Serializable;

@Data

public class EmployeeLoginDTO implements Serializable {

    private String email;

    private String password;

}
