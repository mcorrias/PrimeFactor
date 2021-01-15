package primeFactors

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test


class PrimeFactorsTest{

    @Test
    fun testPrimeFactor(){
        assertThat(mutableListOf(1), `is`(primeFactorsOf(1)))
        assertThat(mutableListOf(2), `is`(primeFactorsOf(2)))
        assertThat(mutableListOf(3), `is`(primeFactorsOf(3)))
        assertThat(mutableListOf(2,2), `is`(primeFactorsOf(4)))
    }

    private fun primeFactorsOf(n : Int): MutableList<Int>{
        val factors = mutableListOf<Int>()
        val divider = 2

        if(n % divider == 0 && n > divider){
            factors.add(divider)
            factors.add(divider)
        }else{
            factors.add(n)
        }

        return factors
    }
}