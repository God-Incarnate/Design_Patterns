package behavioral_patterns.iterator_pattern;

/*
7️⃣ Iterator Pattern
1️⃣ Purpose

The Iterator Pattern is a behavioral design pattern that provides a way to traverse elements of a collection sequentially without exposing its internal structure.

In simple terms:

It allows you to access elements of a collection one by one without knowing how the collection is implemented.

Concept:

Collection → Iterator → Elements

Instead of the client directly accessing the collection structure (array, list, tree), it uses an iterator object.

2️⃣ Problem Without Iterator Pattern

Suppose we have a custom collection:

class BookCollection {
    String[] books = {"Java", "Spring", "Docker"};
}

To iterate:

for(int i = 0; i < books.length; i++) {
    System.out.println(books[i]);
}

Problems:

Problem	Explanation
Exposes internal structure	Client knows it is an array
Tightly coupled	If structure changes, client code breaks
Different traversal logic	Arrays, lists, trees require different loops

Example:

Array → for loop
LinkedList → pointer traversal
Tree → DFS/BFS

The Iterator Pattern solves this by providing a uniform traversal mechanism.

3️⃣ Iterator Pattern Solution

Introduce an Iterator object.

Client → Iterator → Collection

The client asks the iterator for elements instead of accessing the collection directly.

Example usage in Java:

Iterator<String> iterator = list.iterator();

while(iterator.hasNext()) {
    System.out.println(iterator.next());
}

The client does not know whether the list is an array or linked list.

4️⃣ Real-World Analogy
📚 Library Book Shelf

You want to read books sequentially.

You don't care whether the shelf is:

arranged by stacks

arranged by rows

arranged in boxes

You just want a person who hands you the next book.

That person is the Iterator.

Bookshelf → Librarian (Iterator) → Next Book
5️⃣ Structure of Iterator Pattern

General structure:

Client
  |
Iterator Interface
  |
ConcreteIterator
  |
Aggregate Interface
  |
ConcreteAggregate
6️⃣ Components of Iterator Pattern
Component	Role
Iterator	Interface for traversal
ConcreteIterator	Implements traversal logic
Aggregate	Collection interface
ConcreteAggregate	Actual collection
Client	Uses iterator
 */
public class IteratorDemo {

    public static void main(String[] args) {

        BookCollection books = new BookCollection();

        Iterator iterator = books.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
1️⃣1️⃣ Output
Java
Spring
Microservices
1️⃣2️⃣ Execution Flow

Step 1 – Client asks collection for iterator

books.getIterator()

Step 2 – Iterator tracks current position

index = 0

Step 3 – hasNext() checks if element exists

Step 4 – next() returns element

1️⃣3️⃣ Visual Flow
Client
  |
Iterator
  |
BookIterator
  |
BookCollection
  |
Books

The iterator controls traversal.

1️⃣4️⃣ Real Use in Java Collections

The Iterator Pattern is heavily used in:

ArrayList

HashSet

HashMap

LinkedList

Example:

import java.util.ArrayList;
import java.util.Iterator;

ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Python");

Iterator<String> it = list.iterator();

while(it.hasNext()) {
    System.out.println(it.next());
}

Here:

Object	Role
ArrayList	Aggregate
Iterator	Iterator interface
ArrayListIterator	ConcreteIterator
 */
