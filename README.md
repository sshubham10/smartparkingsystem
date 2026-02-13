# 🚗 Smart Parking System (OOP)

A robust, object-oriented simulation (or implementation) of a multi-level parking management system. This project focuses on efficient space allocation, automated ticketing, and real-time occupancy tracking.

## ## 🛠 Key Features

* **Dynamic Vehicle Support:** Handles different vehicle types (Cars, Trucks, Motorcycles, Electric) with specific space requirements.
* **Automated Ticketing:** Calculates fees based on duration and vehicle type using the **Strategy Pattern**.
* **Real-time Availability:** Tracks occupied vs. free spots across multiple floors.
* **Member Management:** Supports different user roles (Admin, Attendant, Customer).
* **Payment Integration:** Simulation of multiple payment methods (Credit Card, Cash, Digital Wallet).

## ## 🏗 System Architecture (OOP Principles)

This project is built using the following core OOP concepts:

* **Encapsulation:** All vehicle and parking spot data is protected; state changes occur through controlled methods.
* **Inheritance:** A base `Vehicle` class is extended by `Car`, `Truck`, and `Van`.
* **Polymorphism:** The `calculateFee()` method is overridden to apply different rates based on vehicle size.
* **Abstraction:** Using `Abstract Classes` or `Interfaces` for payment gateways and sensor inputs.

### ### Class Overview

| Class | Responsibility |
| --- | --- |
| `ParkingLot` | Singleton class managing floors, gates, and entry/exit. |
| `ParkingSpot` | Base class for different spot types (Compact, Large, Handicapped). |
| `Account` | Manages Admin and Attendant credentials and actions. |
| `Ticket` | Stores entry time, exit time, and status. |

## ## 💻 Tech Stack

* **Language:** [e.g., C++, Java, Python]
* **Design Patterns:** Singleton, Factory, and Strategy.
* **Data Storage:** [e.g., CSV files, SQLlite, or In-memory Data Structures]

## ## 🚀 Getting Started

### ### Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/smart-parking-oop.git

```


2. Navigate to the project directory:
```bash
cd smart-parking-oop

```


3. Compile/Run:
```bash
# Example for C++
g++ main.cpp -o parking_system
./parking_system

```



## ## 📋 Usage Example

```cpp
// Example of polymorphic vehicle entry
ParkingLot lot = ParkingLot::getInstance();
Vehicle* myCar = new Car("ABC-1234");
Ticket ticket = lot.processEntry(myCar);

```

## ## 🛣 Roadmap

* [ ] Add a Graphical User Interface (GUI) using [Qt/Tkinter/JavaFX].
* [ ] Integrate hardware sensors (ultrasonic) for real-world spot detection.
* [ ] Implement an "Electric Vehicle" charging spot logic.
