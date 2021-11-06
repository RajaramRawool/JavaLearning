package javacourse.codingexercises.oops.abstractclasses;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem rightLink);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem lefLink);
    abstract int compareTo(ListItem listItem);




}
