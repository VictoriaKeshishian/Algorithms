package BinTree;

class Node {

    int key;
    Node left;
    Node right;
    boolean color;

    public Node(int key) {
        this.key = key;
        this.color = true;
    }
}

    class LeftLeaningRedBlackTree {

        private static final boolean RED = true;
        private static final boolean BLACK = false;

        Node root;

        // Метод добавления элемента в дерево
        public void insert(int key) {
            root = insert(root, key);
            root.color = BLACK;

        }

        // Вспомогательный рекурсивный метод для вставки элемента
        private Node insert(Node node, int key) {
            if (node == null) {
                return new Node(key);
            }

        // Обычная вставка в бинарное дерево поиска

        if(key < node.key) {
            node.left = insert(node.left, key);
        }else if (key > node.key) {
            node.right = insert(node.right, key);
        }else {
            return node;
        }

        // Балансировка дерева после вставки

        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }

        // Проверка цвета узла (красный или черный)

        private boolean isRed(Node node) {
            if (node == null) {
                return false; // Пустой узел считается черным
            }
            return node.color == RED;
        }

        // Вспомогательный метод для поворота вправо

        private Node rotateRight(Node node){
            Node newRoot = node.left;
            node.left = newRoot.right;
            newRoot.right = node;
            newRoot.color = node.color;
            node.color = RED;
            return newRoot;
        }

        // Вспомогательный метод для поворота влево
        
        private Node rotateLeft(Node node){
            Node newRoot = node.right;
            node.right = newRoot.left;
            newRoot.left = node;
            newRoot.color = node.color;
            node.color = RED;
            return newRoot;
        }

        // Вспомогательный метод для переключения цветов

        private void flipColors(Node node) {
            node.color = RED;
            node.left.color = BLACK;
            node.right.color = BLACK;
            return; 
        }

        // Метод для вывода содержимого дерева
        public void printTree() {
            if (root != null) {
                printTree(root, 0);
            }
        }

    // Вспомогательный рекурсивный метод для вывода содержимого дерева

        private void printTree(Node node, int level) {
            if (node != null) {
                printTree(node.right, level + 1); // Рекурсивно обрабатываем правое поддерево

                // Добавляем отступы для текущего уровня
                for (int i = 0; i < level; i++) {
                    System.out.print("    ");
                }

                // Выводим значение узла
                System.out.println(node.key + (node.color ? " (R)" : " (B)"));

                printTree(node.left, level + 1); // Рекурсивно обрабатываем левое поддерево
            }
        }

    }

