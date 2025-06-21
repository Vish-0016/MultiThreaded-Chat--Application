# MultiThreaded-Chat--Application

This project is a simple **client-server chat application** built using Java **sockets** and **multithreading**. It allows multiple clients to connect to a server and exchange messages in real time.

---

## 🛠 Features

- ✅ Server handles multiple clients simultaneously
- ✅ Clients can send messages that are broadcast to all connected users
- ✅ Multithreaded design keeps chat responsive
- ✅ Real-time communication using `Socket` and `ServerSocket`

---

## 📁 File Structure

```
task3/
├── ChatServer.java   # Main server program
├── ChatClient.java   # Client program for users
```

---

## ▶️ How to Run

### 1️⃣ Compile the files
```bash
javac ChatServer.java
javac ChatClient.java
```

### 2️⃣ Start the Server (in one terminal)
```bash
java ChatServer
```

### 3️⃣ Start Clients (in separate terminals)
```bash
java ChatClient
```

You can run multiple clients to simulate different users.

---

## 📤 Sample Output

### 💻 Server Terminal
```
Chat server started on port 1234
New client connected: Socket[addr=/127.0.0.1,port=53642,localport=1234]
```

### 👤 Client A
```
Connected to chat server
Enter your message: Hello everyone!
```

### 👤 Client B
```
Connected to chat server
Enter your message: Hi! How are you?
```

### 🔄 Server Logs
```
Client: Hello everyone!
Client: Hi! How are you?
```

---

## ❗ Common Errors

- **BindException: Address already in use**  
  → Port is already used. Close previous server or change port number.

- **NullPointerException on InputStream**
  → Make sure the `Socket` is correctly initialized in `ChatClient`.

---

## 🧑‍💻 Author

Intern: Vishakha Kandrikar  
Task: Task 3 – Java Programming Internship

---

## 📜 License

This project is for educational purposes as part of a Java internship.
