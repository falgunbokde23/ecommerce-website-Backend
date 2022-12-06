package com.masai.service;

import com.masai.exception.UserException;
import com.masai.model.CurrentUserSession;
import com.masai.model.UserDTO;

public interface LogInService {

//	public User addUser(User user) throws UserException;

//	public boolean adminOrNot(String uuid) throws UserException;

	public CurrentUserSession getSessionByUuid(String uuid);

	public CurrentUserSession loginUser(UserDTO dto) throws UserException;

//	public User removeUser(User user) throws UserException;

	public String signOutUser(String key) throws UserException;
}
