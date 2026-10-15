# Hotel Room Booking System

## Overview
A Java console prototype modelling a basic hotel room reservation flow. The current prototype demonstrates room and guest details, booking validation, total-price calculation, and room availability updates.

> This README separates implemented prototype behaviour from planned enhancements. Planned features should not be described as completed.

## Implemented in the Current Prototype
- `Room`, `Guest`, and `Booking` model classes
- Booking validation for positive night counts
- Validation that a room is available
- Total booking amount calculation
- Custom checked exception: `InvalidBookingException`
- Room availability changes after a successful booking
- Rejection of another booking when the room is unavailable

## Technology
- Java
- VS Code
- Git and GitHub

Spring Boot, React, MySQL, authentication, and payment integration are planned or under consideration; they are not part of the current prototype unless added separately.

## Main Source Files
- `Room.java`
- `Guest.java`
- `Booking.java`
- `HotelApp.java`
- `InvalidBookingException.java`

## How to Run
If the Java files have no package declarations and are together in the current directory:
```powershell
javac *.java
java HotelApp
```
If the files declare packages or are inside `src/main/java`, compile from the correct source root and run `HotelApp` using its fully qualified package name.

## Planned Enhancements
- Manage multiple rooms using collections
- Search availability using check-in and check-out dates
- Prevent overlapping confirmed reservations
- Add check-in and check-out workflows
- Add billing, folio charges, and invoices
- Add occupancy and Average Daily Rate (ADR) reports
- Add automated tests
- Consider a Spring Boot REST backend, React + TypeScript frontend, and MySQL persistence
- Add authentication and role-based access control
- Consider payment integration with server-side verification

## Non-Functional Goals
- Clear validation and error messages
- Reliable booking conflict prevention
- Secure handling of guest information
- Accurate money calculations (use `BigDecimal` in a full implementation)
- Modular, maintainable, testable code

## Generated Files
Folders such as `target/` and `out/` contain generated build output and should normally be excluded from Git.

## Status
Basic Java console prototype implemented. Enhancements listed above remain planned until they are built and tested.
