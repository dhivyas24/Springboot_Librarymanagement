package com.example.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="/delete/{bookid}")

public class delete {

		@Autowired LogModelRepo ob;
		@PostMapping()
		    public String deletebyid(@PathVariable("bookid") String bookid)
		    {
			 
			
			 
						ob.deleteAllByIdInBatch(bookid);
						
					 
				
			return "deleted updated";
	}
		
	}


		