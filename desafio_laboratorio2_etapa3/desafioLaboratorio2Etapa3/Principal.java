package desafioLaboratorio2Etapa3;

public class Principal {

	public static void main(String[] args) {
		
		//declaração da lista
		List<String> lista = new StaticList<String>(3);
		
		//teste com duas variaveis iguais e uma diferente
		lista.insert("a", 0);
		lista.insert("b", 1);
		lista.insert("a", 2);
		
		System.out.println(lista.contaElementos("a"));
		System.out.println(lista.contaElementos("b"));
		
		//declaração da pilha
		Stack<Character> pilha = new StaticStack<Character>(20);
		
		//expressao (A+B) empilhada da direita para a esquerda
		pilha.push('(');
		pilha.push('B');
		pilha.push('+');
		pilha.push('A');
		pilha.push(')');

		Etapa3 etapa3 = new Etapa3();
		
		if(etapa3.checkBrackets(pilha)) {
			
			System.out.println("A expressao esta correta.");
			
		}
		
		else {
			
			System.out.println("A expressao esta errada.");
		}
		
	}

}
