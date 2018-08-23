package com.cts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CategoryController {
	
	@Autowired
	CategoryRepository accountRepository;
	
	@RequestMapping(method=RequestMethod.POST, path="/category")
	@ResponseBody
	public ResponseEntity<Void> addCategory(@RequestBody Category category){
		System.out.println(category);
		accountRepository.addCategory(category);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/category/{categoryId}")
	public Category fetchAccount(@PathVariable("categoryId") int categoryId){
//		Account account = new Account(12, "Ravi", 34443.34);
		return accountRepository.findCategory(categoryId);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, path="/category/{categoryId}")
	public ResponseEntity<Void> deleteCategory(@PathVariable("categoryId") int categoryId){
//		Account account = new Account(12, "Ravi", 34443.34);
		 accountRepository.deleteCategory(categoryId);
		 return new ResponseEntity<Void>(HttpStatus.GONE);
	}
	
	
	
	

	
	

}
