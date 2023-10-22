/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandenumsminihw;

import java.util.List;

/**
 *
 * @author suele
 */
public class Team  {
    private String name;
    private List members;
    
    public Team (String name, List members){
        this.name =name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public List<String> getMembers() {
        return members;
    }
    
}
