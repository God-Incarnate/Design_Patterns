package behavioral_patterns.visitor_pattern;

/*
🔟 Visitor Pattern
1️⃣ Purpose

The Visitor Pattern is a behavioral design pattern that separates an algorithm (operation) from the object structure on which it operates.

In simple terms:

It allows you to add new operations to existing object structures without modifying those classes.

Concept:

Object Structure  →  Accept Visitor
Visitor           →  Perform Operation

So instead of modifying the objects, we add operations using visitors.

2️⃣ Why Visitor Pattern is Needed

Imagine we have a collection of different objects.

Example:

Shape
 ├── Circle
 ├── Rectangle
 └── Triangle

Now we want to perform multiple operations:

Calculate area

Calculate perimeter

Render graphics

Export to XML

Without Visitor Pattern:

Circle
 ├── area()
 ├── perimeter()
 ├── render()
 └── exportXML()

Rectangle
 ├── area()
 ├── perimeter()
 ├── render()
 └── exportXML()

Problems:

Problem	Explanation
Code duplication	Same operations repeated
Hard to maintain	New operations require editing every class
Violates Open/Closed Principle	Classes must be modified

Visitor Pattern solves this.

3️⃣ Visitor Pattern Idea

Move operations outside the object classes into visitor classes.

Structure:

Elements (Objects)
       |
   accept(visitor)
       |
     Visitor

Example:

Shape → accept(Visitor)
Visitor → visit(Circle)
Visitor → visit(Rectangle)
4️⃣ Structure of Visitor Pattern

General structure:

Client
  |
Visitor
  |
ConcreteVisitor
  |
Element → accept(visitor)
  |
ConcreteElement
5️⃣ Key Components
Component	Role
Visitor	Interface defining operations
ConcreteVisitor	Implements operations
Element	Interface for objects
ConcreteElement	Actual objects
Client	Uses visitor
 */
public class VisitorDemo {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4,6)
        };

        ShapeVisitor areaVisitor = new AreaVisitor();
        ShapeVisitor displayVisitor = new DisplayVisitor();

        for(Shape shape : shapes) {

            shape.accept(areaVisitor);
            shape.accept(displayVisitor);
        }
    }
}
/*
1️⃣3️⃣ Output
Circle area: 78.53
Drawing Circle radius 5
Rectangle area: 24
Drawing Rectangle 4x6

Notice:

We added two completely different operations without touching shape classes.

1️⃣4️⃣ Execution Flow

Step 1 — Client calls

shape.accept(visitor)

Step 2 — Shape calls visitor

visitor.visit(this)

Step 3 — Visitor performs operation.

This is called Double Dispatch.

1️⃣5️⃣ What is Double Dispatch?

Normal method call:

object.method()

Visitor pattern uses:

visitor.visit(circle)

Method selection depends on:

1️⃣ Visitor type
2️⃣ Element type

Hence double dispatch.

1️⃣6️⃣ Visual Flow
Client
  |
Shape.accept(visitor)
  |
Visitor.visit(shape)
  |
ConcreteVisitor performs operation

Diagram:

     Visitor
       |
   visit(Circle)
   visit(Rectangle)
       |
      Shape
       |
accept(visitor)
 */
