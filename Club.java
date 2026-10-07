import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // Q2
    private ArrayList <Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    { 
        //Q3
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        //Q2
        return members.size();
    }  
     //Q4
/**
* Determine the number of members who joined in the
* given month.
* @param month The month we are interested in.
* @return The number of members who joined in that month.
*/
public int joinedInMonth(int month)
{
if (month < 1 || month >12)
{
    System.out.println("Month cannot be outside of range 1-12");
    return 0;
}
else{ 
    int count = 0;
    for (Membership m : members) {
        if (m.getMonth() == month) {
            count++;
        }
    }
    return count ;
}
}
//Q5
/**
* Remove from the club's collection all members who
* joined in the given month, and return them stored
* in a separate collection object.
* @param month The month of the membership.
* @param year The year of the membership.
* @return The members who joined in the given month and year.
*/
public ArrayList<Membership> purge(int month, int year){
    purge.get month;
}

