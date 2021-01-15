package primeFactors

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test


class PrimeFactorsTest{

    @Test
    fun testPrimeFactor(){
        assertThat(mutableListOf(1), `is`(primeFactorsOf(1)))
    }

    private fun primeFactorsOf(n : Int): MutableList<Int>{
        return mutableListOf(1)
    }
}