/**
 * BinaryTree
 * Created by Ryabenkiy Sergey on 01.07.2015 17:38.
 */
public class Node {

    public int iData; // Данные, используемые в качестве ключа
    public double dData; // Другие данные
    public Node leftChild; // Левый потомок узла
    public Node rightChild; // Правый потомок узла
    public void displayNode() // Вывод узла
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }

}
