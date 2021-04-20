package Pokers;

public class Application {
	public static void main(String[] args) {
		String[] d = new String[]{"heart","block","flower","spade"};
		String[] s = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		Pokers[][] pk = new Pokers[4][13];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				pk[i][j] = new Pokers(s[j],d[i]);
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				pk[i][j].get();
			}
			System.out.println();
		}

	}
}
