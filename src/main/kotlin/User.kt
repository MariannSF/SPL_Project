import java.lang.ArithmeticException
import java.lang.Exception

class User{

     var name = ""
     var height = 0.0
     var weight = 0.0
     var onDiet = false



     fun calculateBMI(): Double {
          var bmi = 1.0
          try {
                bmi= (weight* 703.07) /  (height * height)

          }catch (e: Exception){
               println("Divide by zero not allowed")
          }

          return bmi

     }
     fun result(): Char {

          var ch: Char = if(calculateBMI() < 18.5) {
               'U'
          } else if(calculateBMI()<25) {
               'N'
          } else {
               'O'
          }
          return ch
     }

     override fun toString(): String {
          return "User(name='$name', height=$height, weight=$weight, onDiet=$onDiet)"
     }
}


