package BinTree;

public class Main {
    public static void main(String[] args) {
        LeftLeaningRedBlackTree tree = new LeftLeaningRedBlackTree();

        // Добавление элементов в дерево
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);
        tree.insert(1);
        tree.insert(20);


        System.out.println("Содержимое дерева:");
        tree.printTree(); 
    }
}
