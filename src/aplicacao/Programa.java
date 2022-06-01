package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidade.Empregado;
import Entidade.EmpregadoTercerizado;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.println("Entre com o numero de Empregados ");
		int n = sc.nextInt();
		
		for (int  i=1; i<=n; i++ ) {
			System.out.println(" Empregado " + i + " Data ");
			System.out.println("Tercerizado (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.println("Nome ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Horas ");
			int horas = sc.nextInt();
			System.out.println("Valor por Horas ");
			double valorPorHoras = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.println("Cobrança adicional");
				double cobrancaAdicional = sc.nextDouble();
				Empregado emp = new EmpregadoTercerizado(nome, horas, valorPorHoras, cobrancaAdicional );
				list.add(emp);
			}
			else {
				Empregado emp = new Empregado(nome, horas, valorPorHoras);
				list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println(" Pagamentos ");
		for(Empregado emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f" , emp.FormaDePagamento()));
			
		}
		sc.close();
	}
}