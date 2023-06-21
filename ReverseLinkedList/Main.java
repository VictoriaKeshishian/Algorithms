package ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Создаем односвязный список
        LinkedList.Node head = linkedList.createNode();

        // Выводим исходный список
        System.out.println("Исходный список:");
        linkedList.printLinkedList(head);

        // Разворачиваем список
        head = linkedList.Reverse(head);

        // Выводим развернутый список
        System.out.println("Развернутый список:");
        linkedList.printLinkedList(head);
    }
}

