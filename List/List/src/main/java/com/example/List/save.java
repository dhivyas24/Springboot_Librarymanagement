package com.example.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/save")
public class save {

@Autowired LogModelRepo ob;

@PostMapping()
	public String savebook(@RequestBody LogModel log)
	{
	LogModel a= new LogModel();
	String id=log.getBookid();
	String name =log.getBookname();
	
	String qnty=log.getQnty();
	String genre = log.getGenre();
	a.setBookid(id);
	a.setBookname(name);
	a.setGenre(genre);
	a.setQnty(qnty);
 LogModel first = new LogModel(id,name,qnty,genre);
	ob.save(first);
	
return "saved successfully";
//return "saved successfully";
	
}
}
  