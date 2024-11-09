Quick Ride - Ride Sharing Application Design

Overview
This Repo covers the design of a ride-sharing application, similar to applications like BlaBlaCar, which facilitates both intra-city and inter-city travel arrangements. Users can offer rides in their vehicles, and other users can book these rides to share the journey.

System Requirements
User Roles: Users can either act as drivers or passengers. A user with a car can offer rides as a driver, but if they do not have their car available, they can switch roles and act as passengers.

Ride Proposals and Booking: The system should allow users to propose rides along specific routes and let passengers book these rides. Passengers can select their ride based on various strategies like vehicle type, number of available seats, and timing.

Trip Management: The system must manage trip initiation and conclusion effectively. Only one active trip can be associated with any vehicle at a time to prevent conflicts. A ride for a particular vehicle can only be proposed if no other ongoing trip exists for that vehicle.

Registration and Authentication: Users need to register and authenticate within the system to offer or book rides. This entails logging in or signing up, and registering vehicles if acting as drivers.

Class Design
Entity Classes

User Class:

Common attributes such as ID, name, phone number, password, gender, rating, and list of rides should be encapsulated within a parent class User【4:3†source】【4:1†source】.
Driver and Passenger Classes:

Both classes inherit from User. Additional attributes like license details for drivers and preferred trip types or seats for passengers can be specified【4:2†source】.

Vehicle Class:

Stores details relevant to the vehicle like ID, name, number, type (e.g., SUV, sedan), seat count, and owner ID. Ideally, contain a list of associated drivers and a list of proposed rides【4:0†source】【4:6†source】.

Ride Class:

Details encapsulated include ride ID, source and destination locations, vehicle used, available seat count, list of passengers, ride status, and fare per user【4:14†source】【4:5†source】.

Database Schema Representation
The database should efficiently encapsulate relationships inherent in the ride-sharing platform. Use mapping strategies like:

Mapped Superclass: For base classes without tables of their own【4:1†source】.
Join Table: To manage many-to-many relationships without redundancy【4:1†source】.

Edge Cases & Additional Features

Notification and Real-Time Management: While not a primary feature, consider how users might be notified about ride options or status using systems akin to Uber【4:5†source】【4:17†source】.

Error and Exception Handling: Must include robust mechanisms for error management across components on functionalities like user registration, trip proposals, etc【4:10†source】.

Handling Indirect Routes: The application should ideally suggest multi-leg journeys when direct options are unavailable, highlighting necessary transfers【4:17†source】.

Accessibility and User Preferences: Accommodate choices like car type preference, by taking into account various user strategies for ride booking【4:18†source】