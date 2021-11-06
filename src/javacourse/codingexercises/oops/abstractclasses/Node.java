package javacourse.codingexercises.oops.abstractclasses;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return null;
    }

    @Override
    ListItem setNext(ListItem rightLink) {
        this.leftLink = rightLink;
        return null;
    }

    @Override
    ListItem previous() {
        return null;
    }

    @Override
    ListItem setPrevious(ListItem lefLink) {
        this.leftLink = lefLink;
        return null;
    }

    @Override
    int compareTo(ListItem listItem) {
        return 0;
    }
}
