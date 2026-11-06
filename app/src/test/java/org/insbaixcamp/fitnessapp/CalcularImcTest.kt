package org.insbaixcamp.fitnessapp

import org.insbaixcamp.fitnessapp.tools.CalcularImc
import org.junit.Assert.*
import org.junit.Test

class CalcularImcTest {
    @Test
    fun calcularImcPesNormal(){
        val pesActual = 70.0
        val altura = 170
        val imc= CalcularImc.calcularImc(pesActual, altura)
        assertEquals(24.22, imc, 0.1)
    }
}