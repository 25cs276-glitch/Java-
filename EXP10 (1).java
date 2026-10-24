// Shared Resource
class Buffer {
private int data;
private boolean available = false;
// Producer Method
public synchronized void produce(int value) {
try {
while (available) {
wait();
}
data = value;
System.out.println("Produced : " + data);
available = true;
notify();
} catch (InterruptedException e) {
System.out.println(e);
}
}
// Consumer Method
public synchronized void consume() {



try {
while (!available) {
wait();
}
System.out.println("Consumed : " + data);
available = false;
notify();
} catch (InterruptedException e) {
System.out.println(e);
}
}
}

// Producer Thread
class Producer extends Thread {
Buffer buffer;
Producer(Buffer buffer) {
this.buffer = buffer;
}
public void run() {
for (int i = 1; i <= 5; i++) {
buffer.produce(i);
try {
Thread.sleep(500);
} catch (InterruptedException e) {



System.out.println(e);
}
}
}
}

// Consumer Thread
class Consumer extends Thread {
Buffer buffer;
Consumer(Buffer buffer) {
this.buffer = buffer;
}
public void run() {
for (int i = 1; i <= 5; i++) {
buffer.consume();
try {
Thread.sleep(500);
} catch (InterruptedException e) {
System.out.println(e);
}
}
}
}
// Main Class
public class EXP10 {


public static void main(String[] args) {
Buffer buffer = new Buffer();
Producer producer = new Producer(buffer);
Consumer consumer = new Consumer(buffer);
producer.start();
consumer.start();
}
}