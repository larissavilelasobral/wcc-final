fun main(args: Array<String>) {
    println("Hello World!")

    val numero = 1_000_00
    val texto = "Olá, como vocês estão?"
    val caractere = 'A'
    val numeroComTipo: Int = 46584

    println("numero: " + numero + numeroComTipo)
    println("texto: $texto")
    println("${texto::class.simpleName}")
    println("caractere: " + caractere)
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}