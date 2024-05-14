package com.example.employeemicroservice.business.concretes;

import com.example.employeemicroservice.business.abstracts.EmployeeService;
import com.example.employeemicroservice.business.dto.requests.create.CreateEmployeeRequest;
import com.example.employeemicroservice.business.dto.requests.update.UpdateEmployeeRequest;
import com.example.employeemicroservice.business.dto.responses.create.CreateEmployeeResponse;
import com.example.employeemicroservice.business.dto.responses.get.GetAllEmployeesResponse;
import com.example.employeemicroservice.business.dto.responses.get.GetEmployeeResponse;
import com.example.employeemicroservice.business.dto.responses.update.UpdateEmployeeResponse;
import com.example.employeemicroservice.entities.Employee;
import com.example.employeemicroservice.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService {
    private final EmployeeRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<GetAllEmployeesResponse> getAll() {
        List<Employee> employees = repository.findAll();
        List<GetAllEmployeesResponse> responses = employees
                .stream()
                .map(employee -> mapper.map(employee, GetAllEmployeesResponse.class))
                .toList();

        return responses;
    }

    @Override
    public GetEmployeeResponse getById(int id) {
        Employee employee = repository.findById(id).orElseThrow();
        GetEmployeeResponse response = mapper.map(employee, GetEmployeeResponse.class);

        return response;
    }

    @Override
    public CreateEmployeeResponse add(CreateEmployeeRequest request) {
        Employee employee = mapper.map(request, Employee.class);
        employee.setId(0);
        Employee createdEmployee = repository.save(employee);
        CreateEmployeeResponse response = mapper.map(createdEmployee, CreateEmployeeResponse.class);

        return response;
    }

    @Override
    public UpdateEmployeeResponse update(int id, UpdateEmployeeRequest request) {
        Employee employee = mapper.map(request, Employee.class);
        employee.setId(id);
        Employee updatedEmployee = repository.save(employee);
        UpdateEmployeeResponse response = mapper.map(updatedEmployee, UpdateEmployeeResponse.class);

        return response;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
