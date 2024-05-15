package com.example.employeemicroservice.api.controllers;

import com.example.employeemicroservice.business.abstracts.EmployeeService;
import com.example.employeemicroservice.business.dto.requests.create.CreateEmployeeRequest;
import com.example.employeemicroservice.business.dto.requests.update.UpdateEmployeeRequest;
import com.example.employeemicroservice.business.dto.responses.create.CreateEmployeeResponse;
import com.example.employeemicroservice.business.dto.responses.get.GetAllEmployeesResponse;
import com.example.employeemicroservice.business.dto.responses.get.GetEmployeeResponse;
import com.example.employeemicroservice.business.dto.responses.update.UpdateEmployeeResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public List<GetAllEmployeesResponse> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public GetEmployeeResponse getById(@PathVariable int id){
        return employeeService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateEmployeeResponse add(@Valid @RequestBody CreateEmployeeRequest createEmployeeRequest){
        return employeeService.add(createEmployeeRequest);
    }

    @PutMapping("/{id}")
    public UpdateEmployeeResponse update(@PathVariable int id, @Valid @RequestBody UpdateEmployeeRequest updateEmployeeRequest){
        return employeeService.update(id, updateEmployeeRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        employeeService.delete(id);
    }
}
