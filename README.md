Greedy and Dynamic Programming Problems in Java

This repository contains Java solutions to two algorithmic problems:

Scholarship Distribution — Greedy Algorithm

Maximum Learning Points — Dynamic Programming

Problem 1: Scholarship Distribution

Problem Statement

A college has a limited scholarship budget. Each student has a minimum scholarship amount they are willing to accept. The goal is to award scholarships to the maximum possible number of students without exceeding the available budget.

Approach

Sort all scholarship requirements in increasing order.

Select students starting with the smallest required amount.

Add an amount only if the total remains within the budget.

Stop when the next amount cannot be included.

Choosing the smallest amounts first leaves more budget available and therefore maximizes the number of selected students.

Example

Input

5 20
4 8 2 6 5

Output

4

The sorted requirements are 2, 4, 5, 6, 8. The first four require a total of 17, which is within the budget.

Complexity

Time Complexity: O(N log N)

Space Complexity: O(N)

Problem 2: Maximum Learning Points

Problem Statement

Given the learning points of topics arranged in order, find the maximum points a student can earn without selecting two consecutive topics.

Dynamic Programming Approach

For every topic, there are two choices:

Select the current topic: Add its points to the best result up to two positions before.

Skip the current topic: Keep the best result obtained up to the previous topic.

The recurrence relation is:

dp[i] = max(dp[i - 1], points[i] + dp[i - 2])

Only the previous two DP values are required, so the solution uses constant extra space.

Example

Input

6
5 1 2 10 6 2

Output

17

Topics having 5, 10, and 2 points can be selected. Their total is 17, and no two selected topics are consecutive.

Complexity

Time Complexity: O(N)

Space Complexity: O(1)

Project Structure

Greedy-and-DP-Problems/
├── Problem-1-Scholarship-Distribution/
│   └── Main.java
├── Problem-2-Maximum-Learning-Points/
│   └── Main.java
└── README.md

Requirements

Java Development Kit (JDK) 8 or later

Compile and Run

Scholarship Distribution

cd Problem-1-Scholarship-Distribution
javac Main.java
java Main

Maximum Learning Points

cd Problem-2-Maximum-Learning-Points
javac Main.java
java Main

Enter the input in the format specified for the selected problem.

Concepts Used

Arrays and sorting

Greedy algorithm

Dynamic programming

Space optimization

Fast input handling in Java

Author

Srijan Sendry

B.Tech CSE Student
