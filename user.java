public class user{
String userName;
String userPass;
String firstName;
String lastName;
	public user(String userName,String userPass,String firstName,String lastName){
		this.userName=userName;
		this.userPass=userPass;
		this.firstName=firstName;
		this.lastName=lastName;
		}
		public void setUserName(String userName){
			this.userName=userName;
			}
			public String getUserName(){
				return userName;
				}
				public void setUserPass(String userPass){
							this.userPass=userPass;
							}
							public String getuserPass(){
				return userPass;
			}
			public void setfirstName(String firstName){
						this.firstName=firstName;
						}
						public String getfirstName(){
				return firstName;
			}
			public void setlastName(String lastName){
						this.lastName=lastName;
						}
						public String getlastName(){
				return lastName;
		}
}
