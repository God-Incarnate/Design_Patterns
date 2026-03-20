package behavioral_patterns.momento_pattern;

class TextEditor {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public EditorMemento save() {
        return new EditorMemento(text);
    }

    public void restore(EditorMemento memento) {
        text = memento.getSavedText();
    }

    public void print() {
        System.out.println(text);
    }
}
