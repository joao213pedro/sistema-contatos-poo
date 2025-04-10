package br.ceub.contacts;

public class Contact {
	private String name;
	private String phoneNumber;
	private String email;
	
	public Contact(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getemail() {
		return email;
	}
	
	public String toString() {
		return "Nome:" + name + ", Telefone: " +phoneNumber+ ", Email: " +email;
	}
    // Declare as variáveis para armazenar o nome, telefone e email do contato.

    // Implemente um construtor para inicializar as variáveis com os valores passados como parâmetros.

    // Adicione métodos "getter" para acessar o valor de cada variável (nome, telefone e email).

    // Crie o método toString() para retornar uma string formatada com as informações do contato.
}

