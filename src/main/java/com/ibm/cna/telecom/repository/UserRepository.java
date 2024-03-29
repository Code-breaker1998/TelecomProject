package com.ibm.cna.telecom.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ibm.cna.telecom.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {

	public User findByUsername(String username);
	
	//this is the custom query in project- d alias name-user is tablename
	@Query(value="select * from user s where city=?1", nativeQuery =true)
	List<User> findByCity(String city); //,String firstname-2
}
