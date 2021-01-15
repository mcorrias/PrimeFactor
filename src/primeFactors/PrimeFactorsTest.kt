package primeFactors


import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class PrimeFactorsTest {
    @Test
    fun factors() {
        assertThat(factorsOf(1), `is`(emptyList()))
        assertThat(factorsOf(2), `is`(listOf(2)))
        assertThat(factorsOf(3), `is`(listOf(3)))
        assertThat(factorsOf(4), `is`(listOf(2, 2)))
        assertThat(factorsOf(5), `is`(listOf(5)))
        assertThat(factorsOf(6), `is`(listOf(2,3)))
        assertThat(factorsOf(7), `is`(listOf(7)))
        assertThat(factorsOf(8), `is`(listOf(2,2,2)))
        assertThat(factorsOf(9), `is`(listOf(3,3)))
        assertThat(factorsOf(2*2*2*3*5*7*11), `is`(listOf(2,2,2,3,5,7,11)))

    }

    private fun factorsOf(n: Int): List<Int> {
        val factors = mutableListOf<Int>()
        var remainder = n
        var divisor = 2

        while (remainder > 1) {

            while (remainder % divisor == 0) {
                factors.add(divisor)
                remainder /= divisor
            }
            divisor++
        }

        return factors
    }
}