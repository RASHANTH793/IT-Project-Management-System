# IT Project Management System

![Java](https://img.shields.io/badge/Java-11-orange.svg)
![Build](https://img.shields.io/badge/build-passing-brightgreen.svg)
![License](https://img.shields.io/badge/license-MIT-blue.svg)

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies](#technologies)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Project Overview

The **IT Project Management System** is designed to manage different types of IT projects, including internal, client, and research projects. It helps organizations manage project deadlines, budgets, and team sizes.

This project  uses Object-Oriented Programming principles such as **inheritance**, **polymorphism**, **abstraction**, and **encapsulation**.

## Features

- Manage multiple types of IT projects.
- Track project deadlines, budgets, and team sizes.
- Automatically calculate project costs.
- Supports different project types (Internal, Client, Research).
  
## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/IT-Project-Management-System.git
    ```

2. Navigate to the project directory:

    ```bash
    cd IT-Project-Management-System
    ```

3. Compile and run the program using the command line or IDE:

    - For **Command Line**:
    
      ```bash
      javac src/*.java
      java src.Main
      ```

    - For **IDE**: Import the project and run the `Main.java` file.

## Usage

Once the program runs, you can add, view, and manage different types of IT projects. Each project type has unique attributes and methods for calculating costs and project details.

1. **Internal Project**: Used for in-house development projects.
2. **Client Project**: Client-based projects with fixed costs and deadlines.
3. **Research Project**: Open-ended projects with exploratory research.

### Example Code:

```java
InternalProject IP = new InternalProject();
IP.setProjectName("Internal Project ABC");
IP.setDeadLine("5 days");
IP.setTeamSize(4);
IP.setBudget(50000);
IP.calculateCost();
