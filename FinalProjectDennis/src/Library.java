

import java.util.ArrayList;

import javax.annotation.Resource;

public class Library {
	
	private ArrayList<Resources> resource;
	private ArrayList<Users> user ;
	

	
	public Library() {
		resource = new ArrayList<Resources>();
		user = new ArrayList<Users>();
	}



	public ArrayList<Resources> getResource() {
		return resource;
	}



	public ArrayList<Users> getUser() {
		return user;
	}

}
