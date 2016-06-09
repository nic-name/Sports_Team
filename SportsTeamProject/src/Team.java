import java.util.Objects;

public class Team{
	
	private String teamName;
	
	//empty constructor method
	public Team(){
	}
	
	
	//create a constructor method that takes in a string teamName
	public Team(String teamName){
		this.teamName = teamName;
	}

	//getters and setters
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	@Override
	public String toString() {
		return teamName;
	}
	
	@Override
	public boolean equals(Object obj){
		
		//check for null
		if (obj == null){
		return false;
		}
		
		//make sure the object is a team
		if (getClass() != obj.getClass()){
		return false;
		}
		
		//cast the object as a Team
		final Team teamNameEntered = (Team) obj;
		
		//check the field
		if(!Objects.equals(this.teamName, teamNameEntered.teamName)){
			return false;
		}
		
		return true;
	}
}


