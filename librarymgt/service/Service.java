package com.tendecoders.madhu.librarymgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Library;
import com.tendecoders.madhu.librarymgt.dao.LibryDao;

@Component
public class Service {

	@Autowired

	LibryDao dao;
	public Library create(Library library) {

		return dao.create(library);
	}
	public List<Library> getall(){

		return dao.getall();

	}
	public Library get(long Id) {

		return dao.getids(Id);	

	}

	public void del(int id) {

		dao.delete(id);

	}
	public void up(int id,Library library) {

		dao.update(id,library);

	}

	

	

}