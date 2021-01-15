package primeFactors

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test


class PrimeFactorsTest {

    @Test
    fun testPrimeFactor() {
        assertThat(mutableListOf(1), `is`(primeFactorsOf(1)))
        assertThat(mutableListOf(2), `is`(primeFactorsOf(2)))
        assertThat(mutableListOf(3), `is`(primeFactorsOf(3)))
        assertThat(mutableListOf(2, 2), `is`(primeFactorsOf(4)))
        assertThat(mutableListOf(5), `is`(primeFactorsOf(5)))
        assertThat(mutableListOf(2, 3), `is`(primeFactorsOf(6)))
        assertThat(mutableListOf(7), `is`(primeFactorsOf(7)))
        assertThat(mutableListOf(2, 2, 2), `is`(primeFactorsOf(8)))
        assertThat(mutableListOf(3, 3), `is`(primeFactorsOf(9)))
        assertThat(mutableListOf(2, 5), `is`(primeFactorsOf(10)))
        assertThat(mutableListOf(11), `is`(primeFactorsOf(11)))
        assertThat(mutableListOf(2,2,3), `is`(primeFactorsOf(12)))
        assertThat(mutableListOf(2,3,5), `is`(primeFactorsOf(30)))
        assertThat(mutableListOf(2,3,7), `is`(primeFactorsOf(42)))
        assertThat(mutableListOf(2,2,2,3,3,3,7), `is`(primeFactorsOf(2*2*2*3*3*3*7)))

    }

    private fun primeFactorsOf(n: Int): MutableList<Int> {
        val factors = mutableListOf<Int>()
        var reminder = n

        for (divider in 2..n){
            while (reminder.isMultipleOf(divider)) {
                reminder /= divider
                factors.add(divider)
            }
        }

        factors.add(reminder)

        return factors
    }

    private fun Int.isMultipleOf(divider: Int) = this % divider == 0 && this > divider
}