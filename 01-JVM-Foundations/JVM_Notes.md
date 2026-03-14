# Days 1–2: JVM Architecture & Memory Mastery

## 👶 ELI10 (The Translator)
Java is like a "Universal Remote." You write the code once, but it needs to work on Samsung, Sony, and LG TVs (Windows, Mac, Linux).
1. You write `.java` code.
2. The compiler turns it into `.class` (Bytecode).
3. The **JVM** is the player that reads that Bytecode and makes it run on any specific machine.

## 🏗️ Senior Technical Depth
### 1. Memory Areas (The Big Two)
* **Stack:** Stores primitive variables and method call "frames." It is private to each thread and very fast (LIFO). 
  * *Error:* `StackOverflowError` (Recursion without end).
* **Heap:** The big playground where all **Objects** live. Shared by all threads.
  * *Error:* `OutOfMemoryError` (Creating too many objects).
* **Metaspace:** Stores class-level data (metadata). It replaced PermGen and lives in native memory.

### 2. Execution Engine
* **JIT (Just-In-Time) Compiler:** It doesn't just read code; it optimizes it. If it sees a loop running 1,000 times, it compiles it directly to "Machine Code" so it runs at lightning speed.
* **Garbage Collector (GC):** The automated cleanup crew. It finds objects in the Heap that no one is using and deletes them.