import java.lang.ArithmeticException
import java.lang.Exception

class User{

     var name = ""
     var height = 0.0
     var weight = 0.0
     var onDiet = false
     private val bmiConstant : Int = 703

     fun setOnDiet(): Boolean{
          return onDiet
     }

     // 1st method using weight
     fun weightTimesConstant(): Double {
          val weightTimesConstant = weight * bmiConstant
          return weightTimesConstant
     }

     // 1st method using height
     fun heightSquared(): Double {
          val heightSquared = height * height
          return heightSquared
     }

     fun calculateBMI(): Double {
          var bmi = 1.0
          try {
                bmi= weightTimesConstant() / heightSquared()

          }catch (e: ArithmeticException){
               println("Divide by zero not allowed")
          }

          return bmi

     }
     fun result(): Char {

          val ch: Char = if(calculateBMI() < 18.5) {
               'U' //under weight
          } else if(calculateBMI()<25) {
               'N' //normal weight
          } else {
               'O' //over weight
          }
          return ch
     }

     override fun toString(): String {
          return "User(name='$name', height=$height, weight=$weight, onDiet=$onDiet)"
     }
}


