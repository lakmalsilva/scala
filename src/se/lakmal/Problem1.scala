/**
 * 
 */
package se.lakmal

/**
 * @author Lakmal
 *
 */
object Problem1 {
	def main(args: Array[String]) {
		var myVar : Int = 0;
	var mySum : Int = 0;

	while (myVar < 1000) {
		if(myVar%3==0 || myVar%5==0) {
			mySum = mySum + myVar
		}
		myVar=myVar+1
	}
	print("Problem1 answer is : " + mySum)
	}
}