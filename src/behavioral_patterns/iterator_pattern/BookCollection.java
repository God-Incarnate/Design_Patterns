package behavioral_patterns.iterator_pattern;

class BookCollection implements Container {

    String[] books = {"Java", "Spring", "Microservices"};

    public Iterator getIterator() {
        return new BookIterator();
    }
    private class BookIterator implements Iterator {

        int index = 0;

        public boolean hasNext() {
            return index < books.length;
        }

        public Object next() {
            if(this.hasNext())
                return books[index++];
            return null;
        }
    }
}
