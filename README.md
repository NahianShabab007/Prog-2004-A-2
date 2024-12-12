# Prog-2004-A-2
# Theme Park Management System (PROG2004 - Assessment 2)

This repository contains the source code for the Theme Park Management System (PRVMS) developed for PROG2004 - Object-Oriented Programming Assessment 2. The project demonstrates the application of object-oriented programming principles to manage theme park rides, staff, and visitors.

---

## Project Structure

```
NahianA2/
├── src/
│   ├── com/nahian/park/
│   │   ├── AssignmentTwo.java      # Main class with demonstration methods
│   │   ├── Person.java             # Abstract class representing a person
│   │   ├── Employee.java           # Class representing a theme park employee
│   │   ├── Visitor.java            # Class representing a theme park visitor
│   │   ├── Ride.java               # Class representing a theme park ride
│   │   ├── RideInterface.java      # Interface for ride functionalities
├── README.md                       # Project overview and instructions
```

---

## How to Run

1. **Clone the Repository**:
   ```
   git clone https://github.com/<username>/username-A2.git
   cd username-A2
   ```

2. **Set Up the Project**:
   - Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
   - Ensure the `src` directory is set as the source folder.

3. **Run the Application**:
   - Execute the `AssignmentTwo` class to demonstrate the functionality for each part (3–7).

---

## Demonstrated Functionality

### Part 1: Classes and Inheritance
- Implemented `Person`, `Employee`, `Visitor`, and `Ride` classes with constructors, getters, and setters.
- Demonstrated inheritance and encapsulation.

### Part 2: Abstract Class and Interface
- Converted `Person` to an abstract class.
- Created and implemented `RideInterface` for ride-related functionalities.

### Part 3: Queue Management
- Used a `Queue` to manage visitors waiting for rides.
- Methods:
  - `addVisitorToQueue`
  - `removeVisitorFromQueue`
  - `printQueue`

### Part 4A: Ride History (LinkedList)
- Used `LinkedList` to store visitors who completed rides.
- Methods:
  - `addVisitorToHistory`
  - `checkVisitorFromHistory`
  - `numberOfVisitors`
  - `printRideHistory`

### Part 4B: Sorting Ride History
- Sorted ride history using a `Comparator`.

### Part 5: Running a Ride Cycle
- Implemented `runOneCycle` to process the queue and update ride history.

### Part 6: Writing to a File
- Exported ride history to a CSV file using `exportRideHistory`.

### Part 7: Reading from a File
- Imported ride history from a CSV file using `importRideHistory`.

---

## Files for Submission

1. **Source Code**: Included in the repository under the `src` directory.
2. **GitHub Link**: This repository link.
3. **Video Explanation**: Link to video demonstrating the implementation.

---

## Academic Integrity

This project adheres to the academic integrity guidelines outlined by Southern Cross University. GenAI tools were only used for guidance and were appropriately acknowledged. The code was developed independently.

---

## Contact

For questions or clarifications, please contact:  
- **Name**: [Nahian Shabab]  
- **Email**: [nahiansabab1998@gmail.com]  
- **GitHub**: [https://github.com/NahianShabab007/Prog-2004-A-2.git]
