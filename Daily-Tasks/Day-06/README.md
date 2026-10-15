 Day 06 – Order Processing and Exception Handling

 Overview
Practises order validation and handling invalid input or business-rule failures with Java exceptions.

 Concepts Practiced
- `try` and `catch`
- `throw` and `throws`
- Custom exceptions and validation
- Invalid quantity and insufficient stock scenarios

 Structure
```text
Day-06/
├── src/main/java/order/
└── out/   # Generated compiler output; do not commit
```

 Compile
From the `Day-06` directory:
```powershell
javac -d out src/main/java/order/*.java
```

Run the actual class containing `main`. For example:
```powershell
java -cp out order.OrderProcessingApp
```
Use the real class name if it differs.

 Status
Order validation and exception-handling scenarios practised.
