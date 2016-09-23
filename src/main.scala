object main {
  def main(args: Array[String]): Unit = {

    println("Hello world :)!")

    var found_key = false
    var game_won = false

    while (true) {

      if (!found_key) {
        val success = do_action_without_key()

        if (success) {
          found_key = true
        }
      }
      else {
        val success = do_action_with_key()

        if (success) {
          game_won = true
        }
      }

      if (found_key && game_won) {
        print("You won!!")
        return
      }
    }
  }

  def do_action_without_key(): Boolean = {

    println("(1) Open door")
    println("(2) Pick up key")
    val ln = scala.io.StdIn.readLine()

    if (ln == "1") {
      println("You failed to open the door!")
      false
    }
    else if (ln == "2") {
      println("The key was successfully picked up")
      true
    }
    else {
      println("Do something sensible!")
      false
    }
  }

  def do_action_with_key():Boolean = {

    println("(1) Open door")
    println("(2) Look for another key")

    val ln = scala.io.StdIn.readLine()

    if (ln == "1") {
      println("You succeeded in opening the door!")
      true
    }
    else if (ln == "2") {
      println("No more keys!")
      false
    }
    else {
      println("Do something sensible!")
      false
    }
  }
}






