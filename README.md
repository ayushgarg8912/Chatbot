# Webhook Message Response API

## 📌 Overview

This project is a simple RESTful API built using **Spring Boot** that acts as a webhook to process incoming messages and return appropriate responses.

The API accepts HTTP POST requests at the `/webhook` endpoint with a JSON payload containing a message. Based on predefined logic, it returns a suitable response.

---

## 🚀 Features

* REST API built with Spring Boot
* JSON request and response handling
* Case-insensitive message processing
* Simple rule-based chatbot logic
* Easy testing using Postman

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Maven

---

## 📂 Project Structure

```
src/main/java/
│── controller/
│   └── Controller.java
│── model/
│   └── MessageRequest.java
```

---

## 🔗 API Endpoint

### POST /webhook

#### Request Body (JSON)

```json
{
  "message": "Hi"
}
```

#### Response Examples

| Input     | Output             |
| --------- | ------------------ |
| Hi        | Hello              |
| hi        | Hello              |
| Bye       | Goodbye            |
| Any other | I don't understand |

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone <your-repo-link>
```

2. Navigate to project directory:

```bash
cd <project-folder>
```

3. Run the application:

```bash
mvn spring-boot:run
```

4. Server will start at:

```
http://localhost:8080
```

---

## 🧪 Testing with Postman

* Method: POST
* URL: `http://localhost:8080/webhook`
* Headers:

  * Content-Type: application/json
* Body:

```json
{
  "message": "Hi"
}
```

---

## 💡 Future Improvements

* Add more chatbot commands
* Integrate database for storing messages
* Add JWT authentication
* Connect with frontend or messaging apps

---

## 👨‍💻 Author

Ayush Garg

---

## 📜 License

This project is open-source and free to use.
