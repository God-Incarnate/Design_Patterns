package behavioral_patterns.momento_pattern;

/*
8️⃣ Memento Pattern
1️⃣ Purpose

The Memento Pattern is a behavioral design pattern that allows an object to save its internal state so it can be restored later, without exposing its internal details.

In simple terms:

It provides a way to take snapshots of an object's state and restore them later.

Concept:

Object → Save State → Restore State Later

This is useful for features like:

Undo

Checkpoints

Version history

2️⃣ Real-World Analogy
💾 Game Save System

When you play a game:

Game Progress → Save Game → Load Game Later

Example:

Player position

Health

Inventory

Level

When you load the game:

Game restored to previous state

The saved game file acts like a Memento.

3️⃣ Problem Without Memento Pattern

Suppose we build a text editor with undo functionality.

Example:

class TextEditor {

    private String text;

    public void setText(String text) {
        this.text = text;
    }
}

To implement undo, we might store previous states manually.

Problems:

Problem	Explanation
Breaks encapsulation	Internal state must be exposed
Messy state management	Many copies of object fields
Hard to maintain	Complex logic

The Memento Pattern solves this by storing snapshots in a separate object.

4️⃣ Memento Pattern Solution

Introduce a Memento object that stores the object's state.

Structure:

Originator → Memento → Caretaker

Roles:

Component	Role
Originator	Object whose state is saved
Memento	Snapshot of state
Caretaker	Manages saved states
5️⃣ Structure of Memento Pattern

General structure:

Client
  |
Caretaker
  |
Memento
  |
Originator

Flow:

Originator creates memento

Caretaker stores it

Later the state can be restored
 */
public class MomentoDemo {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Version 1");
        history.save(editor.save());

        editor.setText("Version 2");
        history.save(editor.save());

        editor.setText("Version 3");

        editor.print();

        editor.restore(history.undo());

        editor.print();
    }
}
/*
9️⃣ Execution Flow

Step 1 — Editor creates text

Version 1

Step 2 — Save snapshot

history.save(editor.save())

Step 3 — Modify state

Version 2
Version 3

Step 4 — Undo

editor.restore(history.undo())
🔟 Output
Version 3
Version 2

Undo restores previous version.

1️⃣1️⃣ Visual Flow
        History (Caretaker)
             |
        Stores Mementos
             |
        Memento Objects
             |
        TextEditor (Originator)

Snapshots are stored in the caretaker.

1️⃣2️⃣ Real-World Use Cases
1️⃣ Text Editors

Example:

Microsoft Word

Google Docs

Notepad++

Undo operations.

2️⃣ Game Save Points

Example:

Save Game → Load Game Later

Game state stored as memento.

3️⃣ Database Transactions

Example:

Checkpoint → Rollback

Database can revert to previous state.
 */