
public class MergeSort {

	public int[] Divide(int v[], int inicio, int fim) {

		if (v != null & inicio < fim && inicio >= 0 && fim <= v.length && v.length != 0) {

			int meio = (inicio + fim) / 2;

			this.Divide(v, inicio, meio);
			this.Divide(v, meio + 1, fim);
			this.JuntaOrdenando(v, inicio, meio, fim);

		}

		return v;

	}

	public int[] JuntaOrdenando(int v[], int inicio, int meio, int fim) {

		int x;
		int i;
		int j;
		int k;

		if ((fim - (inicio - 1)) >= 1) {
		
			int w[] = new int[v.length];

			x = 0;
			for (i = 0; i < v.length; i++) {
				w[x] = v[i];
				x++;
			}
			
			i = inicio;
			j = meio+1;
					
			while (i <= meio && j <= fim) {
				for (k = inicio; k <= fim; k++) {

					if (i > meio) {
						v[k] = w[j];
						j++;
					}

					else if (j > fim) {
						v[k] = w[i];
						i++;
					}

					else if (w[i] < w[j]) {
						v[k] = w[i];
						i++;
					}

					else {
						v[k] = w[j];
						j++;
					}

				}

			}

		}

		return v;

	}

}
