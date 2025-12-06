package exercícios

class ContainsDuplicate

fun containsDuplicate(nums: IntArray): Boolean {
    val set = HashSet<Int>()

    for (n in nums) {
        if (n in set) return true
        set.add(n)
    }
    return false
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    println("Contém duplicata? ${containsDuplicate(nums)}")
}
