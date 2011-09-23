/**
 * 
 */
package se.lakmal

/**
 * @author Lakmal
 *
 */
object Problem2 {
	def main(args: Array[String]) {

		def fib( n : Int): Int = n match {

		case 0 | 1 => n
		case _ => fib( n -1  ) + fib( n-2)
		
		}
		
		print(fib(5))
		
	}
}