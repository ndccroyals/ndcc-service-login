package com.ndcc.ndccservicelogin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ndcc.ndccservicelogin.entity.UserLoginEntity;

@Repository
public interface LoginRepo extends JpaRepository<UserLoginEntity, String> {

    UserLoginEntity findByUserIdAndPasswordAndEmail(String userName, String password, String email);

}
