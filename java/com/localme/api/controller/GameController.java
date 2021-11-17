package com.localme.api.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.localme.api.repository.GameRepository;
import com.localme.api.vo.GameDetails;
import com.localme.api.vo.UserDetails;

import com.localme.api.vo.UserLogin;


@RestController
public class GameController {

	@Autowired
	GameRepository gameRepo;
	
	@PostMapping("/getUser")
	public Map<String, Object> getUser(@RequestBody UserLogin uservo) {
		
		Map<String, Object> result = new HashMap<String,Object>();
		UserDetails userDetails = gameRepo.findByuid(uservo.getUsername());
		if(userDetails == null) {
			
			result.put("STATUS", "FAILURE");
			result.put("ERROR", "USER NOT FOUND");
		}else 
		{
			result.put("STATUS", "SUCCESS");
			result.put("DATA", userDetails);
			
		}
		return result;
	}
	@PostMapping("/addUser")
	public Map<String, Object> addUser(@RequestBody UserDetails uservo) {
		
		Map<String, Object> result = new HashMap<String,Object>();
		UserDetails userDetails = gameRepo.findByuid(uservo.getUid());
	if(userDetails == null )
		{
		UserDetails restultvo = gameRepo.save(uservo);
		result.put("STATUS", "SUCCESS");
		restultvo.setPwd("");
		result.put("DATA", restultvo);
		}
	else {
		result.put("STATUS","FAILURE");
		
	}
		return result;
	}
	@PostMapping("/addGame")
	public Map<String, Object> addGame(@RequestBody GameDetails gamevo) {
		Map<String, Object> result = new HashMap<String,Object>();
		GameDetails gameDetails = gameRepo.findByname(gamevo.getName());
		if(gameDetails==null)
		{
		GameDetails resultvo=gameRepo.save(gamevo);
		result.put("STATUS", "SUCCESS");
		result.put("DATA", resultvo);
		}
		else {
			result.put("STATUS","FAILURE");
			
		}
			return result;
		}
	
	@PostMapping("/getGame")
	public Map<String, Object> getUser(@RequestBody GameDetails gamevo) {
		
		Map<String, Object> result = new HashMap<String,Object>();
		GameDetails gameDetails = gameRepo.findByname(gamevo.getName());
		if(gameDetails == null) {
			
			result.put("STATUS", "FAILURE");
			result.put("ERROR", "USER NOT FOUND");
		}else 
		{
			result.put("STATUS", "SUCCESS");
			result.put("DATA", gameDetails);
			
		}
		return result;
	}
	
}
