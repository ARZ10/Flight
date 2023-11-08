
package BookingSystem;

/**
 *
 * @author amirrezaei
 */
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatLeft;
    private double originalPrice;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        try{
            if(!(origin.equal(destination))){
                this.flightNumber = flightNumber;
                this.origin = origin;
                this.destination = destination; 
                this.departureTime = departureTime;
                this.capacity = capacity;
                this.numberOfSeatLeft = capacity;
                this.originalPrice = originalPrice; 
            }
        }
        catch(Exception e) {
                System.out.println("Your origin and destination are the same!");
            }
        }
}
  

