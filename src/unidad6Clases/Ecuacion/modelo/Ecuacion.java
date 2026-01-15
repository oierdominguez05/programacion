package unidad6Clases.Ecuacion.modelo;

public class Ecuacion {

	public class EcuacionSegundoGrado {

		private double a;
		private double b;
		private double c;

		public EcuacionSegundoGrado(double a, double b, double c) {
			if (a == 0) {
				throw new IllegalArgumentException(
						"El coeficiente 'a' no puede ser 0 en una ecuación de segundo grado.");
			}
			this.a = a;
			this.b = b;
			this.c = c;
		}

		public void setA(double a) {
			if (a == 0) {
				throw new IllegalArgumentException("El coeficiente 'a' no puede ser 0.");
			}
			this.a = a;
		}

		public void setB(double b) {
			this.b = b;
		}

		public void setC(double c) {
			this.c = c;
		}

		public double getDiscriminante() {
			return b * b - 4 * a * c;
		}

		public boolean esDiscriminantePositivo() {
			return getDiscriminante() >= 0;
		}

		public double[] getSoluciones() {
			double disc = getDiscriminante();

			if (disc < 0) {
				return new double[0];
			}

			double x1 = (-b + Math.sqrt(disc)) / (2 * a);
			double x2 = (-b - Math.sqrt(disc)) / (2 * a);

			return new double[] { x1, x2 };
		}

	}

}
