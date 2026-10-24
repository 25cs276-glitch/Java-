import java.util.*;

public class EXP12 {

public static void main(String[] args) {

// List Interface
List<String> studentList = new ArrayList<>();
studentList.add("Arun");
studentList.add("Divya");
studentList.add("Karthik");
studentList.add("Divya"); // Duplicate Allowed

System.out.println("Student List");
System.out.println(studentList);

// Set Interface
Set<String> courseSet = new HashSet<>();
courseSet.add("Java");
courseSet.add("Python");


courseSet.add("Java");
courseSet.add("C++");

System.out.println("\nCourse Set");
System.out.println(courseSet);

// Map Interface
Map<Integer, String> studentMap = new HashMap<>();
studentMap.put(101, "Arun");
studentMap.put(102, "Divya");
studentMap.put(103, "Karthik");

System.out.println("\nStudent Map");
for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
System.out.println("Roll No : " + entry.getKey()
+ " Name : " + entry.getValue());
}

// Queue Interface
Queue<String> queue = new LinkedList<>();

queue.offer("Student-1");
queue.offer("Student-2");
queue.offer("Student-3");


System.out.println("\nQueue Before Processing");
System.out.println(queue);

System.out.println("Processing : " + queue.poll());

System.out.println("Queue After Processing");
System.out.println(queue);
}
}