package com.example.employeemicroservice.business.dto.responses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeResponse {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
}
