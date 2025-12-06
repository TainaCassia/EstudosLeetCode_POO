package exercícios

class ValidPalindro {

    fun isValidPalindrome(s: String): Boolean {
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
}

fun main() {
    val v = ValidPalindro()
    println(v.isValidPalindrome("A man, a plan, a canal: Panama"))
}
