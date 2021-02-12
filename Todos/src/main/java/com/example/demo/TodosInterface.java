package com.example.demo;

import java.util.List;

public interface TodosInterface {

	List<TodosModel> getdata();

	String postdata(TodosModel m);

	String putdata(TodosModel m);

	String deletedata(int id);

	String updatestatus(int m);

}
