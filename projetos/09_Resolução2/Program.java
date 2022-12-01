
public class Program {

	public static void main(String[] args) {
		
		Vetor lista = new Vetor();  // definimos na classe Vetor inicializar vetor com 3 posi��es
		
		Aluno a1 = new Aluno("Dory");
		Aluno a2 = new Aluno("Carol");
		Aluno a3 = new Aluno("Jo�o");
		Aluno a4 = new Aluno("Thiago");
		Aluno a5 = new Aluno("Pedro");
		Aluno a6 = new Aluno("Maria");
		Aluno a7 = new Aluno("Silvia");
		Aluno a8 = new Aluno("Natalia");
	
		System.out.println("-- Teste 1 Verificar a quantidade de alunos na lista --");
		lista.adiciona(a1);
		lista.adiciona(a2);
		System.out.println( lista.toString() );
		System.out.println("Total: " +  lista.tamanho() );
		
		
		System.out.println("\n-- Teste 2 Verificar o aumento do tamanho do vetor --");
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);
		System.out.println( lista.toString() );
		System.out.println("Total: " +  lista.tamanho() );
		
		System.out.println("\n-- Teste 3 Incluir aluno no final e Incluir aluno indicando posi��o --");
		lista.adiciona(a6);
		lista.adiciona(3, a7);
		System.out.println( lista.toString() );	
		System.out.println("Total: " +  lista.tamanho() );
		
		System.out.println("\n-- Teste 3 Verificar se aluno existe na lista --");
		System.out.println("Cont�m o aluno 7: " + lista.contem(a7));
		System.out.println("Cont�m o aluno 8: " + lista.contem(a8));
		
		System.out.println("\n-- Teste 4 Remover aluno da posi��o indicada --");
		lista.remove(4);
		System.out.println( lista.toString() );
		System.out.println("Total: " +  lista.tamanho() );

	}

}
