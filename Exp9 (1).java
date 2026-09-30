class ReservationThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket reservation in progress...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Reservation thread interrupted.");
            }
        }
    }
}

class StatusThread implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket confirmation status displayed.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Status thread interrupted.");
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating object of ReservationThread
        ReservationThread reservation = new ReservationThread();

        // Creating object of StatusThread
        StatusThread status = new StatusThread();

        // Creating Thread object using Runnable
        Thread statusThread = new Thread(status);

        // Starting both threads
        reservation.start();
        statusThread.start();
    }
}