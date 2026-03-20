package behavioral_patterns.momento_pattern;

class EditorMemento {

    private String text;

    public EditorMemento(String text) {
        this.text = text;
    }

    public String getSavedText() {
        return text;
    }
}
