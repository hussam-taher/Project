import java.util.*;
public class admin{
	List<user> usersList = new ArrayList<user>();
	int counter=0;
	public int getUsersNumber(){
			return usersList.size();
		}
		public String getUsers(){
				String result = "";
			  Iterator itr=usersList.iterator();
			  	while(itr.hasNext()){//check if iterator has the elements
			  	   result += itr.next().toString()+ ",";
				   System.out.println(result.toString());//printing the element and move to next
  				}

				return result;
			}
	public void insertUser(String userName,String userPass,String firstName,String lastName ){
		//usersList.add(new user("test","test","test","test"));
		usersList.add(new user(userName,userPass,firstName,lastName));
		}
}