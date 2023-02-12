public class App {
	public static void main(String[] args) throws Exception {
		// Vous pouvez tester votre code ici!

		Node premier = new Node(2);
		premier.addValue(5);
		premier.addValue(4);
		System.out.println("Test addValue()");

		premier.print();
		System.out.println("Test addNode()");
		// erreur si tu fait deuxieme new node (3,premier)
		Node deuxieme = new Node(3);
		deuxieme.addValue(5);
		// deuxieme.print();
		premier.addNode(deuxieme);
		premier.print();

		System.out.println("Test  removeLast()");
		Node troisieme = new Node(8);
		troisieme.addValue(4);
		troisieme.removeLast();
		troisieme.print();

		System.out.println("Test  removeValue()");
		premier.removeValue(5);
		premier.print();

		System.out.println("length_iteratif() et length_recurssion()");
		Node quatrieme = new Node(10);
		System.out.println(quatrieme.length_iteratif());
		System.out.println(premier.length_iteratif());
		System.out.println(quatrieme.length_recurssion());
		System.out.println(premier.length_recurssion());

		System.out.println("returnNlast()");
		System.out.println(premier.returnNlast(1));
	}
}
