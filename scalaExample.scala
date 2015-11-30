import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
import java.util.Scanner


object Dojo{
	def main(args: Array[String]) {

		val scanner = new java.util.Scanner(System.in)
		println("Escriba su nombre")
		val nombre = scanner.nextLine()
		
		println("Bienvenido " + nombre+ " Hoy Es \n")
    		val ahora = new Date
    		val df = getDateInstance(LONG, Locale.ROOT)
    		println(df format ahora)
	
	}
}