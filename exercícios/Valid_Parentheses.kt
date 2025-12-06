package exercícios

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()

    val mapa = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (c in s) {
        if (c in mapa.values) {
            stack.addLast(c)
        } else if (c in mapa.keys) {
            if (stack.isEmpty() || stack.removeLast() != mapa[c]) {
                return false
            }
        }
    }

    return stack.isEmpty()
}

fun main() {
    val entrada = "(){}[]"
    val resultado = isValid(entrada)

    println("A string \"$entrada\" é válida? $resultado")
}
