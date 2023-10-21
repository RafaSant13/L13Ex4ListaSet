package view;

import set.model.Set;

public class Principal {

	public static void main(String[] args) throws Exception {
		Set<Integer> s = new Set<Integer>();
			s.addFirst(1);
			s.addFirst(2);
			s.addLast(3);
			s.addLast(3);
			s.addFirst(1);
			s.add(2, 0);

		int tamanho = s.size();
		for (int i = 0; i<tamanho; i++) {
			try {
				int a = s.get(i);
				System.out.print(a + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
