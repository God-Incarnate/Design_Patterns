package behavioral_patterns.template_pattern;

/*
9️⃣ Template Method Pattern
1️⃣ Purpose

The Template Method Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a base class, while allowing subclasses to override specific steps of the algorithm.

In simple terms:

The overall algorithm structure is fixed, but some steps can vary depending on the subclass.

Concept:

Template Method (Algorithm)
   |
Step1()
Step2() → implemented by subclass
Step3() → implemented by subclass

The base class controls the sequence of steps, while subclasses customize specific parts.

2️⃣ Real-World Analogy
☕ Making a Beverage

Imagine making a beverage like tea or coffee.

General process:

1. Boil water
2. Brew
3. Pour into cup
4. Add condiments

Some steps differ:

Beverage	Brew Step	Condiments
Tea	Steep tea leaves	Lemon
Coffee	Brew coffee beans	Sugar + Milk

So:

Algorithm = same
Some steps = different

The Template Method Pattern captures this idea.

3️⃣ Problem Without Template Method

Suppose we write separate classes.

Tea class
class Tea {

    void prepareTea() {

        boilWater();
        steepTea();
        pourInCup();
        addLemon();
    }
}
Coffee class
class Coffee {

    void prepareCoffee() {

        boilWater();
        brewCoffee();
        pourInCup();
        addSugarAndMilk();
    }
}

Problems:

Problem	Explanation
Code duplication	Common steps repeated
Hard to maintain	Changing algorithm requires multiple updates
No standardized process	Each class defines its own flow

The Template Method Pattern removes duplication.

4️⃣ Template Method Solution

Create an abstract class with the common algorithm.

AbstractClass
   |
TemplateMethod()
   |
Concrete subclasses override steps

The algorithm structure stays fixed.

5️⃣ Structure of Template Method Pattern

General structure:

Client
  |
AbstractClass
  |
TemplateMethod()
  |
-----------------------
|                     |
ConcreteClassA     ConcreteClassB
6️⃣ Components of Template Method
Component	Role
Abstract Class	Defines algorithm skeleton
Template Method	Defines algorithm steps
Primitive Operations	Steps implemented by subclasses
Concrete Class	Provides specific implementation
 */
public class TemplateDemo {

    public static void main(String[] args) {

        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
/*
1️⃣1️⃣ Output
Boiling water
Steeping tea leaves
Pouring into cup
Adding lemon

Boiling water
Brewing coffee
Pouring into cup
Adding sugar and milk

Notice:

The algorithm order remains the same.

1️⃣2️⃣ Execution Flow

Step 1 — Client calls template method

prepareRecipe()

Step 2 — Base class controls flow

boilWater()
brew()
pourInCup()
addCondiments()

Step 3 — Subclass provides custom steps

1️⃣3️⃣ Visual Flow
Client
  |
Beverage (Abstract)
  |
prepareRecipe()
  |
------------------------
|                      |
Tea                  Coffee
 */