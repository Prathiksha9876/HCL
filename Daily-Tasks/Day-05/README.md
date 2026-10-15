 Day 05 – Payment Strategy

 Overview
Organizes payment-related Java code in the `payment` package and practises interchangeable payment behaviour where implemented.

 Concepts Practiced
- Interfaces and implementation classes, where present
- Package organization
- Polymorphism/strategy design concepts

 Structure
```text
Day-05/
├── src/main/java/payment/
└── out/   # Generated compiler output; do not commit
```

 Compile
From the `Day-05` directory, if the Java files are directly in `src/main/java/payment/`:
```powershell
javac -d out src/main/java/payment/*.java
```

Run the actual class that contains `main`, using its fully qualified name. For example:
```powershell
java -cp out payment.Main
```
Replace `payment.Main` with the real main class name.

 Status
Payment strategy task files are organized under `payment`.
