# ThreadInJava

## 📌 Description
This program demonstrates multithreading in Java using both:
- `Thread` class (via `MyThread`)
- `Runnable` interface (via `MyRunnable`)

## 🧠 Functionality

### ➤ `MyThread` class
- Extends `Thread`
- Overrides `run()` to print numbers with a delay

### ➤ `MyRunnable` class
- Implements `Runnable`
- Overrides `run()` to simulate a task

### ➤ `ThreadOperations` class
- `runThreadClass()` - starts a thread using `MyThread`
- `runRunnableClass()` - starts a thread using `MyRunnable`

## 🚀 Execution
Compile and run:
```bash
javac *.java
java Main
