public class Lista {

    public class Nodo {
        Integer dato_tipo_int;
        Nodo next;

        public Nodo(int elem){
            this.dato_tipo_int = elem;
            this.next = null;
        }
    }

    Nodo testa;

    // costruttore per definire una lista vuota
    public Lista(){
        this.testa = null;
    }

    //metodo per verificare se la lista è vuoto
    public boolean isEmpty(){
        return  this.testa == null;
    }

    public void push(int numeroIntero){
        Nodo nodo = new Nodo(numeroIntero);
        nodo.next = testa;
        testa = nodo;
    }

    public void append(int numeroIntero){
        if(isEmpty()){
            push(numeroIntero);
        }else{

            Nodo nodo = new Nodo (numeroIntero);
            Nodo temp = testa;

            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = nodo;
        }
    }

    public int pop(){
        int k = testa.dato_tipo_int;
        testa = testa.next;
        return k;
    }

    public void rimuovi(int numeroIntero){
        if(isEmpty()){
            System.out.println("Lista vuota");
        }

        if(testa.dato_tipo_int.equals(numeroIntero)){
            pop();
        }

        Nodo temp = testa;

        while(temp.next != null && !temp.next.dato_tipo_int.equals(numeroIntero)){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public void stampaDellaLista() {
        Nodo node = testa;
        while (node != null){
            System.out.print(node.dato_tipo_int +",");
            node = node.next;
        }
    }

    /* come funziona il metodo di inserimento - l'elemento viene inserito in ultima posizione:

    per prima cosa creamo un nodo con il dato ricevuto in ingresso
    a questo punto verifichiamo se è presente una testa ( ossia se esiste o meno una lista )
    se la testa non è presente il nostro nodo sarà la testa
    altrimenti facciamo un ciclo while e fintato che non viene trovata la testa andiamo avanti

    */
    public void metodoInserimento(int numeroIntero) {

        Nodo node = new Nodo(numeroIntero);

        if (testa == null) {
            testa = node;
        } else {
            Nodo n = testa;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    /* come funziona il metodo di stampa :

    per prima cosa creamo un nodo uguale alla testa
    facciamo un ciclo while e fintato che non viene trovata la testa andiamo avanti stampando ogni risultato

    */

    public void BubbleSort(){
    }
}
