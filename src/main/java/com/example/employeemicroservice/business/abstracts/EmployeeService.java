package com.example.employeemicroservice.business.abstracts;

import com.example.employeemicroservice.business.dto.requests.create.CreateEmployeeRequest;
import com.example.employeemicroservice.business.dto.requests.update.UpdateEmployeeRequest;
import com.example.employeemicroservice.business.dto.responses.create.CreateEmployeeResponse;
import com.example.employeemicroservice.business.dto.responses.get.GetAllEmployeesResponse;
import com.example.employeemicroservice.business.dto.responses.get.GetEmployeeResponse;
import com.example.employeemicroservice.business.dto.responses.update.UpdateEmployeeResponse;

import java.util.List;

public interface EmployeeService {
    List<GetAllEmployeesResponse> getAll();
    GetEmployeeResponse getById(int id);
    CreateEmployeeResponse add(CreateEmployeeRequest request);
    UpdateEmployeeResponse update(int id, UpdateEmployeeRequest request);
    void delete(int id);
}
