/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsandenumsminihw;

import java.io.FileReader;
import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author suele
 */
public class CollectionsAndEnumsMiniHw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    String myFileTeamName = "MOCK_DATA.csv"; //File name
        
    List<String> data = new ArrayList<>(); //List to store the data from the file
                         
    try {
            
    Scanner myFile = new Scanner(new FileReader(myFileTeamName));//Scanner to read data from the file
    
    while (myFile.hasNext()){
    String input = myFile.nextLine(); //reads a line fromt the file
    data.add(input);
    }
    
    }catch (Exception e){
         
    }
          
    List<Team> teams = createTeams (data); //Create teams from file
      
    //Output team names and members
    for (Team team : teams){
          System.out.println("Team: " + team.getName());
         
    for (String member : team.getMembers()){
              System.out.println(member);   
    }
    }
    }  
    
    private static List<Team> createTeams(List<String> data) {
        
    List<Team> teams = new ArrayList<>(); //Team names list with 5 members
      
    List<String> availableTeamNames = generateTeamNames(); // Generate unique team names
    int teamNameIndex = 0;
    
    for (int i = 0; i <20; i++){ //20 teams
        
    List<String> teamMembers = new ArrayList<>();
    for (int j = 0; j <5; j++){ //5 members each team
        
    Random random = new Random (); //Take random names
                
    int randomIndex = random.nextInt(data.size()); 
        String person = data.get(randomIndex );
            
    if (!teamMembers.contains(person)){ // to not duplicate team members
        teamMembers.add(person);
        } 
        }
            
     // Get a name and add to list of teams
    String teamName = availableTeamNames.get(teamNameIndex);
    teams.add(new Team(teamName, teamMembers));
    teamNameIndex = (teamNameIndex + 1) % availableTeamNames.size();
    }
    return teams;
   
    }
    private static List<String> generateTeamNames() {
        List<String> teamNames = new ArrayList<>(); //20 teams' name
       
        teamNames.add("Flamengo");
        teamNames.add("Sao Paulo");
        teamNames.add("Corinthians");
        teamNames.add("Coritiba");
        teamNames.add("Botafogo");
        teamNames.add("Parana");
        teamNames.add("Atletico Mineiro");
        teamNames.add("Atletico Paranaense");
        teamNames.add("Vasco");
        teamNames.add("Bahia");
        teamNames.add("Cruzeiro");
        teamNames.add("Fluminense");
        teamNames.add("Palmeiras");
        teamNames.add("Internacional");
        teamNames.add("Gremio");
        teamNames.add("Santos");
        teamNames.add("Liverpool");
        teamNames.add("Arsenal");
        teamNames.add("Manchester");
        teamNames.add("Boca Jr");
        
        return teamNames;
    
    
}
    
    
}
