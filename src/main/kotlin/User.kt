import java.lang.ArithmeticException
import java.lang.Exception

class User{

     var name = ""
     var height = 0.0
     var weight = 0.0
     var onDiet = false

     // 1st method using weight
     fun weightTimesConstant(): Double {
          var weightTimesConstant = weight * 703.07
          return weightTimesConstant
     }

     // 1st method using height
     fun heightSquared(): Double {
          var heightSquared = height * height
          return heightSquared
     }

     fun calculateBMI(): Double {
          var bmi = 1.0
          try {
                bmi= weightTimesConstant() / heightSquared()

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


