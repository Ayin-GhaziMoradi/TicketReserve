public class Row {
    private Seat[] seatList;

    /**
     * seatList setter
     * @param seatList the list to assign seatList
     */
    public void setSeats(Seat[] seatList){

    }

    /**
     * reserves a seat
     * @param index index of the seat list
     * @param personName name of the reserver
     */
    public void addReserve(int index , String personName){

    }

    /**
     * seat getter
     * @param index index of the desired seat
     * @return the desired seat
     */
    public Seat getSeat(int index){

    }

    /**
     * multiple reservation
     * @param seatIndex index of the seat list
     * @param personName name of the reserver
     * @param num number of seats to be reserved
     */
    public void addMultiple(int seatIndex , String personName , int num){

    }

    /**
     * gets the number of needed seats and returns the row and seat index of the first one
     * @param number number of seats to be reserved
     * @return the row and seat index of the first one
     */
    public int findMultiple(int number){

    }

    /**
     * gets a name and shows that person's reserved seats in case they forget
     * @param personName reserver's name
     * @return the row and seat index
     */
    public int[] showPersonSeats(String personName){

    }
}
