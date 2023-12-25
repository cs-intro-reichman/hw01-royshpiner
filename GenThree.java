/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int  a = Integer.parseInt(args[0]);
		int  b = Integer.parseInt(args[1]);
		int  c = (int)(((b-a) * Math.random()) + a);    // creates random num between [a,b)
		int  d = (int)(((b-a) * Math.random()) + a);
		int  e = (int)(((b-a) * Math.random()) + a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		if ( c<d && c<e){  //if c min
		System.out.println("The minimal generated number was "+ c);
		}
		if ( d<c && d<e){  //if d min
		System.out.println("The minimal generated number was "+ d);
		}
		if ( e<c && e<d){   //if e min
		System.out.println("The minimal generated number was "+ e);
		}
	}
}
