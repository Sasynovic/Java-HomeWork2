public class Lista {

    public class Nodo{

        private VeicoloAutonomo data;
        private Nodo next;

        // Costruttore per creare un nuovo nodo con l'elemento dato
        public Nodo(VeicoloAutonomo elem){
            this.data = elem;
            this.next = null;
        }

    }

    Nodo testa;

    // Costruttore per inizializzare una lista vuota
    public Lista(){
        this.testa = null;
    }

    // Metodo per verificare se la lista è vuota
    public boolean isEmpity(){
        return this.testa == null;
    }

    // inserire in testa un elemento
    public void push(VeicoloAutonomo elem){
        Nodo q = new Nodo(elem); // Crea un nuovo nodo con l'elemento dato
        q.next = this.testa; // Imposta il riferimento next del nuovo nodo alla testa attuale
        this.testa = q; // Aggiorna la testa per essere il nuovo nodo
    }

    public void append(VeicoloAutonomo elem){
        if(isEmpity()){
            push(elem);
        }else{
            Nodo head = testa;
            Nodo q = new Nodo(elem);
            while(head.next != null){
                head = head.next;
            }
            head.next = q;
        }
    }

    public void insert(VeicoloAutonomo elem){
        if(this.isEmpity() || testa.data.compareTo(elem) > 0){
            this.push(elem);
        }else{
            Nodo q = new Nodo(elem); // creo un nodo
            q.data = elem; // assegno il valore ricevuto in input al nodo
            q.next = null; // assegno il valore null come prossimo nodo

            if (testa == null) {
                testa = q;  // se la testa è vuota assegno il nodo creato alla testa
            } else {
                Nodo n = testa; // altrimenti creo un nodo n e lo assegno alla testa
                while (n.next != null) {
                    n = n.next; // finchè il prossimo nodo non è null assegno il prossimo nodo a n
                }
                n.next = q; // quando il prossimo nodo è null assegno il nodo creato a n
            }
        }
    }

    public void show() {
        Nodo node = testa;
        System.out.print("La lista è attualmente composta da:\n");
        do {
            System.out.println(node.data);
            node = node.next;
        }while (node != null);
    }

    public void kmMediPerTipoVeicolo(){

        System.out.println("");
        System.out.println("Calcolo la media dei km percorsi per tipo di veicolo...");

        int countDrone = 0;
        int countAutomobile = 0;
        int sommaKmDrone = 0;
        int sommaKmAutomobile = 0;

        float mediaKmDrone = 0;
        float mediaKmAutomobile = 0;

        Nodo node = testa;

        while(node != null){
            if(node.data instanceof Drone){
                countDrone++;
                sommaKmDrone += node.data.getKmPercorsi();
            } else if (node.data instanceof Automobile){
                countAutomobile++;
                sommaKmAutomobile += node.data.getKmPercorsi();
            }
            node = node.next; // Move to the next node only once per loop iteration
        }

        mediaKmDrone = sommaKmDrone/countDrone;
        mediaKmAutomobile = sommaKmAutomobile/countAutomobile;

        if(countDrone > 0){
            System.out.println("Il numero di droni è: " + countDrone + " \n\tla media dei km percorsi è: " + mediaKmDrone);
        } else {
            System.out.println("Non ci sono droni nella lista");
        }
        if(countAutomobile > 0){
            System.out.println("Il numero di automobili è: " + countAutomobile + "\n\te la media dei km percorsi è: " + mediaKmAutomobile );
        } else {
            System.out.println("Non ci sono automobili nella lista");
        }
    }

    public void inserisciConOrdine(VeicoloAutonomo elem){

        System.out.println("\nLista prima dell'inserimento con ordine:");
        show();

        Lista listaTemp = new Lista();
        listaTemp.append(elem);

        Nodo temp = testa;
        while(temp != null){
            if(temp.data.compareTo(elem) < 0){
                listaTemp.append(temp.data);
                temp = temp.next;
            }else{
                listaTemp.push(temp.data);
                temp = temp.next;
            }
        }
        System.out.println("\nLista dopo dell'inserimento con ordine:");
        listaTemp.show();
    }
}