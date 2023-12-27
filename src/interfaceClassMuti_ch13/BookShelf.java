package interfaceClassMuti_ch13;

public class BookShelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) {
        addShelf(title);
    }

    @Override
    public void deQueue() {
        deleteShelf();
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
