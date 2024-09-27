# Spring MVC Blog

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [File Structure](#file-structure)
- [Contributions](#contributions)
- [License](#license)

## Overview
This project is a Spring MVC web application designed to demonstrate basic CRUD operations for a blogging platform. It allows users to create, view, edit, and delete blog posts. The application showcases the use of Spring MVC for handling web requests, Thymeleaf for rendering dynamic HTML content, and a simple in-memory data structure to manage blog posts.

### Features
- **Post Management**: Create, read, update, and delete blog posts.
- **Thymeleaf Integration**: Utilizes Thymeleaf for dynamic web page content.
- **Form Handling**: Implements form validation for post creation and editing.
- **Session Management**: Demonstrates session handling within the application.

## Usage
1. **Setup and Deployment**:
    - Clone the repository to your local machine.
    - Build the application using your preferred build tool (Maven/Gradle).
    - Run the application.

2. **Access the Application**:
    - Open your web browser and navigate to `http://localhost:8080/posts` to view the list of posts.
    - Use the `/posts/add` endpoint to create a new post.

3. **Interacting with the Application**:
    - Click on a post title to view its details.
    - Use the "Add New Post" button to create a new blog post.
    - Use the edit option to update existing posts.
    - Delete posts to manage your blog content.

## File Structure
- `src/main/java/com/sangarius/springmvcblog/`: Java source files for controllers, models, and repositories.
    - `PostController.java`: Controller for managing blog post requests.
    - `Post.java`: Model class representing a blog post.
    - `User.java`: Model class representing a user.
    - `PostDTO.java`: Data Transfer Object for blog posts.
    - `UserDTO.java`: Data Transfer Object for users.
    - `PostMapper.java`: Mapper for converting between Post and PostDTO.
    - `UserMapper.java`: Mapper for converting between User and UserDTO.
    - `PostRepository.java`: Repository class for managing post storage and retrieval.
    - `UserRepository.java`: Repository class for managing user storage and retrieval.
    - `PostService.java`: Service class for handling business logic related to posts.
    - `UserService.java`: Service class for handling business logic related to users.
    - `ServletInitializer.java`: Class for initializing the Spring application.
    - `SpringMvcBlogApplication.java`: Main class for running the Spring application.

- `src/main/resources/templates/`: Directory for Thymeleaf templates.
    - `postList.html`: Template for displaying the list of blog posts.
    - `postForm.html`: Template for creating and editing blog posts.
    - `postDetail.html`: Template for viewing the details of a specific post.

- `src/main/resources/static/css/`: Directory for CSS stylesheets.
    - `styles.css`: Stylesheet for application styling.

- `src/main/resources/application.properties`: Configuration file for the Spring application.

## Contributions
Contributions, feedback, and suggestions are welcome. If you have any improvements or find issues, please submit a pull request or open an issue.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
