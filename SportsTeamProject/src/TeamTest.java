public class TeamTest {

	public static void main(String[] args) {
		
			//Create 5 team objects
			Team teamOne = new Team();
			Team teamTwo = new Team();
			Team teamThree = new Team();
			Team teamFour = new Team();
			Team teamFive = new Team();
			
			//Create a team object bringing in a string parameter
			Team teamSix = new Team("Cork City FC");
			
			
			//Set the first four team names
			teamOne.setTeamName("Manchester United");
			teamTwo.setTeamName("Arsenal");
			teamThree.setTeamName("Liverpool");
			teamFour.setTeamName("Manchester United");
			
			//Test using a boolean to see if they either match or print out
			System.out.println("Do they match?:");
			System.out.println("Team One and Team Two:	" + teamOne.equals(teamTwo));
			System.out.println("Team One and Team Three:	" + teamOne.equals(teamThree));
			System.out.println("Team One and Team Four:	" + teamOne.equals(teamFour));
			System.out.println("Team Five:	" + teamFive);
			System.out.println("Team Six:	" + teamSix);
	}
}
