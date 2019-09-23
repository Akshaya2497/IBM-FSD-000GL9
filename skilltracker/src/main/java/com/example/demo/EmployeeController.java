package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.dto.SkillDto;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Skill;
import com.example.demo.model.RequestModel;
import com.example.demo.model.ResponseModel;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping
	public ResponseEntity<ResponseModel> createUser(@RequestBody RequestModel employee) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Employee emp=mapper.map(employee,Employee.class);
	
		EmployeeDto empdto=mapper.map(emp,EmployeeDto.class);
		EmployeeDto temp=service.createEmployee(empdto);
		
		ResponseModel model = mapper.map(temp, ResponseModel.class);
		return new ResponseEntity<ResponseModel>(model, HttpStatus.CREATED);

	}
	@GetMapping("path = {\"/{firstname}\"}")
	public List<ResponseModel> findAssociateDetailByFirstName(@PathVariable("firstname") String fname) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<EmployeeDto> temp=service.searchByFirstName(fname);
		
		List<ResponseModel> model =new ArrayList<ResponseModel>();
		for(EmployeeDto dto:temp) {
			ResponseModel model1=mapper.map(dto,ResponseModel.class);
			model.add(model1);
		}
		return model;

	}
	@GetMapping
	public Iterable<Employee> findAssociateDetail() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
         
	Iterable<Employee> dto=service.listAllEmployee();
		ResponseModel model = mapper.map(dto, ResponseModel.class);
   return dto;
	}
//	@GetMapping("/lastname/{lastname}")
//	public List<CreateUserResponseModel> findAssociateDetailByLastName(@PathVariable("lastname") String lname) {
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		List<AssociateDto> temp=associateService.findByLastName(lname);
//		
//		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
//		for(AssociateDto dto:temp) {
//			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
//			model.add(model1);
//		}
//		return model;
//
//	}
//	@GetMapping("/first/lastname/{firstname}/{lastname}")
//	public CreateUserResponseModel findAssociateDetailByLastNameAndLastName(@PathVariable("lastname") String lname,@PathVariable("firstname") String fname) {
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//
//		AssociateDto dto=associateService.findByFirstNameAndLastName(fname, lname);
//		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
//   return model;
//	}
//	@GetMapping("/email/{email}")
//	public CreateUserResponseModel findAssociateDetailByEmail(@PathVariable("email") String email) {
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//
//		AssociateDto dto=associateService.findByEmail(email);
//		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
//   return model;
//	}
//	@GetMapping("/mobilenumber/{number}")
//	public CreateUserResponseModel findAssociateDetailByNumber(@PathVariable("number") String number1) {
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//         long number=(long) Integer.parseInt(number1);
//         System.out.println(number);
//		AssociateDto dto=associateService.findBymobileNumber(number);
//		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
//   return model;
//	}
//	@GetMapping("/id/{id}")
//	public CreateUserResponseModel findAssociateDetailById(@PathVariable("id") String id1) {
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//         Long id=(long) Integer.parseInt(id1);
//		AssociateDto dto=associateService.findById(id);
//		CreateUserResponseModel model = mapper.map(dto, CreateUserResponseModel.class);
//   return model;
//	}
//	@PutMapping("/update/{id}")
//	public List<CreateUserResponseModel> updateUser(@RequestBody CreateUserRequestModel associateDetail,@PathVariable("id") String id1) {
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//		AssociateDetail assodetail=mapper.map(associateDetail,AssociateDetail.class);
//		AssociateDto assodto=mapper.map(assodetail,AssociateDto.class);
//        Long id=(long) Integer.parseInt(id1);
//		List<AssociateDto> temp=associateService.updateById(assodto,id);
//		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
//		for(AssociateDto dto:temp) {
//			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
//			model.add(model1);
//		}
//		return model;
//	}
//	@DeleteMapping("/delete/{id}")
//	public List<CreateUserResponseModel> deleteById(@PathVariable("id") String id1) {
//		ModelMapper mapper = new ModelMapper();
//		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
//        Long id=(long) Integer.parseInt(id1);
//		List<AssociateDto> temp=associateService.deleteById(id);
//		List<CreateUserResponseModel> model =new ArrayList<CreateUserResponseModel>();
//		for(AssociateDto dto:temp) {
//			CreateUserResponseModel model1=mapper.map(dto,CreateUserResponseModel.class);
//			model.add(model1);
//		}
//		return model;
	//}
	

}
