package activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

 class plane {
    private List<String> passengers;
   private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}

public class activity6 {

    public static void main(String[] args) throws InterruptedException {
        plane p = new plane(3);
        p.onboard("A");
        p.onboard("B");
        p.onboard("C");
        System.out.println("Plane take of time is " + p.takeOff());
        System.out.println("Passengers on the plane are  " + p.getPassengers());
        Thread.sleep(5000);
        p.land();
        System.out.println("Plane landed at: " + p.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + p.getPassengers());
    }
}