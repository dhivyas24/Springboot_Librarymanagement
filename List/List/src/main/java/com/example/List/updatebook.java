package com.example.List;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;




	@RestController
	@RequestMapping(path="/updatebook/{bookid}")
	public class updatebook {
		@Autowired LogModelRepo ob;
		@PostMapping()
		    public String getAllNotes(@RequestBody LogModel log,@PathVariable("bookid") String bookid)
		    {
			 //LogModel logs = ob.findbybookid(bookid);
			
			 
						String id =log.getBookid();
						String bookname = log.getBookname();
						String Qnty= log.getQnty();
						String Genre=log.getGenre();

				       
						
						ob.findbybookid(id,bookname,Genre,Qnty,bookid);
					 
					 //ob.save(log);
			// return"success";
			return "successfully updated";
	}
		
	}


		