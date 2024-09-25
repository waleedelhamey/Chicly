# Chicly for E-Commerce Fashion
# Project Overview
Chicly is a fashion-focused e-commerce website built using Java Servlet, JSP, JSTL, HTML, CSS, and an ORM for data management. The platform is designed to sell fashion products such as t-shirts, jeans, beanies, and other clothing items. It features a centralized Admin Dashboard where administrators can manage all aspects of the application, including categories, products, and customer orders.
This project provides a streamlined interface for admins to perform CRUD operations on categories and products, ensuring efficient management of an online fashion store. The platform does not have a public-facing customer interface but is focused solely on backend administration.
________________________________________
# Features
•	Admin Dashboard: A user-friendly dashboard for managing the entire platform.
•	Category Management: Add, update, delete, and view categories (e.g., tops, bottoms, accessories).
•	Product Management: Full CRUD functionality for fashion items such as t-shirts, jeans, and more. This includes:
o	Adding new products with details like name, price, description, image, and stock quantity.
o	Updating product details as necessary.
o	Removing outdated or unavailable items from the catalog.
•	Order Management: View and manage customer orders, track order history, and update order statuses.
•	Customer Management: View customer profiles, track their order history, and manage customer data.
•	Session Management: Admin sessions are handled securely, ensuring that only authorized personnel can manage the system.
________________________________________
# Technologies Used
•	Java Servlet: For handling HTTP requests and responses.
•	JSP & JSTL: To dynamically generate HTML pages based on data and business logic.
•	HTML & CSS: To build and style the website's front-end interface.
•	ORM: Used for seamless interaction between the Java application and the database, simplifying data persistence.
•	Bootstrap: For responsive design, ensuring the admin dashboard works well across different devices.
________________________________________
# Project Objectives
•	To provide a backend system for efficiently managing a fashion e-commerce store.
•	To allow administrators to easily add, update, and delete products and categories.
•	To give administrators full control over customer orders, tracking, and management.
•	To ensure a smooth and user-friendly admin interface for overseeing the e-commerce platform.
________________________________________
# How to Run
1.	Clone the Repository:
bash
Copy code
git clone https://github.com/your-repo/chicly.git
2.	Set Up Database: Ensure you have a running instance of the database and the necessary tables for categories, products, and orders.
3.	Deploy the Application:
o	Deploy the WAR file on a Java Servlet container like Apache Tomcat.
o	Configure the database connection in the ORM layer.
4.	Access the Admin Dashboard:
o	After deploying, visit http://localhost:8080/chicly/admin to access the Admin Dashboard.
o	Use the credentials set in the database to log in as an admin.
________________________________________
# Admin Dashboard Highlights
•	Simple and Clean UI: The admin dashboard is designed with simplicity in mind. All the key management features are easily accessible from the sidebar, and product details are displayed in a structured format.
•	Black and White Theme: The dashboard follows a minimalist black-and-white design, keeping the interface professional and easy to navigate.
•	Responsive Design: Built using Bootstrap, the dashboard ensures optimal functionality on both desktop and mobile devices.
________________________________________
# Conclusion
Chicly is a robust and scalable solution for managing a fashion e-commerce business. With its powerful admin dashboard, it provides all the tools necessary for efficiently handling categories, products, and orders. Built with cutting-edge web technologies, it offers a smooth and professional experience for e-commerce administrators.
