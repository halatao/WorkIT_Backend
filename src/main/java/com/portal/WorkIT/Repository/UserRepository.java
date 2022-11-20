package com.portal.WorkIT.Repository;

import com.portal.WorkIT.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
