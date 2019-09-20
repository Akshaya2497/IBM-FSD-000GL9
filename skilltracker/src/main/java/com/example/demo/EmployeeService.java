package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.dto.SkillDto;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Skill;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.repository.SkillRepository;



@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Autowired
	private SkillRepository skillRepo;
	//private BCryptPasswordEncoder bCryptPasswordEncoder;

	
	
	public EmployeeService(EmployeeRepo repo) {
		super();
		this.repo = repo;
		//this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	

	public EmployeeDto createEmployee(EmployeeDto dto) {
		ModelMapper mapper = new ModelMapper();
		
		
		Employee employee = mapper.map(dto, Employee.class);
				
		repo.save(employee);
		EmployeeDto userdto = mapper.map(employee, EmployeeDto.class);
		return userdto;
	}
	public SkillDto createSkill(Skill skill) {
		ModelMapper mapper = new ModelMapper();
		
		
		Skill skills = mapper.map(skill, Skill.class);
				
		skillRepo.save(skills);
		SkillDto skilldto = mapper.map(skills, SkillDto.class);
		return skilldto;
	}

	
	public List<EmployeeDto> listAllEmployee() {
		ModelMapper mapper = new ModelMapper();
		
		List<Employee> employee=(List<Employee>) repo.findAll();
		List<EmployeeDto> emps=new ArrayList<EmployeeDto>();
		for(EmployeeDto e:emps) {
			EmployeeDto dto=mapper.map(e,EmployeeDto.class);
                 emps.add(dto);
		}
		return emps;

	}
	
	
	public EmployeeDto searchById(long id) {
		ModelMapper mapper = new ModelMapper();
		
		Optional<Employee> employee=repo.findById(id);
		Employee emp=employee.get();
				EmployeeDto dto=mapper.map(emp,EmployeeDto.class);
				return dto;	
	}
	
	
	
	
	
	public List<EmployeeDto> searchByFirstName(String fname) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
	
		List<Employee> employee=repo.findByAssociateFirstName(fname);
		List<EmployeeDto> emps=new ArrayList<EmployeeDto>();
		for(Employee e:employee) {
			EmployeeDto assodto=mapper.map(e,EmployeeDto.class);
                 emps.add(assodto);
		}
		return emps;	
		}


	public List<EmployeeDto> findByLastName(String lname) {
		ModelMapper mapper = new ModelMapper();
		
		List<Employee> employee=repo.findByAssociateLastName(lname);
		List<EmployeeDto> emps=new ArrayList<EmployeeDto>();
		for(Employee e:employee) {
			EmployeeDto assodto=mapper.map(e,EmployeeDto.class);
                 emps.add(assodto);
		}
		return emps;	
		
	}

	

	
	public ArrayList<EmployeeDto> findByEmail(String email) {
		ModelMapper mapper = new ModelMapper();
		
		List<Employee> employee=repo.findByEmailId(email);
		ArrayList<EmployeeDto> emps=new ArrayList<EmployeeDto>();
		for(Employee e:employee) {
			EmployeeDto assodto=mapper.map(e,EmployeeDto.class);
                 emps.add(assodto);
		}
		return emps;
	}

	
	public EmployeeDto findBymobileNumber(long number) {
		// TODO Auto-generated method stub
		ModelMapper mapper = new ModelMapper();
		
		List<Employee> employee=(List<Employee>) repo.findByMobileNumber(number);
		List<EmployeeDto> emps=new ArrayList<EmployeeDto>();
		for(Employee e:employee) {
			EmployeeDto assodto=mapper.map(e,EmployeeDto.class);
                 emps.add(assodto);
		}
		return (EmployeeDto) emps;
	}

	
	
	
	public List<EmployeeDto> deleteById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee=repo.findById(id);
		Employee temp=employee.get();
		repo.delete(temp);
		return  listAllEmployee();
	}


	
	

//	public List<EmployeeDto> updateById(EmployeeDto tempDto,long id) {
//		// TODO Auto-generated method stub
//		ModelMapper mapper = new ModelMapper();
//		
//		Optional<Employee> assodetail=repo.findById(id);
//		Employee temp=assodetail.get();
//            temp.setAssociateFirstName(tempDto.getAssociateFirstName());
//            temp.setAssociateLastName(tempDto.getAssociateLastName());
//            temp.setEmail(tempDto.getEmail());
//            temp.setAssociateMobilenumber(tempDto.getAssociateMobilenumber());
//    		associateRepository.save(temp);
//
//		return viewAll();
//	}
//	public EmployeeDto updateUser(EmployeeDto userDetail, String userId) {
//		ModelMapper mapper = new ModelMapper();
//		Employee employee = repo.findById(userId);
//		
//		employee.setFirstName(userDetail.getFirstName());
//		employee.setLastName(userDetail.getLastName());
//		employee.setEmail(employeeDetail.getEmail());
//		userRepository.save(employee);
//		UserDto userdto = mapper.map(user, UserDto.class);
//		return userdto;
//	}
	}