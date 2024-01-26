
# E-Commerce API 

This project implements a comprehensive API for an online shopping platform using Java Spring and Spring REST. The API provides a robust and flexible foundation for building a feature-rich e-commerce system, offering functionalities.




## Features

- **User MGMT**: Create, view, update, and delete user accounts.
- **Role-based Access Control**: Manage user permissions and authorization levels.
- **Product MGMT**: Add, edit, and manage product listings with detailed information.
- **Order MGMT**: Process, track, and fulfill orders placed by users.
- **Shipping Address MGMT**: Store and manage customer shipping addresses.
- **Payment Integration**: Integrate with payment gateways for secure transactions.
- **Discount and Promotion MGMT**: Offer discounts and promotions to attract customers.
- **Review and Rating System**: Allow users to review and rate products and sellers.
- **Permission MGMT**: Control user access to specific functionalities and resources.
## API Reference

**User Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/users` | GET | Get all users | None | List<User> |
| `/api/users/{id}` | GET | Get a user by ID | id (Long) | User |
| `/api/users` | POST | Create a new user | User object | User |
| `/api/users/{id}` | PUT | Update an existing user | id (Long), User object | User |
| `/api/users/{id}` | DELETE | Delete a user | id (Long) | Void |

**Role Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/roles` | GET | Get all roles | None | List<Role> |
| `/api/roles/{id}` | GET | Get a role by ID | id (Long) | Role |

**Product Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/products` | GET | Get all products | None | List<Product> |
| `/api/products/{id}` | GET | Get a product by ID | id (Long) | Product |
| `/api/products` | POST | Create a new product | Product object | Product |
| `/api/products/{id}` | PUT | Update an existing product | id (Long), Product object | Product |
| `/api/products/{id}` | DELETE | Delete a product | id (Long) | Void |

**Order Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/orders` | GET | Get all orders | None | List<Order> |
| `/api/orders/{id}` | GET | Get an order by ID | id (Long) | Order |
| `/api/orders` | POST | Create a new order | Order object | Order |
| `/api/orders/{id}` | PUT | Update an existing order | id (Long), Order object | Order |
| `/api/orders/{id}` | DELETE | Delete an order | id (Long) | Void |

**Order Items Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/orderItems` | GET | Get all order items | None | List<OrderItems> |
| `/api/orderItems/{id}` | GET | Get an order item by ID | id (Long) | OrderItems |

**Shipping Address Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/shippingAddresses` | GET | Get all shipping addresses | None | List<ShippingAddress> |
| `/api/shippingAddresses/{id}` | GET | Get a shipping address by ID | id (Long) | ShippingAddress |
| `/api/shippingAddresses` | POST | Create a new shipping address | ShippingAddress object | ShippingAddress |
| `/api/shippingAddresses/{id}` | PUT | Update an existing shipping address | id (Long), ShippingAddress object | ShippingAddress |
| `/api/shippingAddresses/{id}` | DELETE | Delete a shipping address | id (Long) | Void |

**Payment Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/payments` | GET | Get all payments | None | List<Payment> |
| `/api/payments/{id}` | GET | Get a payment by ID | id (Long) | Payment |

**Discount Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/discounts` | GET | Get all discounts | None | List<Discount> |
| `/api/discounts/{id}` | GET | Get a discount by ID | id (Long) | Discount |

**Review Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/reviews` | GET | Get all reviews | None | List<Review> |
| `/api/reviews/{id}` | GET | Get a review by ID | id (Long) | Review |

**Permission Endpoints**

| Endpoint | Method | Description | Parameters | Return Type |
|---|---|---|---|---|
| `/api/permissions` | GET | Get all permissions | None | List<Permission> |
| `/api/permissions/{id}` | GET | Get a permission by ID | id (Long) | Permission |## Deployment

**Prerequisites:**

- Java Development Kit (JDK) 8 or later
- Maven Tool
- DBMS

**Database Init**

1. Create a database with a name of your choice.
2. Import the `db.sql` file into the newly created database:



**Installation Steps:**

1. Clone the repository:
   ```bash
   git clone 
   ```
2. Install dependencies:
   - Maven: `mvn install`
  

**Configuration:**

1. **Database Configuration (if using a database):**
   - Modify the `application.properties` file in the `src/main/resources` directory:
     - Set the `spring.datasource.url` property to the JDBC URL of your database.
     - Set the `spring.datasource.username` and `spring.datasource.password` properties to your database credentials.


2. **Running the API Server:**
 Maven: `mvn spring-boot:run`


3. **Accessing the API:**
- Once the server is running, the API endpoints will be accessible at: http://localhost:8080/api/
