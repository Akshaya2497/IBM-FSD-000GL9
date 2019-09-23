import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Employee } from './employee.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class EmployeeService {

  constructor(private http:HttpClient) {}

  private empUrl = 'http://localhost:8080/user-portal/api';
	//private empUrl = '/api';

  public getEmployees() {
    return this.http.get<Employee[]>(this.empUrl);
  }

  public deleteEmployee(emp) {
    return this.http.delete(this.empUrl + "/"+ emp.id);
  }

  public createEmployee(emp) {
      console.log(this.http.post<Employee>(this.empUrl+"/", emp));
    return this.http.post<Employee>(this.empUrl+"/", emp);
  }

}

