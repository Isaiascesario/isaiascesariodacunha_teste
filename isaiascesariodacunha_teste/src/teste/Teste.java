package teste;

import java.util.List;
import java.util.Random;

import dao.ClienteDao;
import isaiascesariodacunha_teste.Cliente;

public class Teste {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		Random rd = new Random();
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"452.666.999.99","Joao",1,(rd.nextDouble()*1000)+500));	
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"452.666.999.99","Maria",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"452.858.989.99","Jose",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"452.777.959.99","Julio",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"452.666.929.99","Isaias",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"452.666.919.99","Felipe",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"455.666.999.99","Diogo",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"453.666.999.99","Natalia",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"451.666.999.99","Luzia",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"450.666.999.99","Elias",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"052.666.999.99","Eduardo",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"252.666.999.99","Pedro",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"152.666.999.99","Antonio",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"352.666.999.99","Carlos",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"552.666.999.99","Thiago",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"852.666.999.99","Kelvin",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"552.666.999.99","Gabriela",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"582.666.999.99","Tamiris",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"652.666.999.99","Taina",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"952.666.999.99","Joao Pedro",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"202.666.999.99","Francisco",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"050.666.999.99","Israel",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"492.666.999.99","Eliane",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"402.666.999.99","Izabelle",1,(rd.nextDouble()*1000)+500));
		dao.adiciona(new Cliente(rd.nextInt(2000)+1200,"122.666.999.99","Eliza",1,(rd.nextDouble()*1000)+500));
		List<Cliente> clientes = dao.getLista();
		int i=1;
		double media=0;
		for (Cliente cliente : clientes) {
			media += cliente.getVlTotal();
			i++;
			System.out.println(cliente);
		}
		System.out.printf("Media Final = %.2f",media/i);
	}

}
