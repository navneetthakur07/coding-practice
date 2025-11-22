# Stream API Question Paper

## 🟢 EASY LEVEL (Fundamentals & Syntax)

Focus: filtering, mapping, simple collectors, method references.

1. Given a list of integers, find all even numbers using Stream API.
2. Convert a list of strings to uppercase using `map()`.
3. Given a list of names, print each name using a method reference.
4. Count how many strings in a list start with the letter “A”.
5. Sort a list of integers in ascending order using streams.
6. Find the maximum number in a list using `max()` and `Comparator`.
7. Find the first element greater than 10 in a list.
8. Convert a list of numbers to their squares and collect into a new list.
9. Given a list of strings, remove all empty strings using `filter()`.
10. Use method reference to print all elements of a list (`System.out::println`).

---

## 🟡 MEDIUM LEVEL (Transformations & Aggregations)

Focus: grouping, reducing, collecting, flatMap, Optional handling.

1. Given a list of integers, find the sum of all even numbers using `reduce()`.
2. Find the average length of strings in a list.
3. Given a list of names, group them by their first letter.
4. Flatten a list of lists (e.g., `List<List<Integer>>`) into a single list of integers using `flatMap()`.
5. Given a list of transactions, find the total value of all transactions.

```java
class Transaction { int id; int amount; String type; }

```

1. Find all distinct characters used in a list of words.
2. Given a list of employees, find the names of employees older than 30 sorted by age.

```java
class Employee { String name; int age; double salary; }

```

1. Given a list of numbers, find the second highest number using Stream API only.
2. Partition a list of integers into even and odd using `Collectors.partitioningBy()`.
3. Join all strings in a list with a comma separator using `Collectors.joining(", ")`.

---

## 🔴 HARD LEVEL (Complex Operations & Performance)

Focus: nested streams, parallel streams, advanced collectors, custom grouping, performance understanding.

1. Given a list of employees, group them by department and calculate the average salary per department.

```java
class Employee { String name; String department; double salary; }

```

1. Find the highest-paid employee in each department.
2. Given a list of books, return a map of author → list of book titles written by that author.

```java
class Book { String title; String author; double price; }

```

1. Find the top 3 highest-paid employees across all departments using Streams.
2. Given a list of sentences, return the top 5 most frequent words.
3. Parallel Streams: calculate the sum of 1 million numbers efficiently.
4. Given a list of orders, find the most frequently ordered product.

```java
class Order { int orderId; List<String> products; }

```

1. Use `reduce()` to implement custom logic:

   e.g., concatenate all strings with a delimiter and handle empty lists gracefully.

2. Create a custom collector to find the product (multiplication) of all numbers in a stream.
3. Given a nested structure (List<List<List<Integer>>>), flatten it completely and compute the sum of all integers.