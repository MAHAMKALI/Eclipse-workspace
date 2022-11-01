package com.JPA_Hibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.JPA_Hibernate.Entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{

	//void save(String userName, String userCollege);

}
