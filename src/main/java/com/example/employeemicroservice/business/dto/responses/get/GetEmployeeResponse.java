package com.example.employeemicroservice.business.dto.responses.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeResponse {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
}
