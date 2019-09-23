import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Employee } from './employee.model';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  
  employees: Employee[];
  

  constructor(private router: Router, private employeeService: EmployeeService) {

  }

  ngOnInit() {
    this.employeeService.getEmployees()
      .subscribe( data => {
        this.employees = data;
      });
  };

  deleteEmployee(employee: Employee): void {
    this.employeeService.deleteEmployee(employee)
      .subscribe( data => {
        this.employees = this.employees.filter(u => u !== employee);
      })
  };

}
