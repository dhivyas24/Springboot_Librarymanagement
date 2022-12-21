package com.example.List;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

//import jakarta.transaction.Transactional;






public interface LogModelRepo  extends JpaRepository<LogModel,Integer> {

	
   List<LogModel> findAll();


@Transactional
@Modifying
@Query(value = "Update log_model u set u.bookid = ?1 , u.bookname =?2 , u.genre = ?3 , u.qnty=?4  where u.bookid = ?5 ", nativeQuery = true)
void findbybookid(String bookid,String bookname,String Genre,String qnty,String id);
//SELECT * FROM User u where u.date = ?1

@Modifying
@Transactional 
@Query(value = "DELETE FROM log_model WHERE bookid = ?1 ", nativeQuery = true)
void deleteAllByIdInBatch(String bookid);

//delete from soft_delete_jpa_example where id = 1;
}