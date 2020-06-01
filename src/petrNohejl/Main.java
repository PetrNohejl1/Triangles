package petrNohejl;

public class Main {

	public static void main(String[] args) {

		try {

			Triangles t = Triangles.factoryTriangles(2,2,2,9);

			System.out.println(t);
			
		} catch (TrianglesException e) {
			System.err.println(e.getMessage());

		}
	}

}