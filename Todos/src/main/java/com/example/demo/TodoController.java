package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	@Autowired
  private TodosInterface t;
	
	@GetMapping("/project")
	public List<TodosModel> gettodos()
	{
	   return t.getdata();	
	}
	
	@PostMapping("/project")
	public String posttodos(@RequestBody TodosModel m )
	{
	   return t.postdata(m);	
	}
	
	@PutMapping("/project")
	public String puttodos(@RequestBody TodosModel m )
	{
	   return t.putdata(m);	
	}
	@PutMapping("/project/{m}")
	public String updatetodos(@PathVariable int  m )
	{
	   return t.updatestatus(m);	
	}
	@DeleteMapping("/project/{id}")
	public String deletecourse(@PathVariable int id) {
		return t.deletedata(id);
	}
	
	
}
