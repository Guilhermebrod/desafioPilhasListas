package desafioLaboratorio2Etapa3;

public class Etapa3 {
	
	public Etapa3() {
		
	}
	
	public boolean checkBrackets(Stack<Character> s1) {
		
		//sempre que é lido um character '(' a variavel var é incrementada. quando ')' é decrementada
		//se em qualquer momento var é negativo é porque não está correta a escrita
		//se no final do for var é igual a zero quer dizer que sempre que foi aberto parenteses, foi fechado parenteses
		int var = 0;
		
		for(int i = s1.numElements()-1; i >= 0; i--) {
			
			if(s1.get(i) == '(') {
				
				var += 1;
						
			}
			
			if(s1.get(i) == ')') {
				
				var -= 1;
				
			}
			
			if(var < 0) {
				
				return false;
				
			}
			
		}
		
		if(var == 0) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
}
