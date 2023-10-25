package com.ex3.ex3.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ex3.ex3.Model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
}