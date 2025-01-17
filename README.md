# Smart Invoice Management System

## Overview

The Smart Invoice Management System is a comprehensive solution designed to automate and streamline the process of managing invoices. This system leverages a microservices architecture to ensure scalability, flexibility, and ease of maintenance. It includes features such as invoice generation, client and product management, authentication, and real-time analytics.

## Features

- **Service Discovery**: Utilizes Eureka for service registry and discovery.
- **API Gateway**: Centralized API Gateway for routing requests to appropriate services.
- **Authentication and Authorization**: Secure user authentication and authorization using Spring Security and OAuth2.
- **Invoice Management**: Automated invoice generation and management.
- **Client and Product Management**: Efficient handling of client and product data.
- **Real-Time Analytics**: Dashboard for real-time monitoring and reporting of invoice data.
- **Containerization**: Dockerized services for consistent deployment across environments.
- **Monitoring and Logging**: Integrated monitoring and logging using Prometheus, Grafana, and ELK stack.

## Project Structure

### Services Overview

1. **Eureka Discovery Service**:
   - Acts as the service registry to enable service discovery.
   - Accessible on port `8761`.

2. **Gateway Service**:
   - Acts as the API Gateway for routing requests to the appropriate services.
   - Accessible on port `8888`.

3. **Auth Service**:
   - Manages authentication and user data.
   - Accessible on port `8081`.
   - Uses a PostgreSQL database `auth_db`.

4. **Client Service**:
   - Handles client data management.
   - Accessible on port `8082`.
   - Uses a PostgreSQL database `client_db`.

5. **Product Service**:
   - Manages product data.
   - Accessible on port `8083`.
   - Uses a PostgreSQL database `product_db`.

6. **Invoice Service**:
   - Handles invoice generation and management.
   - Accessible on port `8084`.
   - Uses a PostgreSQL database `invoice_db`.

7. **Frontend UI**:
   - Provides a user interface for interacting with the system.
   - Accessible on port `4200`.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/ghabianis/Invoice-Mangement-System-SpringBoot-MicroServices.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Invoice-Mangement-System-SpringBoot-MicroServices
   ```

3. Start the services using Docker Compose:
   ```bash
   docker-compose up --build
   ```

4. Access the services using the following ports:
   - Eureka Discovery Service: `http://localhost:8761`
   - Gateway Service: `http://localhost:8888`
   - Frontend UI: `http://localhost:4200`

## Technologies Used

- **Backend**: Java, Spring Boot, RESTful APIs
- **Frontend**: Angular
- **Machine Learning**: TensorFlow, Python
- **Containerization**: Docker, Docker Compose
- **Version Control**: Git
- **Database**: PostgreSQL, MongoDB
- **Messaging**: RabbitMQ, Apache Kafka
- **Security**: Spring Security, OAuth2
- **Monitoring & Logging**: Prometheus, Grafana, ELK stack (Elasticsearch, Logstash, Kibana)
