import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from './employee.model';
import { EmployeeService } from './employee.service';
@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: []
})
export class AddEmployeeComponent implements OnInit {
emp: Employee = new Employee();
  constructor(private router: Router, private employeeService: EmployeeService) { }

  ngOnInit() {
  }
  createEmployee(): void {
      console.log(this.emp.associateFirstName);
    this.employeeService.createEmployee(this.emp).subscribe(data => {
      alert("Employee Created successfully");
    });

  };

}