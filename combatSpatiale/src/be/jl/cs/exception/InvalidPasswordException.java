package be.jl.cs.exception;

import be.jl.cs.model.User;

@SuppressWarnings("serial")
public class InvalidPasswordException extends Exception {

    @SuppressWarnings("unused")
	private User user;
    
	public InvalidPasswordException(User user) {
		super("Invalid password for user Username=" + user.getFullName()+ " full name = "+user.getFullName());
		this.user=user;
	}
	
}
