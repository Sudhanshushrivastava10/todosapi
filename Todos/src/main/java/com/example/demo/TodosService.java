package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodosService implements TodosInterface {
  
	@Autowired
	private TodosRepository td;
	@Override
	public List<TodosModel> getdata() {
		 return	td.findAll();
	}
	
	@Override
	public String postdata(TodosModel m) {
		td.save(m);
		return "saved";
	}

	@Override
	public String putdata(TodosModel m) {
		 td.save(m);
		 return "updated";
	}

	@Override
	public String deletedata(int id) {
	   td.deleteById(id);
	   return "deleted";
	}

	@Override
	public String updatestatus(int m) {
	     TodosModel tm=td.getOne(m);
	     tm.setStatus("completed");
	     td.save(tm);
		return "changed";
	}


}
