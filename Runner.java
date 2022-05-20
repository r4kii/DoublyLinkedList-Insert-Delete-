public class Runner {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertElement(8);
        dll.insertElement(7);
        dll.insertElement(9);
        dll.insertElement(11);
        dll.insertElement(94);
        dll.show();
        System.out.println("Deleted element:"+dll.delete(4));
        dll.show();
        System.out.println("Deleted element:"+dll.delete(3));
        dll.show();
        System.out.println("Deleted element:"+dll.delete(3));
        dll.show();
        //dll.revshow();

    }
}
