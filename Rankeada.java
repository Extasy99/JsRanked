import javax.swing.JOptionPane;

public class Rankeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vitorias, derrotas, saldo;
		String resultado;
		
		vitorias = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero de vitorias"));
		derrotas = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero de derrotas"));
		saldo = vitorias - derrotas;
		
		if (saldo >= 10){
			resultado = "O jogador é Ferro";			
		} 
		else if	(saldo >= 11 && saldo <= 20){
			resultado = "O jogador é Bronze";
		}
		else if (saldo >= 21 && saldo <= 30){
			resultado = "O jogador é Prata";
		}
		else if (saldo >= 31 && saldo <= 40){
			resultado = "O jogador é Ouro";
		}
		else if (saldo >= 41 && saldo <= 50){
			resultado = "O jogador é Platina";
		}
		else if (saldo >= 51 && saldo <= 60){
			resultado = "O jogador é Diamante";
		}
		else if (saldo >= 61 && saldo <= 70){
			resultado = "O jogador é Ascendent";
		}
		else if (saldo >= 71 && saldo <= 80){
			resultado = "O jogador é Imortal";
		}
		else if (saldo >= 81 && saldo <= 90){
			resultado = "O jogador é Radiante";
		} else {
			resultado = "Valor invalido";
			
	}
		JOptionPane.showMessageDialog(null, resultado);

}
}
