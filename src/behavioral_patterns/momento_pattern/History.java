package behavioral_patterns.momento_pattern;

import java.util.Stack;

class History {

    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        return history.pop();
    }
}
