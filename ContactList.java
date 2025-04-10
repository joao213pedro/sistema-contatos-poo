package br.ceub.contacts;

public class ContactList {
    private Node head;

    public ContactList() {
        this.head = null;
    }

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        System.out.println("Contato adicionado com sucesso!");
    }

    public Node searchContact(String nameOrPhone) {
        Node current = head;
        while (current != null) {
            if (current.getContact().getName().equals(nameOrPhone) ||
                current.getContact().getPhoneNumber().equals(nameOrPhone)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean removeContact(String nameOrPhone) {
        if (head == null) return false;

        if (head.getContact().getName().equals(nameOrPhone) ||
            head.getContact().getPhoneNumber().equals(nameOrPhone)) {
            head = head.getNext();
            return true;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getContact().getName().equals(nameOrPhone) ||
                current.getNext().getContact().getPhoneNumber().equals(nameOrPhone)) {
                current.setNext(current.getNext().getNext());
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void listContacts() {
        if (head == null) {
            System.out.println("Nenhum contato encontrado.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.getContact());
            current = current.getNext();
        }
    }
}
	
	 // Declare uma variável para representar o primeiro nó (head) da lista encadeada.

    // Implemente o método addContact(Contact contact) para adicionar um novo contato ao final da lista.

    // Implemente o método searchContact(String nameOrPhone) para buscar um contato pelo nome ou número de telefone.

    // Implemente o método removeContact(String nameOrPhone) para remover um contato pelo nome ou número de telefone.

    // Implemente o método listContacts() para exibir todos os contatos armazenados na lista.
