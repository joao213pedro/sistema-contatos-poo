package br.ceub.contacts;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
    	ContactList contactList = new ContactList();
    	Scanner scanner = new Scanner(System.in);
    	
    	while (true) {
    		System.out.println("\nMenu:");
    		System.out.println("1. Adicionar Contato");
    		System.out.println("2. Buscar Contato");
    		System.out.println("3. Remover Contato");
    		System.out.println("4. Listar Contato");
    		System.out.println("5. Sair");
    		int choice = scanner.nextInt();
    		scanner.nextLine(); //Consumir nova linha
    		
    		switch (choice) {
    		case 1: 
    			System.out.print("Digite o nome: ");
    			String name = scanner.nextLine();
    			System.out.print("Digite o número de telefone: ");
    			String phoneNumber = scanner.nextLine();
    			System.out.print("Digite o e-mail: ");
    			String email = scanner.nextLine();
    			contactList.addContact(new Contact(name, phoneNumber, email));
    			break;
    			
    		case 2:
                System.out.print("Digite o nome ou telefone do contato: ");
                String searchTerm = scanner.nextLine();
                Node foundContact = contactList.searchContact(searchTerm);
                if (foundContact != null) {
                    System.out.println("Contato encontrado: " + foundContact.getContact());
                } else {
                    System.out.println("Contato não encontrado.");
                }
                break;
                
    		case 3:
                System.out.print("Digite o nome ou telefone do contato para remover: ");
                String removeTerm = scanner.nextLine();
                if (contactList.removeContact(removeTerm)) {
                    System.out.println("Contato removido com sucesso!");
                } else {
                    System.out.println("Contato não encontrado.");
                }
                break;
                
    		case 4:
                contactList.listContacts();
                break;

            case 5:
                System.out.println("Encerrando...");
                scanner.close();
                return;

            default:
                System.out.println("Opção inválida!");
        }
    }
}

    	
    	 // Crie uma instância de ContactList para gerenciar os contatos.

        // Use a classe Scanner para capturar entradas do usuário.

        // Implemente um loop para exibir um menu de opções para o usuário: adicionar, buscar, remover ou listar contatos.

        // Baseado na escolha do usuário, chame o método correspondente da ContactList.

        // Não se esqueça de fechar o Scanner ao final do programa.
}

