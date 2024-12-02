package application;

public  class User {
	private int ID;
	private String Name;
	private String Username;
	private String Password;
	
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void setID() {
		this.ID=(int)(Math.random()*435001);
	}
	
	public int getID() {return this.ID;}

	public String getName() {
		return Name;
	}
	

	public void setName(String name) {
		
		if(checkName(name)) {
			Name = name;
		}else {
			System.out.println("Invalid name check if it's contains more than 40 characters");
		}
	}
	public boolean checkName(String name) {
		if(name.length()>40) {
			return false;
		}
		return true;
	}

	public String getUsername() {
		if(Username.equals("  ")) {
			return "No description is posted !";
		}
		return Username;
	}

	public void setUsername(String username) {
		
		if(username.length()<=200) {
			Username = username;
		}else {
			System.out.println("The description must hold at maximum 200 characters");
		}
	}
	//public void checkDescription(String description) {
		//if(description.length()>200) {
			//System.out.println("")
		//}
		//return true;
	//}
	public void setInfo(String name,String username) {
		setName(name);
		if(!username.equals(" ")) {
			setUsername(username);
		}
		setID();
		
		
		
	}
	 public String getInfo() {
		 return getName()+" "
		 		+ " "+getUsername();
		
		
		
	}

}
