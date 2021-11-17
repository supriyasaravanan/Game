package com.localme.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.localme.api.vo.GameDetails;
import com.localme.api.vo.UserDetails;

@RepositoryRestResource
public interface GameRepository extends CrudRepository<UserDetails, Integer> {
	
	public UserDetails findByuid(String username);
	public GameDetails findByname(String name);
	
}
