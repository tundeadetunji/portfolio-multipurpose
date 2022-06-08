package com.tundeadetunji.multipurpose.repository;

import com.tundeadetunji.multipurpose.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer> {

}
