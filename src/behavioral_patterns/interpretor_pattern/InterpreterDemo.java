package behavioral_patterns.interpretor_pattern;

/*
1️⃣1️⃣ Interpreter Pattern
1️⃣ Purpose

The Interpreter Pattern is a behavioral design pattern used to define the grammar of a language and build an interpreter that can evaluate sentences in that language.

In simple terms:

It provides a way to interpret expressions written in a specific language or grammar.

Concept:

Expression (language) → Parser → Interpreter → Result

Examples of languages:

Mathematical expressions

SQL queries

Boolean logic

Custom DSL (Domain Specific Language)

2️⃣ Why Interpreter Pattern is Needed

Suppose we want to evaluate expressions like:

5 + 3
10 - 2
(4 + 5) - 3

Or logical expressions:

A AND B
A OR B
NOT A

Without Interpreter Pattern we might write:

if(expression.equals("A AND B")) { ... }
else if(expression.equals("A OR B")) { ... }

Problems:

Problem	Explanation
Hard to extend	Adding new grammar rules is difficult
Messy code	Large if-else chains
No structure	Grammar rules not represented clearly

The Interpreter Pattern models grammar as objects.

3️⃣ Core Idea

Each grammar rule becomes a class.

Example grammar:

Expression → Number | Add | Subtract
Add → Expression + Expression
Subtract → Expression - Expression

Class representation:

Expression
   |
---------------------
|                   |
Number         Operation
                 |
         ----------------
         |              |
       Add          Subtract

Each class interprets its own part of the expression.

4️⃣ Structure of Interpreter Pattern

General structure:

Client
  |
Context
  |
AbstractExpression
  |
----------------------
|                    |
TerminalExpression  NonTerminalExpression
5️⃣ Key Components
Component	Role
AbstractExpression	Base interface for expressions
TerminalExpression	Represents basic values
NonTerminalExpression	Represents grammar rules
Context	Stores input data
Client	Builds expression tree
 */
public class InterpreterDemo {

    public static void main(String[] args) {

        Expression ten =
                new NumberExpression(10);

        Expression five =
                new NumberExpression(5);

        Expression three =
                new NumberExpression(3);

        Expression add =
                new AddExpression(ten, five);

        Expression result =
                new SubtractExpression(add, three);

        System.out.println(result.interpret());
    }
}
/*
1️⃣2️⃣ Output
12

Because:

(10 + 5) - 3 = 12
1️⃣3️⃣ Execution Flow

Step 1:

Client builds expression tree.

Subtract
   |
Add      3
 |
10   5

Step 2:

Call:

result.interpret()

Step 3:

Recursive evaluation happens.

Add → 10 + 5 = 15
Subtract → 15 - 3 = 12
1️⃣4️⃣ Visual Flow
Client
  |
Build Expression Tree
  |
interpret()
  |
Recursive evaluation
  |
Final Result
1️⃣5️⃣ Real-World Use Cases
1️⃣ SQL Query Parsers

Example:

SELECT * FROM users WHERE age > 30

The database converts SQL into expression trees.

2️⃣ Compilers

Compilers parse languages like:

Java

C++

Python

Using Abstract Syntax Trees (AST).
 */