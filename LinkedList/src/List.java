public class List {

    public class Node {
        int data;
        Node next;

    }

    Node head;  // creo un nodo testa

    public void insert(int data) {  // creo un metodo insert permette di inserire un nodo nella nostra lista
        Node node = new Node(); // creo un nodo
        node.data = data; // assegno il valore ricevuto in input al nodo
        node.next = null; // assegno il valore null come prossimo nodo

        if (head == null) {
            head = node;  // se la testa è vuota assegno il nodo creato alla testa
        } else {
            Node n = head; // altrimenti creo un nodo n e lo assegno alla testa
            while (n.next != null) {
                n = n.next; // finchè il prossimo nodo non è null assegno il prossimo nodo a n
            }
            n.next = node; // quando il prossimo nodo è null assegno il nodo creato a n
        }
    }

    public void show() {
        Node node = head;
        do {
            System.out.println(node.data);
            node = node.next;
        }while (node != null);
    }

    public void BubbleSort(){
    }
}
