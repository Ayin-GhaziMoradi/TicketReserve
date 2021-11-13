import java.util.ArrayList;

public class Show {
    ArrayList<Theater> theaters;

    /**
     * adds a theater
     * @param theater the theater to be added
     */
    public void addTheater(Theater theater){

    }

    /**
     * reserves a seat
     * @param theaterIndex index of the theater list
     * @param rowIndex index of the row list
     * @param seatIndex index of the seat list
     * @param personName name of the reserver
     */
    public void addReserve(int theaterIndex , int rowIndex , int seatIndex , String personName){

    }

    /**
     * theater index + time(has to be a theater field)
     * @return details
     */
    public String toString(){

    }

    /**
     * multiple reservation
     * @param theaterIndex index of the theater list
     * @param rowIndex index of the row list
     * @param seatIndex index of the seat list
     * @param personName name of the reserver
     * @param num number of seats to be reserved
     */
    public void addMultiple(int theaterIndex , int rowIndex , int seatIndex , String personName , int num){

    }

    /**
     * gets the number of needed seats and returns the row and seat index of the first one
     * @param theaterIndex index of the theater list
     * @param number number of seats to be reserved
     * @return the row and seat index of the first one
     */
    public int[] findMultiple(int theaterIndex , int number){

    }

    /**
     * gets a name and shows that person's reserved seats in case they forget
     * @param personName reserver's name
     * @return  the row and seat index
     */
    public int[] showPersonSeats(String personName) {

    }

    /**
     * theater getter (using index)
     * @param index index of the theater in the arraylist
     * @return the desired theater
     */
    public Theater getTheater(int index){

    }
}
