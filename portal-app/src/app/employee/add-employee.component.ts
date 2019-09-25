import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from './employee.model';
import { EmployeeService } from './employee.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
emp: Employee = new Employee();
registerForm: FormGroup;
submitted = false;
model: any = {};
  constructor(private router: Router, private employeeService: EmployeeService,private formBuilder: FormBuilder ) { }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]]
  });
  }
  get f() { return this.registerForm.controls; }
  createEmployee(): void {
    this.submitted = true;
    if (this.registerForm.invalid) {
          return;
    }

    this.employeeService.createEmployee(this.emp).subscribe(data => {
      alert("Employee Created successfully");
    });

  };

}
