import java.util.ArrayList;

public class Theater {
    private ArrayList<Row> rowList;

    /**
     * adds a row
     * @param row the row to be added
     */
    public void addRow(Row row){

    }
    /**
     * reserves a seat
     * @param rowIndex index of the row list
     * @param seatIndex index of the seat list
     * @param personName name of the reserver
     */
    public void addReserve(int rowIndex , int seatIndex , String personName){

    }

    /**
     * iterates , finds and shows reservable seats
     */
    public void showEmptySeats(){

    }

    /**
     * multiple reservation
     * @param rowIndex index of the row list
     * @param seatIndex index of the seat list
     * @param personName name of the reserver
     * @param num number of seats to be reserved
     */
    public void addMultiple(int rowIndex , int seatIndex , String personName , int num){

    }

    /**
     * gets the number of needed seats and returns the row and seat index of the first one
     * @param number number of seats to be reserved
     * @return the row and seat index of the first one
     */
    public int[] findMultiple(int number){

    }

    /**
     * gets a name and shows that person's reserved seats in case they forget
     * @param personName reserver's name
     * @return the row and seat index
     */
    public int[] showPersonSeats(String personName) {

    }

    /**
     * shows every person to notify
     */
    public void notifyCancel(){

    }

    /**
     * removes a reservation
     * @param personName reserver's name
     */
    public void removeReserve(String personName){

    }
}
