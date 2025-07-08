#  Quantum Bookstore

This project demonstrates a simple object-oriented implementation of a bookstore system in Java. The system includes a base abstract class, multiple book types, and a management class for the bookstore itself.

##  Structure Overview

###  `Book` (Abstract Base Class)
- Acts as the parent class for all book types.
- Contains **common properties** such as:
  - `isbn`, `title`, `publishYear`, `price`, and `is_for_sale`.
- Includes a **`buy(quantity)`** method to calculate the total cost.
- The `is_for_sale` boolean indicates whether the book is available for purchase.

###  `EBook`, `PrintedBook`, etc.
- Extend the `Book` base class.
- Each subclass adds its own specific attributes (e.g., `fileType` for `EBook`).
- Override the `buy()` method with custom pricing logic if needed.

###  `BookstoreManager`
- Manages a **list of all books** in the library (encapsulated to prevent external modification).
- Provides key functions:
  - `addBook(Book book)`: Adds a book to the collection.
  - `removeBook(Book book)`: Removes a specific book.
  - `buyBook(String isbn, int quantity)`: Allows users to purchase a book by its ISBN.
  - `removeOutdatedBooks(int year)`: Deletes outdated books and returns them as a list.
- Throws exceptions for invalid operations to enforce encapsulation and safety.

##  Example Output
Below are sample screenshots showing the program's output .


