package mastermind.model

abstract class Peg {
    val color: String
    val hexValue: String
}

// Different colored Pegs inherit abstract class Peg
class PegRed extends Peg{
   val color = "red"
   val hexValue = "#ff0000"
}

class PegBlue extends Peg{
   val color = "blue"
   val hexValue = "#0000ff"
}

class PegPink extends Peg{
   val color = "pink"
   val hexValue = "#ff26e7"
}

class PegGreen extends Peg{
   val color = "green"
   val hexValue = "#27ff37"
}

class PegOrange extends Peg{
   val color = "orange"
   val hexValue = "#f28c28"
}

class PegBlack extends Peg{
   val color = "black"
   val hexValue = "#000000"
}

class PegYellow extends Peg{
   val color = "yellow"
   val hexValue = "#ffee22"
}

class PegGrey extends Peg{
    val color = "grey"
    val hexValue = "#808080"
}

class PegWhite extends Peg{
    val color = "white"
    val hexValue = "#ffffff"
}