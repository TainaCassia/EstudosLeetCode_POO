package exercícios

fun isPalindrome(s: String): Boolean {
    val chars = s.filter { it.isLetterOrDigit() }.lowercase()

    var left = 0
    var right = chars.length - 1

    while (left < right) {
        if (chars[left] != chars[right]) return false
        left++
        right--
    }

    return true
}

fun main() {
    val entrada = "A man, a plan, a canal: Panama"
    println(isPalindrome(entrada))
}
