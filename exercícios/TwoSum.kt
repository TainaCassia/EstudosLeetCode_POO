package exercícios

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        nums.forEachIndexed { index, num ->
            val complemento = target - num

            if (map.containsKey(complemento)) {
                return intArrayOf(map[complemento]!!, index)
            }

            map[num] = index
        }

        return intArrayOf()
    }
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val solver = TwoSum()
    val resultado = solver.twoSum(nums, target)

    println("Índices encontrados: ${resultado.joinToString()}")
}
