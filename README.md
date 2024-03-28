**User Location Spring Boot API**
This project implements a Spring Boot application with a REST API for managing user locations.

**Features**
User Roles:
ADMIN: CRUD (Create, Read, Update, Delete) operations on user location data.
READER: View nearest N users based on location data.
Database: HSQLDB in-memory database (no manual table creation required).
REST APIs:
POST /create_data: Creates a table named user_location with user name, latitude, and longitude fields.
PUT /update_data: Updates user location data based on user name.
GET /get_users/{N}: Retrieves the N nearest users from a provided location (0,0 by default).

**User Roles and Access Control**
The application utilizes Spring Security to enforce role-based access control. Users can be assigned either ADMIN or READER roles:

**ADMIN**: Authorized for all API endpoints (create, read, update, and delete).
**READER**: Limited to the GET /get_users/{N} endpoint to retrieve nearest users.

**Technologies Used**
Spring Boot
Spring Security
HSQLDB

**Running the Application**
Clone the repository.
Install dependencies using Gradle: ./gradlew build
Run the application: ./gradlew bootRun

**Code Quality**
Unit tests ensure core functionality.
Checkstyle configuration promotes code readability and maintainability.

**Further Enhancements**
Integrate with a real database like MySQL or PostgreSQL.
Enhance location search algorithm with geospatial libraries.
