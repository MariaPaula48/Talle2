package taller2;

import javax.swing.JOptionPane;

public class ClaseMain {

	public static void main(String[] args) {
		
		PimerPunto calcular = new PimerPunto();
		SegundoPunto ecuaciones = new SegundoPunto;
		
		int menu;
		int menuPuntoDos;
		menu=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del punto al que quiere ingresar: \n 1. punto 1\n 2. punto 2\ n3. punto 3"));
		switch (menu)) {
		case 1: {
			calcular.calcularArea();
			yield type;
		}
			case 2: {
				menuPuntoDos=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del punto al que quiere ingresar: \n punt a\n 2.punto b\ n3.punto c"
						+ "\n4.punto d \n5.punto e \n6.punto f"));
				switch (menuPuntoDos) {
				case 1: {
					
					yield type;
				}
                case 2: {
					
					yield type;
				}
                case 3: {
					
					yield type;
                }
				default:
					throw new IllegalArgumentException("Unexpected value: " + menuPuntoDos);
				}
			}
		}
				yield type;	
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + );
		}
		calcular.calcularArea();
		
	}
	
   
}
