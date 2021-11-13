import java.time.LocalDate;
import java.util.Collection;


public class TicketReserve {
    private Collection<Show> shows;
    //title is a show field
    public Collection<Show> getShowByTitle(String title){

    }
    //time is a show field
    public Collection<Show> getShowByTime(LocalDate date){

    }

    /**
     * reserves a seat
     * @param showIndex index of the show list
     * @param theaterIndex index of the theater list
     * @param rowIndex index of the row list
     * @param seatIndex index of the seat list
     * @param personName name of the reserver
     */
    public void reserve(int showIndex , int theaterIndex , int rowIndex , int seatIndex , String personName){

    }

    /**
     * uses toString method
     * @param shows shows that we need their details (getter results)
     */
    public void printShowDetails(Collection<Show> shows){

    }

    /**
     * adds a show to the list
     * @param show show to be added
     */
    public void addShow(Show show){

    }

    /**
     * adds a theater
     * @param theater theater to be added
     * @param showIndex the show of the theater
     */
    public void addTheater(Theater theater , int showIndex){

    }

    /**
     * multiple reservation
     * @param showIndex index of the show list
     * @param theaterIndex index of the theater list
     * @param rowIndex index of the row list
     * @param seatIndex index of the seat list
     * @param personName name of the reserver
     * @param num number of seats to be reserved
     */
    public void addMultiple(int showIndex , int theaterIndex , int rowIndex , int seatIndex , String personName , int num){

    }

    /**
     * gets the number of needed seats and returns the row and seat index of the first one
     * @param showIndex  index of the show list
     * @param theaterIndex index of the theater list
     * @param number number of seats to be reserved
     * @return the row and seat index of the first one
     */
    public int[] findMultiple(int showIndex , int theaterIndex , int number){

    }

    /**
     * gets a name and shows that person's reserved seats in case they forget
     * @param personName reserver's name
     */
    public void showPersonSeats(String personName){

    }

    /**
     * shows every person to notify
     * @param showIndex  index of the show list
     * @param theaterIndex index of the theater list
     */
    public void notifyCancel(int showIndex , int theaterIndex){

    }

    /**
     * removes a reservation
     * @param showIndex index of the show list
     * @param theaterIndex index of the theater list
     * @param personName reserver's name
     */
    public void removeReserve(int showIndex , int theaterIndex , String personName){

    }
}
