package structural_patterns.flyweight_pattern;

/*
1️⃣ What is the Flyweight Pattern?

The Flyweight Pattern is a Structural Design Pattern used to reduce memory usage by sharing objects instead of creating many similar ones.

In simple terms:

Instead of creating many identical objects, we reuse shared objects from a pool.

This is especially useful when an application needs a very large number of similar objects.

2️⃣ Real-Life Analogy
🌳 Forest Example

Imagine a game rendering a forest with 1 million trees.

Each tree might contain:

Tree Type
Texture
Color
Height
Position

If every tree object stores all this data, memory usage becomes huge.

But actually:

Tree Type
Texture
Color

are same for many trees.

Only this is unique:

Position
Height

Solution:

Shared data → Flyweight object

Unique data → passed externally

3️⃣ Core Idea of Flyweight Pattern

Objects are divided into two types of state.

State Type	Description
Intrinsic State	Shared data stored inside flyweight
Extrinsic State	Unique data provided by client

Example:

Intrinsic: Character = 'A'
Extrinsic: Font Size, Position
4️⃣ Structure of Flyweight Pattern
Client → FlyweightFactory → Flyweight Objects

Detailed structure:

        Client
           |
     FlyweightFactory
           |
     -------------------
     |        |        |
 Flyweight  Flyweight  Flyweight
5️⃣ Components of Flyweight Pattern
Component	Role
Flyweight	Shared object
ConcreteFlyweight	Actual implementation
FlyweightFactory	Manages object pool
Client	Uses flyweights
 */
public class FlyWeightDemo {

    public static void main(String[] args) {

        CharacterFlyWeight a1 =
                CharacterFactory.getChar('A');

        CharacterFlyWeight a2 =
                CharacterFactory.getChar('A');

        System.out.println(a1 == a2); // true
    }
}
/*
Execution:

First call:

Factory creates new object

Second call:

Factory returns existing object



1️⃣1️⃣ Memory Visualization

Without Flyweight:

A → Object1
A → Object2
A → Object3

Memory waste.

With Flyweight:

A → SharedObject

All references point to the same object.

1️⃣2️⃣ Object Identity Check
System.out.println(a1 == a2);

Output:

true

Meaning:

Both references point to same object
1️⃣3️⃣ Visual Flow
Client
   |
CharacterFactory
   |
---------------------
|                   |
'A'            CharacterFlyweight

Second request for 'A':

Client
   |
CharacterFactory
   |
Returns existing object
 */