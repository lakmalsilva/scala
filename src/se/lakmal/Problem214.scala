/**
 * 
 */
package se.lakmal
import scala.math

/**
 * @author Lakmal
 *
 */
object Problem314 {
	def main(args: Array[String]) {

		var length : Double = 500
				var radius : Double = length/2
				var ratio  : Double = 0.0

				var area : Double = (22/7 * radius * radius)
				var wallLength : Double = (22/7 * 2 * radius)

				var stoplimit : Double = math.sqrt(2*radius*radius) - radius
				println("stop lmi: " + stoplimit)
				var startlimit : Double = 0
				var triangle_length : Double = 0
				var maxratio : Double = 0

				triangle_length = 0;

				while (math.sqrt(2*radius*radius) >= startlimit) {
				  println(triangle_length)
					area = (length * length) - (4 * triangle_length * triangle_length/2)
							var middleleg : Double = math.sqrt(2*triangle_length*triangle_length)
							wallLength = (4*length) +  (4*middleleg) - (4 * 2 * triangle_length)
							triangle_length = triangle_length + 1

							startlimit =  (math.sqrt(2*triangle_length*triangle_length)/2)

							ratio = area/wallLength

							if(ratio > maxratio){
								maxratio = ratio
										println(maxratio)
							}

				}
				
	}
}